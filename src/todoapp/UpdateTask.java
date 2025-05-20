package todoapp;

import javax.swing.*;

public class UpdateTask {
    public static void update(TaskManager taskManager, DefaultListModel<String> listModel, JList<String> taskList, JFrame parent) {
        int index = taskList.getSelectedIndex();
        if (index != -1) {
            String current = listModel.get(index);
            String updated = JOptionPane.showInputDialog(parent, "Update task:", current);
            if (updated != null && !updated.trim().isEmpty()) {
                taskManager.updateTask(index, updated);
                listModel.set(index, updated);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a task to update.");
        }
    }
}
