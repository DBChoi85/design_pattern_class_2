public final class Booking {
    private final RoomType roomType;
    private final int nights;

    public Booking(RoomType roomType, int nights) {
        if (nights <= 0) throw new IllegalArgumentException("nights must be > 0");
        this.roomType = roomType;
        this.nights = nights;
    }
    public RoomType roomType() { return roomType; }
    public int nights() { return nights; }
