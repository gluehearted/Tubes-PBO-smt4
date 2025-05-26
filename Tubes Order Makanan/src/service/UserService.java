package service;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        // Contoh user default
        users.add(new Customer("user1", "pass1", 100000));
        users.add(new Admin("admin1", "adminpass"));
    }

    public void registerCustomer(String username, String password, double balance) throws Exception {
        if (findUserByUsername(username).isPresent()) {
            throw new Exception("Username sudah dipakai!");
        }
        users.add(new Customer(username, password, balance));
    }

    public Optional<User> login(String username, String password) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username) && u.password.equals(password))
                .findFirst();
    }

    public Optional<User> findUserByUsername(String username) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst();
    }

    public List<User> getAllUsers() {
        return users;
    }
}