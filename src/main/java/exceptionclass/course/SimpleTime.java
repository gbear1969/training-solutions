package exceptionclass.course;

import java.time.LocalTime;

public class SimpleTime {
    private int hour;
    private int minute;
    private LocalTime sTime;

    public SimpleTime(int hour, int minute) {
        if (isValidTime(hour, minute)) {
            sTime = LocalTime.of(hour, minute);
        }
    }

    public SimpleTime(String timeStr) {
        if (timeStr == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (!isValidFormat(timeStr)) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        if (isValidTime(hour, minute)) {
            sTime = LocalTime.of(hour, minute);
        }
    }

    private boolean isValidFormat(String timeStr) {
        if (timeStr.length() == 5 && timeStr.charAt(2) == ':') {
            try {
                hour = Integer.parseInt(timeStr.substring(0,2));
            } catch (NumberFormatException nfe) {
                return false;
            }
            try {
                minute = Integer.parseInt(timeStr.substring(3));
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean isValidTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        return true;
    }

    public int getHour() {
        return sTime.getHour();
    }

    public int getMinute() {
        return sTime.getMinute();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", sTime.getHour(), sTime.getMinute());
    }
}
