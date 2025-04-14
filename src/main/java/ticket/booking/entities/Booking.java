package ticket.booking.entities;

import ticket.booking.enums.Enums;

import java.util.Date;
import java.util.List;

public class Booking {
    private Long id;
    private User user;
    private Show show;
    private List<Seat> bookedSeats;
    private Enums.BookingStatus status; // Enum: BOOKED, CANCELLED
    private Date bookingTime;
    private Payment payment;
}
