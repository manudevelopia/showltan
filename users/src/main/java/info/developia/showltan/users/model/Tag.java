package info.developia.showltan.users.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Tag {

    @Id
    private String word;
    private LocalDate timestamp;

    @OneToMany
    private Set<User> users;

}
