package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerTest extends JFrame {
    public ListenerTest() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500, 400);
        setSize(300, 300);
        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JTextArea txt = new JTextArea();
        JButton btn = new JButton();
        JCheckBox chk = new JCheckBox("in upper case");
        JLabel lbl = new JLabel();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e);
            }
        });
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int symbolCount = txt.getText().length();
                lbl.setText(String.valueOf(symbolCount));
            }
        });
        chk.addActionListener(actionEvent -> {
            lbl.setText("");
            System.out.println(chk.isSelected());
            System.out.println(actionEvent.paramString());
        });
        btn.addActionListener(action -> {
            if (chk.isSelected()) {
                lbl.setText(txt.getText().toUpperCase());
            } else {
                lbl.setText(txt.getText());
            }
        });
        panel.add(txt); panel.add(btn);
        panel.add(chk); panel.add(lbl);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListenerTest();
    }
}
