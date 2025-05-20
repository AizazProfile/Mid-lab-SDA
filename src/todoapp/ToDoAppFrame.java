package todoapp;

import javax.swing.*;
import java.awt.*;

public class ToDoAppFrame extends JFrame {
    private final TaskManager taskManager = new TaskManager();
    private final DefaultListModel<String> listModel = new DefaultListModel<>();
    private final JList<String> taskList = new JList<>(listModel);

    public ToDoAppFrame() {
        setTitle("To-Do Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null);

        JButton addBtn = new JButton("Add");
        JButton deleteBtn = new JButton("Delete");
        JButton updateBtn = new JButton("Update");
        JButton viewBtn = new JButton("View");

        addBtn.addActionListener(e -> AddTask.add(taskManager, listModel, this));
        deleteBtn.addActionListener(e -> DeleteTask.delete(taskManager, listModel, taskList));
        updateBtn.addActionListener(e -> UpdateTask.update(taskManager, listModel, taskList, this));
        viewBtn.addActionListener(e -> ViewTask.view(taskManager, this));

        JPanel panel = new JPanel();
        panel.add(addBtn);
        panel.add(deleteBtn);
        panel.add(updateBtn);
        panel.add(viewBtn);

        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
