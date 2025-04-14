package ticket.booking.enums;

public class Enums {
    public enum BookingStatus {
        BOOKED, CANCELLED
    }

    public enum PaymentStatus {
        PENDING, COMPLETED, FAILED
    }

    public enum PaymentMethod {
        CARD, UPI, WALLET
    }

    public enum SeatType {
        REGULAR, PREMIUM, RECLINER
    }
}
