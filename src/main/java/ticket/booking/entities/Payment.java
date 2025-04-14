package ticket.booking.entities;

import ticket.booking.enums.Enums;

public class Payment {
    private Long id;
    private double amount;
    private Enums.PaymentStatus status; // PENDING, COMPLETED, FAILED
    private Enums.PaymentMethod method; // CARD, UPI, WALLET

    // ✅ Default constructor
    public Payment() {
    }

    // ✅ Parameterized constructor
    public Payment(Long id, double amount, Enums.PaymentStatus status, Enums.PaymentMethod method) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.method = method;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Enums.PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(Enums.PaymentStatus status) {
        this.status = status;
    }

    public Enums.PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(Enums.PaymentMethod method) {
        this.method = method;
    }

    // ✅ Info method
    public String getInfo() {
        return "💳 Payment ID: " + id +
                " | Amount: ₹" + amount +
                " | Method: " + method +
                " | Status: " + status;
    }
}
