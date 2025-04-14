package ticket.booking.entities;

import java.util.List;
import java.util.stream.Collectors;

public class Theatre {
    private Long id;
    private String name;
    private String location;
    private List<Screen> screens;

    // ✅ Default constructor
    public Theatre() {
    }

    // ✅ Parameterized constructor
    public Theatre(Long id, String name, String location, List<Screen> screens) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.screens = screens;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    // ✅ Theatre Info
    public String getInfo() {
        return "🎭 Theatre: " + name + "\n" +
                "📍 Location: " + location + "\n" +
                "🖥️ Screens: " + (screens != null ? screens.size() : 0);
    }

    // ✅ Optional: List of screen names
    public List<String> getScreenNames() {
        if (screens == null) return List.of();
        return screens.stream()
                .map(Screen::getName)
                .collect(Collectors.toList());
    }
}
