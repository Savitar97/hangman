package result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;

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
}
