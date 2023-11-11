package ua.edu.ucu.apps.flowerstore.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void add(AppUser user) {
        if (userRepository.findUserByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
        }
    }
}
