package ticket.booking.entities;

import ticket.booking.enums.Enums;

public class Seat {
    private Long id;
    private String seatNumber;
    private Enums.SeatType seatType; // Enum: REGULAR, PREMIUM, RECLINER
}
