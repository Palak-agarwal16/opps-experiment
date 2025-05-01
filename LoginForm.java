import javax.swing.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 150, 25);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 60, 150, 25);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 100, 100, 25);

        JLabel message = new JLabel();
        message.setBounds(20, 140, 300, 25);

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);
        frame.add(message);

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passText.getPassword());
            if (username.equals("admin") && password.equals("password")) {
                message.setText("Login successful!");
            } else {
                message.setText("Invalid credentials!");
            }
        });

        frame.setSize(350, 220);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

