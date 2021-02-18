package mx.edu.j2se.carrillo.tasks;

public class Main {
	public static void main(String[] args) {
		Task task = new Task();
		task.setTitle("Running");
		task.getTime(6);
		task.getInterval();

		System.out.println(task.getTitle() + " pos funciono");
	}

}
