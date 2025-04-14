package ticket.booking.entities;

import java.util.List;

public class Movie {
    private Long id;
    private String title;
    private String description;
    private String language;
    private int durationInMinutes;
    private List<String> genres;

    // ✅ Constructors
    public Movie() {
    }

    public Movie(Long id, String title, String description, String language, int durationInMinutes, List<String> genres) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.language = language;
        this.durationInMinutes = durationInMinutes;
        this.genres = genres;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    // ✅ Movie Info Display
    public String getInfo() {
        return "🎬 " + title + " (" + language + ", " + durationInMinutes + " min)\n" +
                "Genres: " + String.join(", ", genres) + "\n" +
                "Description: " + description;
    }
}
