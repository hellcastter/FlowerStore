package ua.edu.ucu.apps.flowerstore.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@Getter @AllArgsConstructor @NoArgsConstructor @ToString @Entity
public class AppUser {
    @Id
    private Integer id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    private int age;

    @Transient
    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
