package mx.edu.j2se.carrillo.tasks;

public class Task {
    String title;
    int time;
    int start;
    int end;
    int interval;
    boolean isActive;

    // Constructors
    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public Task(String title, int time, int start, int end) {
        this.title = title;
        this.time = time;
        this.start = start;
        this.end = end;
        this.interval = 0;
    }

    // Getter and setters
    public String getTitle() {
        return title;
    }

    public int getStart() {
        return start;
    }

    public int getTime() {
        return time;
    }

    public int getEnd() {
        return end;
    }

    public int getInterval() {
        return interval = end - start;
    }

    public boolean isActive() {
        return isActive;
    }
}
