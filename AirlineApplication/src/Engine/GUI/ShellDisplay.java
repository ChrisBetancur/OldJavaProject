package Engine.GUI;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import static org.jdesktop.swingx.autocomplete.AutoCompleteDecorator.decorate;

public class ShellDisplay {
    private JTextField bar;
    private Dimension searchBarSize;

    private JTextPane history;

    private JLabel lblSearchBar;
    private JButton btnSearch;

    private int xPos;
    private int yPos;

    public ShellDisplay(JFrame frame, int width, int height) {
        bar = new JTextField("Hello");
        searchBarSize = new Dimension(width, height);
        history = new JTextPane();
        history.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }
        });

        frame.add(history);
        frame.add(bar);
    }

    public void setLocation(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        bar.setBounds(xPos, yPos, searchBarSize.width, searchBarSize.height);
        history.setBounds(xPos, yPos - 100, searchBarSize.width, searchBarSize.height + 100);
    }
}
