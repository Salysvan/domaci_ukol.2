import javax.xml.namespace.QName;
import java.util.List;

public class Booking {
    private String date;
    private boolean vacation;
    private Room room;
    private Guest guest;
    private List otherGuest;

    public Booking (String date, boolean vacation, Room room,Guest guest) {
        this.date = date;
        this.vacation = vacation;
        this.room = room;
        this.guest = guest;
    }

    public List getOtherGuest() {
        return otherGuest;
    }

    public void setOtherGuest(List otherGuest) {
        this.otherGuest = otherGuest;
    }

    @Override
    public String toString() {
        return "Rezervace " + date + " je na pokoj " + room.getRoomNumber() +
                "pro hosta jménem: " + guest.getName() + guest.getLastName();
    }
}
