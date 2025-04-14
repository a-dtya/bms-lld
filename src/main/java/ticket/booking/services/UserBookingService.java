package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService {
    private User user;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String USERS_PATH = "src/main/resources/tickets/booking/localDb/users.json";
    private List<User> userList;

    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        loadUsers();
    }

    private void loadUsers() throws IOException {
        File usersFile = new File(USERS_PATH);
        if (usersFile.exists()) {
            userList = objectMapper.readValue(usersFile, new TypeReference<>() {});
        } else {
            userList = new java.util.ArrayList<>();
        }
    }

    private void saveUsers() throws IOException {
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(USERS_PATH), userList);
    }

    /**
     * Check if a user with matching email AND password exists.
     */
    public boolean loginUser(String email, String password) {
        return userList.stream()
                .anyMatch(u -> u.getEmail().equalsIgnoreCase(email)
                        && u.getPassword().equals(password));
    }

    /**
     * Register new user if email doesn't already exist.
     */
    public boolean signUpUser() throws IOException {
        boolean exists = userList.stream()
                .anyMatch(u -> u.getEmail().equalsIgnoreCase(user.getEmail()));

        if (!exists) {
            userList.add(user);
            saveUsers();
            return true; // Sign-up success
        }
        return false; // Email already registered
    }
}
