package lesson8;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private JPanel getPanelWithBorderLayout() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JButton("OK"), BorderLayout.WEST);
        panel.add(new JTextArea(), BorderLayout.CENTER);
        panel.add(new JButton("OK"), BorderLayout.EAST);
        panel.add(new JButton("OK"), BorderLayout.NORTH);
        panel.add(new JButton("OK"), BorderLayout.SOUTH);
        return panel;
    }

    public JPanel getPanelWithFlowLayout() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JButton("OK"));
        panel.add(new JTextArea("asfasgasgasg"));
        panel.add(new JButton("OK"));
        panel.add(new JButton("OK"));
        panel.add(new JButton("OK"));
        return panel;
    }

    public JPanel getPanelWithGridLayout(int row, int col) {
        JPanel panel = new JPanel(new GridLayout(row, col));
        panel.add(new JButton("OK"));
        panel.add(new JTextArea("asfasgasgasg"));
        panel.add(new JButton("OK"));
        panel.add(new JButton("OK"));
        panel.add(new JButton("OK"));
        return panel;
    }

    private final ImageIcon imageX = new ImageIcon("src/lesson8/x.jpg");
    private final ImageIcon imageO = new ImageIcon("src/lesson8/o.jpg");
    private final ImageIcon imageEmpty = new ImageIcon("src/lesson8/empty.jpg");
    private int cnt = 0;

    public Window() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500, 400);
        setSize(300, 300);
        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JButton[][] buttons = new JButton[3][3];
        System.out.println(imageX);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setIcon(imageEmpty);
                JButton copy = buttons[i][j];
                copy.addActionListener(action -> {
                    copy.setIcon(imageX);
                    copy.setEnabled(false);
                    cnt++;
                    copy.setDisabledIcon(imageX);
                    movePC(buttons);
                    if (cnt == 9) {
                        JFrame alert = new JFrame("кто то победил или ничья");
                        alert.setLocation(500, 400);
                        alert.setSize(300, 100);
                        JPanel alertPanel = new JPanel(new FlowLayout());
                        JButton newGame = new JButton("new game");
                        newGame.addActionListener(a -> {
                            this.dispose();
                            new Window();
                            alert.dispose();
                        });
                        JButton close = new JButton("close");
                        close.addActionListener(a -> {
                            dispose();
                            alert.dispose();
                        });
                        alertPanel.add(newGame);
                        alertPanel.add(close);
                        alert.add(alertPanel);
                        alert.setResizable(false);
                        alert.setVisible(true);
                    }
                });
                panel.add(buttons[i][j]);
            }
        }
        add(panel);
        setVisible(true);
    }

    private void movePC(JButton[][] buttons) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].isEnabled()) {
                    buttons[i][j].setIcon(imageO);
                    buttons[i][j].setEnabled(false);
                    buttons[i][j].setDisabledIcon(imageO);
                    cnt++;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Window win = */
        new Window();
    }
}
