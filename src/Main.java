import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Guest adela = new Guest("Adéla ", "Malíková",
                LocalDate.of(1993,3, 13));
    Guest jan = new Guest("Jan ","Dvořáček ",
                LocalDate.of(1995, 5, 5));
    jan.setBirthdate(LocalDate.of(1955, 4, 5));

            String gusetJan = jan.getName() + jan.getLastName() + "(" +
                    jan.getBirthdate() + ")";
        System.out.println(gusetJan);
            String guestAdela = adela.getName() + adela.getLastName() + " (" +
                    adela.getBirthdate() + ")";
        System.out.println(guestAdela);
        System.out.println(""); // tento řádek má za účel, vytvořit mezeru mezi jednotlivými sekcemi ve výpisu

        Rooms n1 = new Rooms("č.1 ", 1,
                true, true,
                BigDecimal.valueOf(1000));
        Rooms n2 = new Rooms("č.2 ", 1,
                true, true,
                BigDecimal.valueOf(1000));
        Rooms n3 = new Rooms("č.3 ", 3,
                false, true,
                BigDecimal.valueOf(2400));

        String room1 = "Pokoj " + n1.getRoomNumber() + " má " + n1.getNumberOgBeds() + " postel." +
                " Cena za noc je " + n1.getPrice() + "Kč.";
        if (n1.coastView && n1.withBalcony){
            System.out.println(room1);
            System.out.println("Pokoj je s balkónem s výhledem na moře");
        }

        String room2 = "Pokoj " + n2.getRoomNumber() + " má " + n2.getNumberOgBeds() + " postel." +
                " Cena za noc je " + n2.getPrice() + "Kč.";
        if (n2.coastView && n2.withBalcony){
            System.out.println(room2);
            System.out.println("Pokoj je s balkónem s výhledem na moře");
        }

        String room3 = "Pokoj " + n3.getRoomNumber() + " má " + n3.getNumberOgBeds() + " postele." +
                " Cena za noc je " + n3.getPrice() + "Kč.";
        System.out.println(room3);
        if (n3.coastView || n3.withBalcony){
            System.out.println("Pokoj je bez balkónu s výhledem na moře");
        }

        System.out.println("");// tento řádek má za účel, vytvořit mezeru mezi jednotlivými sekcemi ve výpisu

        BookingManager reservation1 = new BookingManager(
                "od 19. do 26.7.2021 ");
        BookingManager reservation2 = new BookingManager(
                "od 1. do 14. 9. 2021", true);

        reservation1.addRoom(n1);
        reservation1.addGuest(adela);
        reservation2.addRoom(n3);
        reservation2.addGuest(jan);
        reservation2.addGuest(adela);

        List<BookingManager> reservation = new ArrayList<>();
        reservation.add(reservation1);
        reservation.add(reservation2);

        for (BookingManager booking : reservation){
            System.out.println("Rezervace jsou " + booking.getReservation());
        }
        System.out.println("");

        /* chtěl jsem aby mi cyklus foreach vypsal každou rezervaci
        *  s datem té rezervace, jaký pokoj je zarezervovaný + na jaké jméno
        * nevědel jsem moc jak přidat k rezervaci jméno a č. pokoje ->
        * -> nic jiného mě moc nenapadlo
        *     ↓↓↓TAKTO JAK JSEM UVEDL DOLE↓↓↓   (jde to zařadit do toho cyklu?
        *                                        nebo ten jenom vypíše ten seznam
        *                                        a tutíž by ty infomace měli obsahovat už
        *                                        ty položky zařazené do seznamu?)
        * */

        String reserv1 = ("Pokoj " + n1.getRoomNumber() + "je rezervován pro hosta " +
                "jménem " + adela.getName() + adela.getLastName() + " na dobu. " +
                reservation1.getReservation());
        String reserv2 = ("Pokoj " + n3.getRoomNumber() + "je rezervován pro hosty " +
                "jmény: " + adela.getName() + adela.getLastName() + ", " +
                jan.getName() + jan.getLastName() + "na dobu " + reservation2.getReservation());
        System.out.println(reserv1);
        System.out.println(reserv2);



    }
}