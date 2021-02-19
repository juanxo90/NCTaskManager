package mx.edu.j2se.carrillo.tasks;

public class Main {
	public static void main(String[] args) {
		Task task1 = new Task("Running", 2);
		Task task2 = new Task("Bike", 2, 0, 5);
		//task1.setTitle("jogging");
//		task.getTime(6);
//		task.getInterval();

		System.out.println(task1.getTitle() + " pos funciono");
		System.out.println(task2.getTitle() + " pos funciono");
		System.out.println(task2.getTime() + " pos funciono");
		System.out.println(task2.getStart() + " pos funciono");
		System.out.println(task2.getEnd() + " pos funciono");
		System.out.println(task2.getInterval() + " pos funciono");
	}

}
