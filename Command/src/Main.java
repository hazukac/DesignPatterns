import command.*;
import drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");
    public Main(String title) {
        super(title);
        this.addWindowListener(this);
        this.canvas.addMouseMotionListener(this);
        this.clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(this.clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(this.canvas);
        this.getContentPane().add(mainBox);

        this.pack();
        this.setVisible(true);
    }

    // for ActionListener
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == this.clearButton) {
            this.history.clear();
            this.canvas.repaint();
        }
    }
    // for MouseMotionListener
    public void mouseMoved(MouseEvent ev) {
        // do nothing
    }
    public void mouseDragged(MouseEvent ev) {
        Command cmd = new DrawCommand(this.canvas, ev.getPoint());
        this.history.append(cmd);
        cmd.execute();
    }
    // for WindowListener
    public void windowClosing(WindowEvent ev) {
        System.exit(0);
    }
    public void windowActivated(WindowEvent ev) {}
    public void windowClosed(WindowEvent ev) {}
    public void windowDeactivated(WindowEvent ev) {}
    public void windowDeiconified(WindowEvent ev) {}
    public void windowIconified(WindowEvent ev) {}
    public void windowOpened(WindowEvent ev) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}