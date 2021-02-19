package mx.edu.j2se.carrillo.tasks;

public class Main {
	public static void main(String[] args) {
		Task task1 = new Task("Meeting in a cafe", 2);
		Task task2 = new Task("Bike", 8, 800, 24);
		task1.setTitle("jogging");
		task1.setActive(false);
		task2.setActive(true);

		System.out.println(task1.getTitle() + " pos funciono");
		System.out.println(task1.isActive() + " pos funciono");
		System.out.println(task1.getStartTime() + " pos funciono");
		System.out.println(task2.getTitle() + " pos funciono");
		System.out.println(task2.getStartTime() + " pos funciono");
		System.out.println(task2.getStartTime() + " pos funciono");
		System.out.println(task2.getStartTime() + " pos funciono");
		System.out.println(task2.getStartTime() + " pos funciono");
		System.out.println(task2.isActive() + " pos funciono");

	}

}
