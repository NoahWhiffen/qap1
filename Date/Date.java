// QAP 1 - Term 3 - Java
// Author: Noah Whiffen - SD12
// Date: January 28th, 2025

package Date;
public class Date {
    int day;
    int month;
    int year;

    // Constructor to initialize day, month, and year
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

     // Getter for the day of the date
    public int getDay() {
        return day;
    }

    // Getter for the month of the date
    public int getMonth() {
        return month;
    }

    // Getter for the year of the date
    public int getYear() {
        return year;
    }

    // Setter for the day of the date
    public void setDay(int day) {
        this.day = day;
    }

    // Setter for the month of the date
    public void setMonth(int month) {
        this.month = month;
    }

    // Setter for the year of the date
    public void setYear(int year) {
        this.year = year;
    }

    // Setter to update all day, month, and year values
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Converts the date to a string in the format DD/MM/YYYY
    public String toString() {
        String dayStr = String.format("%02d", day);
        String monthStr = String.format("%02d", month);
        String yearStr = String.valueOf(year);

        return dayStr + "/" + monthStr + "/" + yearStr;
    }

    // Checks if the date is valid based on the day, month, and year
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
