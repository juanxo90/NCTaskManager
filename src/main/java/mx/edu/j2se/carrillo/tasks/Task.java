package mx.edu.j2se.carrillo.tasks;

public class Task {
    String title;
    int time;
    int start;
    int end;
    int interval;
    boolean isActive;

    /**
     * Task manager main class for a repetitive and non-repetitive events
     * for this initial case the difference between arbitrary dates are giving
     * in int for hours from an starting date 0. For example, if 0 is Feb. 1, 2000
     * the int 36 will mean 12:00 Feb. 2 2020.
     * To validation the main class will give two task (repetitve or non-repetitive)
     * and a random number for the date, thus to verify if the task are active or
     * inactives.
     * @return isActive()
     */

    // Constructors with arguments inside
    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public Task(String title, int time, int start, int end, int interval) {
        this.title = title;
        this.time = time;
        this.start = start;
        this.end = end;
        this.interval = 0;
    }

    // Getter and setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // Control strings for active or non active task

}
