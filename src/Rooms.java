import java.math.BigDecimal;

public class Rooms {
    private String roomNumber;
    private int numberOfBeds;
    boolean withBalcony;
    boolean coastView;
    BigDecimal price;

    public Rooms(String roomNumber, int numberOgBeds, boolean withBalcony, boolean coastView, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOgBeds;
        this.withBalcony = withBalcony;
        this.coastView = coastView;
        this.price = price;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOgBeds() {
        return numberOfBeds;
    }

    public void setNumberOgBeds(int numberOgBeds) {
        this.numberOfBeds = numberOgBeds;
    }

    public boolean isWithBalcony() {
        return withBalcony;
    }

    public void setWithBalcony(boolean withBalcony) {
        this.withBalcony = withBalcony;
    }

    public boolean isCoastView() {
        return coastView;
    }

    public void setCoastView(boolean coastView) {
        this.coastView = coastView;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
