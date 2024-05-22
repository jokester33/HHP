import  org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;


public class TaskTest {

    @Test
    public void testTask() {
        Task task1 = new Task("Login Feature", "Create Login To authenticate users", "Robyn Harrison", 8, "To Do");

        assertEquals("Login Feature", task1.taskName);
        assertEquals("Create Login To authenticate users", task1.taskDescription);
        assertEquals("Robyn Harrison", task1.developerName);
        assertEquals(8, task1.taskDuration);
        assertEquals("To Do", task1.taskStatus);
        assertTrue(task1.checkTaskDescription());

        String expectedDetails = "Task Details:\nTask Status: To Do\nDeveloper Details: Robyn Harrison\nTask Name: Login Feature\nTask Description: Create Login To authenticate users\nTask ID: LO:LoginFeature:SON\nDuration: 8 hours";
        assertEquals(expectedDetails, task1.printTaskDetails());

    }

    @Test
    public void testNewTask() {

        Task task2 = new Task("Add Task Feature", "Create add task feature to add users", "Mike Smith", 10, "Doing");

        assertEquals("Add Task Feature", task2.taskName);
        assertEquals("Create add task feature to add users", task2.taskDescription);
        assertEquals("Mike Smith", task2.developerName);
        assertEquals(10, task2.taskDuration);
        assertEquals("Doing", task2.taskStatus);
        assertTrue(task2.checkTaskDescription());

        System.out.println(task2.printTaskDetails());
    }
}


