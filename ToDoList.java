import javax.swing.*;
import java.awt.event.*;

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBounds(20, 20, 200, 120);

        JTextField taskField = new JTextField();
        taskField.setBounds(20, 150, 200, 25);

        JButton addButton = new JButton("Add");
        addButton.setBounds(230, 150, 80, 25);

        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(230, 180, 80, 25);

        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selected = list.getSelectedIndex();
            if (selected != -1) {
                model.remove(selected);
            }
        });

        frame.add(scroll);
        frame.add(taskField);
        frame.add(addButton);
        frame.add(removeButton);

        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
