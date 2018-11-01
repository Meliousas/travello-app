package pjatk.dev.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Data
@Entity
public class Role implements GrantedAuthority {

    @Id
    private long id;
    private String authority;

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
