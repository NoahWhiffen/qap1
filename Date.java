// QAP 1 - Term 3 - Java
// Author: Noah Whiffen - SD12
// Date: January 28th, 2025


public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String dayStr = String.format("%02d", day);
        String monthStr = String.format("%02d", month);
        String yearStr = String.valueOf(year);

        return dayStr + "/" + monthStr + "/" + yearStr;
    }

    public boolean isValid() {
        if (day < 1 || day > 31) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (year < 1900 || year > 9999) {
            return false;
        }

        return true;
    }


}
