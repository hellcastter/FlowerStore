package ua.edu.ucu.apps.flowerstore.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery/")
public class DeliveryController {
    @GetMapping("/")
    public String index() {
        return "Delivery endpoint";
    }
}
