package ua.edu.ucu.apps.flowerstore.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower/")
public class FlowerController {
    @GetMapping("/tulip")
	public Flower hello() {
        return new Flower(45.6, 5.0, FlowerColor.RED, FlowerType.TULIP);
	}
}
