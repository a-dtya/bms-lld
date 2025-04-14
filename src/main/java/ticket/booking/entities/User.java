package ticket.booking.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    // 🔽 List to store bookings
    private List<Booking> bookings = new ArrayList<>();

    // Constructor
    public User(Long id, String name, String email, String phoneNumber, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    // Default constructor (for Jackson)
    public User() {
    }

    // --- Getters and Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 🔽 Bookings-related methods

    public List<Booking> getBookings() {
        return new ArrayList<>(bookings); // return a copy to avoid external modification
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    // 🔍 Method to display all bookings for this user
    public void printBookingsInfo() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found for user " + name);
            return;
        }

        System.out.println("Bookings for user: " + name);
        for (Booking booking : bookings) {
            System.out.println("---------------------------------");
            System.out.println(booking.getBookingInfo());
            System.out.println("---------------------------------");
        }
    }

    // ❌ Method to cancel a booking by ID
    public boolean cancelBookingById(Long bookingId) {
        Iterator<Booking> iterator = bookings.iterator();
        while (iterator.hasNext()) {
            Booking b = iterator.next();
            if (b.getId().equals(bookingId)) {
                b.setStatus(ticket.booking.enums.Enums.BookingStatus.CANCELLED);
                return true;
            }
        }
        return false;
    }
}
