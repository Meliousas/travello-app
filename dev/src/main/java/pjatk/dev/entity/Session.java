package pjatk.dev.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Session {

    private LocalDateTime validUntil;
    private String token;
}
