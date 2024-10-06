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
                    jan.getBirthdate() + ")" + "\n";
            String guestAdela = adela.getName() + adela.getLastName() + " (" +
                    adela.getBirthdate() + ")" + "\n";
            String guests = gusetJan + guestAdela;
        System.out.println(guests);

        Room n1 = new Room("č.1 ", 1,
                true, true,
                BigDecimal.valueOf(1000));
        Room n2 = new Room("č.2 ", 1,
                true, true,
                BigDecimal.valueOf(1000));
        Room n3 = new Room("č.3 ", 3,
                false, true,
                BigDecimal.valueOf(2400));

        String room1 = "Pokoj " + n1.getRoomNumber() + " má " + n1.getNumberOgBeds() + " postel." +
                " Cena za noc je " + n1.getPrice() + "Kč.\n" + "Pokoj je s balkónem s výhledem na moře.\n";

        String room2 = "Pokoj " + n2.getRoomNumber() + " má " + n2.getNumberOgBeds() + " postel." +
                " Cena za noc je " + n2.getPrice() + "Kč.\n" + "Pokoj je s balkónem s výhledem na moře\n";

        String rooms = room1 + room2;

                String room3 = "Pokoj " + n3.getRoomNumber() + " má " + n3.getNumberOgBeds() + " postele." +
                " Cena za noc je " + n3.getPrice() + "Kč.";
        System.out.print(rooms);
        System.out.println(room3);
        if (n3.isWithBalcony() || n3.isCoastView()){
            System.out.println("Pokoj je bez balkónu s výhledem na moře");
        }

        System.out.print("\n");

        Booking reservation1 = new Booking("od 19. do 26.7.2021." , true, n1, adela, adela);
        Booking reservation2 = new Booking("od 1. do 14.9.2021.", false, n3, jan, jan, adela, adela);

        BookingManager bookingManager = new BookingManager();

        bookingManager.addbooking(reservation1);

    }
}