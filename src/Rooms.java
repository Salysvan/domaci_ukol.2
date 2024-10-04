import java.math.BigDecimal;

public class Rooms {
    private int roomNumber;
    private int numberOgBeds;
    boolean withBalcony;
    boolean coastView;
    BigDecimal price;

    public Rooms(int roomNumber, int numberOgBeds, boolean withBalcony, boolean coastView, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.numberOgBeds = numberOgBeds;
        this.withBalcony = withBalcony;
        this.coastView = coastView;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOgBeds() {
        return numberOgBeds;
    }

    public void setNumberOgBeds(int numberOgBeds) {
        this.numberOgBeds = numberOgBeds;
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
