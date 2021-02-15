package aaagyakorlas.kenukolcsonzo;

import java.time.Duration;
import java.time.LocalDateTime;

public class CanoeRental {
    private String name;
    private CanoeType canoeType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public CanoeRental(String name, CanoeType canoeType, String dateTimeString) {
        this.name = name;
        this.canoeType = canoeType;
        ;
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum() {
        Duration.between(startTime, endTime).toHours()
    }
}
