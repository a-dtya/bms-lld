package ticket.booking.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Show {
    private Long id;
    private Movie movie;
    private Screen screen;
    private Date showTime;
    private double price;

    // ✅ Default constructor (for Jackson or general use)
    public Show() {
    }

    // ✅ Parameterized constructor
    public Show(Long id, Movie movie, Screen screen, Date showTime, double price) {
        this.id = id;
        this.movie = movie;
        this.screen = screen;
        this.showTime = showTime;
        this.price = price;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // ✅ Show Info
    public String getInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm a");

        return "Show ID: " + id + "\n" +
                "Movie: " + (movie != null ? movie.getTitle() : "N/A") + "\n" +
                "Screen: " + (screen != null ? screen.getName() : "N/A") + "\n" +
                "Show Time: " + formatter.format(showTime) + "\n" +
                "Ticket Price: ₹" + price;
    }
}
