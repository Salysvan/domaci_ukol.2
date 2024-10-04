import java.time.LocalDate;

public class BookingManager {
    private LocalDate reservation;
    private boolean isVacation;

    public LocalDate getReservation() {
        return reservation;
    }

    public void setReservation(LocalDate reservation) {
        this.reservation = reservation;
    }

    public boolean isVacation() {
        return isVacation;
    }

    public void setVacation(boolean vacation) {
        isVacation = vacation;
    }
}
