// QAP 1 - Term 3 - Java
// Author: Noah Whiffen - SD12
// Date: January 28th, 2025

package Time;
public class Time {
    int hour;
    int minute;
    int second;

    // Constructor to initialize time with hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter for the hour of the time
    public int getHour() {
        return hour;
    }

    // Getter for the minute of the time
    public int getMinute() {
        return minute;
    }

    // Getter for the second of the time
    public int getSecond() {
        return second;
    }

    // Setter for the hour of the time
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Setter for the minute of the time
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Setter for the second of the time
    public void setSecond(int second) {
        this.second = second;
    }

    // Setter to update all hour, minute, and second values
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Converts the time to a string in the format HH:MM:SS
    public String toString() {
        String hourStr = String.format("%02d", hour);
        String minuteStr = String.format("%02d", minute);
        String secondStr = String.format("%02d", second);

        return hourStr + ":" + minuteStr + ":" + secondStr;
    }

    // Checks if the time is valid
    public boolean isValid() {
        if (hour < 0 || hour > 23) {
            return false;
        }

        if (minute < 0 || minute > 59) {
            return false;
        }

        if (second < 0 || second > 59) {
            return false;
        }

        return true; // Returns true if all conditions are met
    }

    // Increments the time by one second
    public Time nextSecond() {
        this.second += 1;
        return this;
    }

    // Decrements the time by one second
    public Time previousSecond() {
        this.second -= 1;
        return this;
    }
}