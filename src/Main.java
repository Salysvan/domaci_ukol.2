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