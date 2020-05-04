package result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GameResult {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String nickname;

    @Column(nullable = false)
    private int score;

    @Column(nullable = false)
    private ZonedDateTime created;

    @PrePersist
    protected void onPersist() {
        created = ZonedDateTime.now();
    }
}
