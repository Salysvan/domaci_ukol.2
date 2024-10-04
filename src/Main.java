import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Guest adela = new Guest("Adéla ", "Malíková ",
                LocalDate.of(1993,3, 13));
    Guest jan = new Guest("Jan ","Dvořáček ",
                LocalDate.of(1995, 5, 5));
    jan.setBirthdate(LocalDate.of(1955, 4, 5));

        System.out.println(jan.getName() + jan.getLastName() + "(" +
                    jan.getBirthdate() + ").");
        System.out.println(adela.getName() + adela.getLastName() + "(" +
                adela.getBirthdate() + ").");

        Rooms n1 = new Rooms("č.1 ", 1,
                true, true,
                BigDecimal.valueOf(1000));
        Rooms n2 = new Rooms("č.2 ", 1,
                true, true,
                BigDecimal.valueOf(1000));
        Rooms n3 = new Rooms("č.3 ", 3,
                false, true,
                BigDecimal.valueOf(2400));

        System.out.print("Pokoj " + n1.getRoomNumber());
        System.out.print(" má " + n1.getNumberOgBeds() + " postel.");
        System.out.println(" Cena za noc je " + n1.getPrice() + "Kč.");
        if (n1.coastView && n1.withBalcony){
            System.out.println("Pokoj je s balkónem s výhledem na moře");
        }

        System.out.print("Pokoj " + n2.getRoomNumber());
        System.out.print(" má " + n2.getNumberOgBeds() + " postel.");
        System.out.println(" Cena za noc je " + n2.getPrice() + "Kč.");
        if (n2.coastView && n2.withBalcony){
            System.out.println("Pokoj je s balkónem s výhledem na moře");
        }

        System.out.print("Pokoj " + n3.getRoomNumber());
        System.out.print(" má " + n3.getNumberOgBeds() + " postele.");
        System.out.println(" Cena za noc je " + n3.getPrice() + "Kč.");
        if (n3.coastView && n3.withBalcony){
            System.out.println("Pokoj je s balkónem s výhledem na moře");
        } else {
            System.out.println("Pokoj je bez balkónu s výhledem na moře");
        }

        BookingManager room1 = new BookingManager(
                "od 19. do 26.7.2021 ", false);
        BookingManager room3 = new BookingManager(
                "od 1. do 14. 9. 2021", true);

        List<BookingManager> reservation = new ArrayList<>();
        reservation.add(room1);
        reservation.add(room3);
        System.out.println(reservation.getFirst().getReservation());
        System.out.println(reservation.getLast().getReservation());
    }
}