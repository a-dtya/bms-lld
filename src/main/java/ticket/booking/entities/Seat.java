package ticket.booking.entities;

import ticket.booking.enums.Enums;

public class Seat {
    private Long id;
    private String seatNumber;
    private Enums.SeatType seatType; // REGULAR, PREMIUM, RECLINER
    private boolean isBooked;

    // ✅ Default constructor (for Jackson)
    public Seat() {
    }

    // ✅ Parameterized constructor
    public Seat(Long id, String seatNumber, Enums.SeatType seatType, boolean isBooked) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isBooked = isBooked;
    }

    // ✅ Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Enums.SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(Enums.SeatType seatType) {
        this.seatType = seatType;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    // ✅ Info method
    public String getInfo() {
        return "Seat: " + seatNumber + " | Type: " + seatType + " | " +
                (isBooked ? "❌ Booked" : "✅ Available");
    }
}
