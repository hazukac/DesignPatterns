import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField clock = new TextField(60);
    private TextArea screen = new TextArea(10, 60);
    private Button   btnUse = new Button("金庫使用");
    private Button btnAlarm = new Button("非常ベル");
    private Button btnPhone = new Button("通常電話");
    private Button  btnExit = new Button("終了");

    // private State currentState = DayState.getInstance();
    private State currentState = (State)NightState.getInstance();

    public SafeFrame(String title) {
        super(title);
        this.setBackground(Color.lightGray);
        this.setLayout(new BorderLayout());

        this.add(this.clock, BorderLayout.NORTH);
        this.clock.setEditable(false);

        this.add(this.screen, BorderLayout.CENTER);
        this.screen.setEditable(false);

        Panel panel = new Panel();
        panel.add(this.btnUse);
        panel.add(this.btnAlarm);
        panel.add(this.btnPhone);
        panel.add(this.btnExit);
        this.add(panel, BorderLayout.SOUTH);

        this.pack();
        // this.show();
        this.setVisible(true);

        this.btnUse.addActionListener(this);
        this.btnAlarm.addActionListener(this);
        this.btnPhone.addActionListener(this);
        this.btnExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.btnUse) {
            this.currentState.doUse(this);
        } else if (e.getSource() == this.btnAlarm) {
            this.currentState.doAlarm(this);
        } else if (e.getSource() == this.btnPhone) {
            this.currentState.doPhone(this);
        } else if (e.getSource() == this.btnExit) {
            System.exit(0);
        } else {
            System.out.println("????");
        }
    }

    public void setClock(int hour) {
        String clockstring = "現在時刻は";
        if (hour < 10) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }
        this.clock.setText(clockstring);
        this.currentState.doClock(this, hour);
    }
    public void changeState(State state) {
        System.out.println("state has changed to " + state);
        this.currentState = state;
    }
    public void callSecurityCenter(String msg) {
        this.screen.append("Call! " + msg + "\n");
    }
    public void recordLog(String msg) {
        this.screen.append("Log.. " + msg + "\n");
    }
}