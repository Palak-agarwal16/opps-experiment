import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JLabel confirmLabel = new JLabel("Confirm Password:");
        JPasswordField confirmField = new JPasswordField();
        JButton registerBtn = new JButton("Register");
        JLabel message = new JLabel();

        nameLabel.setBounds(20, 20, 150, 25);
        nameField.setBounds(180, 20, 150, 25);
        emailLabel.setBounds(20, 60, 150, 25);
        emailField.setBounds(180, 60, 150, 25);
        passLabel.setBounds(20, 100, 150, 25);
        passField.setBounds(180, 100, 150, 25);
        confirmLabel.setBounds(20, 140, 150, 25);
        confirmField.setBounds(180, 140, 150, 25);
        registerBtn.setBounds(100, 180, 100, 25);
        message.setBounds(20, 220, 300, 25);

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(passLabel); frame.add(passField);
        frame.add(confirmLabel); frame.add(confirmField);
        frame.add(registerBtn); frame.add(message);

        registerBtn.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String pass = new String(passField.getPassword());
            String confirm = new String(confirmField.getPassword());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                message.setText("Error: All fields are required.");
            } else if (!email.contains("@")) {
                message.setText("Error: Invalid email format.");
            } else if (!pass.equals(confirm)) {
                message.setText("Error: Passwords do not match.");
            } else {
                message.setText("Registration successful!");
            }
        });

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

