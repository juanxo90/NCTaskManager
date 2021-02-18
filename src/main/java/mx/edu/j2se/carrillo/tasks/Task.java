package mx.edu.j2se.carrillo.tasks;

import java.sql.Struct;

public class Task {
    String title;
    int time;
    int end;
    int interval;
    boolean isActive;

    // methods
    public Task() {
        this.title = title;
    }

    public void interval() {
    }

    // getters
    public String getTitle() {
        return title;
    }

    public int getTime(int i) {
        return time;
    }


    public int getInterval() {
        return interval;
    }

    // setters
    public void setTime(int time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInterval(int interval) {
        this.interval = end - time;
    }

}
