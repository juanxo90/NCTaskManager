package mx.edu.j2se.carrillo.tasks;

public class Main {
	public static void main(String[] args) {
		// creaating two tasks for test the class
		Task task1 = new Task("Meeting in a cafe", 10); // single task
		Task task2 = new Task("Morning running", 7, 5767, 24);
		task1.setActive(false);
		task2.setActive(true);

		System.out.println("Task title: " + task1.getTitle());
		System.out.println("The task is active: " + task1.isActive());
		System.out.println("The task starts at: " + task1.getStartTime());
		System.out.println("The task is repeated: " + task1.isRepeated());
		// Converting the task to a repeated task.
		task1.setTitle("Meeting in a cafe with the boss ");
		task1.setTime(34, 11556, 48);
		task1.setActive(false);
		System.out.println("Task title: " + task1.getTitle());
		System.out.println("The task is now active and starts: " + task1.getStartTime());
		System.out.println("The end time is: " + task1.getEndTime());
		System.out.println("The task will repeated every: " + task1.getRepeatInterval());
		System.out.println("The task is repeated: " + task1.isRepeated());
		System.out.println("The task is active: " + task1.isActive());

		// Task 2 print
		System.out.println("Task title: " + task2.getTitle());
		System.out.println("The task is now active and starts: " + task2.getStartTime());
		System.out.println("The end time is: " + task2.getEndTime());
		System.out.println("The task will repeated every: " + task2.getRepeatInterval());
		System.out.println("The task is repeated: " + task2.isRepeated());
		System.out.println("The task is active: " + task2.isActive());

	}

}
