import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField display;
    String num1 = "", num2 = "", operator = "";

    public Calculator() {
        display = new JTextField();
        display.setBounds(30, 40, 280, 30);
        add(display);

        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        int x = 30, y = 80;
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setBounds(x, y, 50, 40);
            button.addActionListener(this);
            add(button);
            x += 70;
            if (x > 200) {
                x = 30;
                y += 50;
            }
        }

        setSize(350, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();
        if (btn.matches("[0-9]")) {
            if (operator.isEmpty()) num1 += btn;
            else num2 += btn;
            display.setText(num1 + operator + num2);
        } else if (btn.matches("[+\\-*/]")) {
            operator = btn;
            display.setText(num1 + operator);
        } else if (btn.equals("=")) {
            int result = 0;
            int n1 = Integer.parseInt(num1), n2 = Integer.parseInt(num2);
            switch (operator) {
                case "+": result = n1 + n2; break;
                case "-": result = n1 - n2; break;
                case "*": result = n1 * n2; break;
                case "/": result = n2 != 0 ? n1 / n2 : 0; break;
            }
            display.setText(String.valueOf(result));
            num1 = String.valueOf(result);
            num2 = "";
            operator = "";
        } else if (btn.equals("C")) {
            num1 = num2 = operator = "";
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
