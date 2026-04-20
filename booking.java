public class Booking {
    private int bookingID;
    private String email;
    private String itemType;
    private String itemName;
    private String bookingDate;
    private String bookingTime;
    private String status;

    public Booking(int bookingID, String email, String itemType, String itemName,
                   String bookingDate, String bookingTime, String status) {
        this.bookingID = bookingID;
        this.email = email;
        this.itemType = itemType;
        this.itemName = itemName;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.status = status;
    }

    public int getBookingID() {
        return bookingID;
    }

    public String getEmail() {
        return email;
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
