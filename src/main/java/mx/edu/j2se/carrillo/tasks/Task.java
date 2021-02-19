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

    public Task(String title, int start, int end, int interval) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    // Getter and setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setTime(int start, int end, int interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public String getTitle() {
        return title;
    }

    public int getStartTime() {
        if (start != 0) {
            return start;
        } else {
            return time;
        }

    }

    public int getEndTime() {
        if (end != 0) {
            return end;
        } else {
            return time;
        }
    }

    public int getRepeatInterval() {
        if (interval != 0) {
            return interval;
        } else {
            return 0;
        }
    }

    // Control strings for active or non active task
    public boolean isActive() {
        if (isActive) {
            return true;
        } else {
            return false;
        }
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Control setting for isRepeated

    public boolean isRepeated() {
        if (end != 0) {
            return true;
        } else {
            return false;
        }
    }
}
