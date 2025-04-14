package ticket.booking.entities;

import java.util.List;

public class Screen {
    private Long id;
    private String name;
    private int totalSeats;
    private Theatre theatre;
    private List<Seat> seats;

    // ✅ Default constructor (for Jackson, etc.)
    public Screen() {
    }

    // ✅ Parameterized constructor
    public Screen(Long id, String name, int totalSeats, Theatre theatre, List<Seat> seats) {
        this.id = id;
        this.name = name;
        this.totalSeats = totalSeats;
        this.theatre = theatre;
        this.seats = seats;
    }

    // ✅ Getters and Setters
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

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    // ✅ Info method
    public String getInfo() {
        return "Screen: " + name + "\n" +
                "Theatre: " + (theatre != null ? theatre.getName() : "N/A") + "\n" +
                "Total Seats: " + totalSeats;
    }

    // 🔍 Optional helper method to get available seats
    public List<Seat> getAvailableSeats() {
        return seats.stream()
                .filter(seat -> !seat.isBooked())
                .toList();
    }
}
