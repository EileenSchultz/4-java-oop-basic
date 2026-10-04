package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int seconds;

    TimeSpan(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        this.seconds += time.seconds;

        while (this.seconds >= 60) {
            this.minute++;
            this.seconds -= 60;
        }

        this.minute += time.minute;

        while (this.minute >= 60) {
            this.hour++;
            this.minute -= 60;
        }
        this.hour += time.hour;

    }

    void subtract(TimeSpan time) {
        this.seconds -= time.seconds;

        while (this.seconds < 0) {
            this.minute -= 1;
            this.seconds += 60;
        }

        this.minute -= time.minute;

        while (this.minute < 0) {
            this.hour -= 1;
            this.minute += 60;
        }
        this.hour -= time.hour;

    }

    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.seconds;
    }
}

