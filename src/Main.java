import java.time.LocalDate;

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


    }
}