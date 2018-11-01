package pjatk.dev.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Entity
public class Session {

    private LocalDateTime validity;
    private String token;
}
