import javax.swing.JOptionPane;

public class EasyKanban {

    private static int taskNumber = 0;
    private static int totalDuration = 0;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks to add"));

        for (int i = 0; i < numTasks; i++) {
            addTasks();
        }

        showReport();
    }
    //Task Name
    private static void addTasks() {
        String taskName = JOptionPane.showInputDialog("Enter task name");

        //Task Description
        String taskDescription = JOptionPane.showInputDialog("Enter task description (less than 50 characters)");
        if (taskDescription.length() <= 50) {
            String developerName = JOptionPane.showInputDialog("Enter developer first and last name");
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (hours)"));

            totalDuration += taskDuration;

            String taskID = generateTaskID(taskName, taskNumber, developerName);

            String[] statusOptions = {"To Do", "Done", "Doing"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);

            JOptionPane.showMessageDialog(null, "Task Details:\nTask Status: " + taskStatus + "\nDeveloper Details: " + developerName + "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskID + "\nDuration: " + taskDuration + " hours");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
        }

        taskNumber++;
    }

    ;


    private static String generateTaskID(String taskName, int taskNumber, String developerName) {
        String firstTwoLetters = taskName.substring(0, Math.min(taskName.length(), 2)).toUpperCase();
        String lastThreeLetters = developerName.substring(Math.max(0, developerName.length() - 3)).toUpperCase();
        return firstTwoLetters + ":" + taskNumber + ":" + lastThreeLetters;
    }

    private static void showReport() {
        JOptionPane.showMessageDialog(null, "Total duration across all tasks: " + totalDuration + " hours");
    }
}
