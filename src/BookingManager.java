public class BookingManager {
    private String reservation;
    private boolean isVacation;

    public BookingManager(String reservation, boolean isVacation) {
        this.reservation = reservation;
        this.isVacation = isVacation;
    }

    public BookingManager(String reservation) {
        this(reservation, false);
    }

    public String getReservation() {
        return reservation;
    }

    public boolean isVacation() {
        return isVacation;
    }

    public void setVacation(boolean vacation) {
        isVacation = vacation;
    }

    public void addGuest (Guest guest) {
    }

    public void addRoom(Rooms roomNumber) {
    }

}
