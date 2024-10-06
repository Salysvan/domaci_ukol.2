import java.math.BigDecimal;

public class Room {
    private String roomNumber;
    private int numberOfBeds;
    private boolean withBalcony;
    private boolean coastView;
    private BigDecimal price;

    public Room(String roomNumber, int numberOgBeds, boolean withBalcony, boolean coastView, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOgBeds;
        this.withBalcony = withBalcony;
        this.coastView = coastView;
        this.price = price;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOgBeds() {
        return numberOfBeds;
    }

    public boolean isWithBalcony() {
        return withBalcony;
    }

    public boolean isCoastView() {
        return coastView;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
