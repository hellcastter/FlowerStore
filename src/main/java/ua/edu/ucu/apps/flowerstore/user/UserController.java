package ua.edu.ucu.apps.flowerstore.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list/")
    public List<AppUser> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/add/")
    public void addUser(@RequestBody AppUser user) {
        userService.add(user);
    }
}
