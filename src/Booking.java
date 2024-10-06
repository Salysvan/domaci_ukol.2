public class Booking {
    private String date;
    private boolean vacation;

    public Booking (String date, boolean vacation, Room room, Guest name, Guest lastName) {
        this.date = date;
        this.vacation = vacation;
    }

    public Booking (String date, boolean vacation, Room room, Guest name,
            Guest name2, Guest lastName, Guest lastName2) {
        this(date, vacation, room, name,lastName);
    }

    public String getDate() {
        return date;
    }

    public boolean isVacation() {
        return vacation;
    }

    @Override
    public String toString() {
        return "Rezervace " + date + " je na ";
    }
}
