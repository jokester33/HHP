public class Task {

        public String taskName;
        public String taskDescription;
        public String developerName;
        public int taskDuration;
        public String taskStatus;
        public String taskID;

        public Task(String taskName, String taskDescription, String developerName, int taskDuration, String taskStatus) {
            this.taskName = taskName;
            this.taskDescription = taskDescription;
            this.developerName = developerName;
            this.taskDuration = taskDuration;
            this.taskStatus = taskStatus;
            this.taskID = createTaskID();
        }



        public String createTaskID() {
            String firstTwoLetters = taskName.substring(0, Math.min(2, taskName.length())).toUpperCase();
            String lastThreeLetters = developerName.length() >= 3 ? developerName.substring(developerName.length() - 3).toUpperCase() : developerName.toUpperCase();
            return firstTwoLetters + ":" + taskName.replaceAll("\\s+","") + ":" + lastThreeLetters;
        }

        public boolean checkTaskDescription() {
            return taskDescription != null && !taskDescription.isEmpty();
        }

        public String printTaskDetails() {
            return "Task Details:\nTask Status: " + taskStatus + "\nDeveloper Details: " + developerName + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskID + "\nDuration: " + taskDuration + " hours";
        }

        public int returnTo0talHours() {
            return taskDuration;
        }

    }
