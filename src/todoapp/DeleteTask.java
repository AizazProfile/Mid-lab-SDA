package todoapp;

import javax.swing.*;

public class DeleteTask {
    public static void delete(TaskManager taskManager, DefaultListModel<String> listModel, JList<String> taskList) {
        int index = taskList.getSelectedIndex();
        if (index != -1) {
            taskManager.deleteTask(index);
            listModel.remove(index);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a task to delete.");
        }
    }
}
