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

    // Constructor
    public Booking(Long id, User user, Show show, List<Seat> bookedSeats,
                   Enums.BookingStatus status, Date bookingTime, Payment payment) {
        this.id = id;
        this.user = user;
        this.show = show;
        this.bookedSeats = bookedSeats;
        this.status = status;
        this.bookingTime = bookingTime;
        this.payment = payment;
    }

    // Default constructor (important for Jackson, if needed)
    public Booking() {
    }

    // --- Getters and Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Enums.BookingStatus getStatus() {
        return status;
    }

    public void setStatus(Enums.BookingStatus status) {
        this.status = status;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // --- Custom Info Method ---

    public String getBookingInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Booking ID: ").append(id).append("\n");
        info.append("User: ").append(user.getName()).append(" (").append(user.getEmail()).append(")\n");
        info.append("Movie: ").append(show.getMovie().getTitle()).append("\n");
        info.append("Show Time: ").append(show.getShowTime()).append("\n");
        info.append("Screen: ").append(show.getScreen().getName()).append("\n");
        info.append("Booked Seats: ");
        for (Seat seat : bookedSeats) {
            info.append(seat.getSeatNumber()).append(" ");
        }
        info.append("\nStatus: ").append(status).append("\n");
        info.append("Booking Time: ").append(bookingTime).append("\n");
        info.append("Payment: ₹").append(payment.getAmount()).append(" via ").append(payment.getMethod())
                .append(" (").append(payment.getStatus()).append(")");
        return info.toString();
    }
}
