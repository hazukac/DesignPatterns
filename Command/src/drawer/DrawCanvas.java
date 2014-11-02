package drawer;

import command.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;
    public DrawCanvas(int width, int height, MacroCommand history) {
        this.setSize(width, height);
        this.setBackground(Color.white);
        this.history = history;
    }
    public void paint(Graphics g) {
        this.history.execute();
    }
    public void draw(int x, int y) {
        Graphics g = this.getGraphics();
        g.setColor(this.color);
        g.fillOval(x - this.radius, y - this.radius, radius * 2, radius * 2);
    }
}