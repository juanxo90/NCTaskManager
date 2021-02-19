package mx.edu.j2se.carrillo.tasks;

public class Main {
	public static void main(String[] args) {
		Task task1 = new Task("Meeting in a cafe", 2);
		Task task2 = new Task("Bike", 2, 0, 800, 24);
		task1.setTitle("jogging");


		System.out.println(task1.getTitle() + " pos funciono");
		System.out.println(task2.getTitle() + " pos funciono");
		System.out.println(task2.getTime() + " pos funciono");
		System.out.println(task2.getStart() + " pos funciono");
		System.out.println(task2.getEnd() + " pos funciono");
		System.out.println(task2.getInterval() + " pos funciono");
	}

}
