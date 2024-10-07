import javax.xml.namespace.QName;
import java.util.List;

public class Booking {
    private String date;
    private boolean vacation;
    private Room room;
    private Guest guest;
    private Guest otherGuest;
    private boolean isOtherguest;

    public Booking (String date, boolean vacation, Room room,Guest guest) {
        this.date = date;
        this.vacation = vacation;
        this.room = room;
        this.guest = guest;
    }

    public void setOtherGuest(Guest otherGuest) {
        this.otherGuest = otherGuest;
    }

    public boolean isOtherguest() {
        return isOtherguest;
    }

    public void setOtherguest(boolean otherguest) {
        isOtherguest = otherguest;
    }

    @Override
    public String toString() {
        return "Rezervace " + date + " je na pokoj " + room.getRoomNumber() +
                "pro hosta jménem: " + guest.getName() + guest.getLastName() +
                otherGuest.getName() + otherGuest.getLastName();
    }

    /* pridani otherGuest pres "List" jak jsi psal.... jsem nepochopl
    *  jak to mam dat cele dohromady, aby otherGuest byl jen u nektere rezervace...
    *  zkousel jsem to pres metodu "add", ale když jsem to pak chtel vypsat, v tomto
    *  "String toString", tak mi to neslo jelikoz nektere rezervace nemeli "otherGuest"
    *  prirazene.
    *
    *  pridal jsem tedy "otherGuest" tak to jak vidis, ale stale mi to nejde vypsat, jelikoz
    *  nektere rezervace maji ten atribut a nektere ne... tak hadam, ze se to bude muset
    *  vypsat pomoci metody if else.
    *
    *  ale taky ocekavam ze to je uplne spatne, jen jestli se to da resit i takto pres
    *  "setOtherGuest"?*/
}
