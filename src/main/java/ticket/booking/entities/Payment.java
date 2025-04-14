package ticket.booking.entities;

import ticket.booking.enums.Enums;

public class Payment {
    private Long id;
    private double amount;
    private Enums.PaymentStatus status; // Enum: PENDING, COMPLETED, FAILED
    private Enums.PaymentMethod method; // Enum: CARD, UPI, WALLET
}
