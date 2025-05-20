package todoapp;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (!username.isEmpty() && !password.isEmpty()) {
                new ToDoAppFrame();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Enter username and password!");
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(userLabel); panel.add(userField);
        panel.add(passLabel); panel.add(passField);
        panel.add(new JLabel()); panel.add(loginButton);

        add(panel);
        setVisible(true);
    }
}
