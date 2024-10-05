import java.time.LocalDate;

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

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public boolean isVacation() {
        return isVacation;
    }

    public void setVacation(boolean vacation) {
        isVacation = vacation;
    }

    public Rooms getRoom(Rooms rooms){;
        return rooms;
    }

    public void setRooms(Rooms rooms){
    }

    public Guest getGuest(Guest guest){
        return guest;
    }

    public void setGuest(Guest guest){
    }
}
