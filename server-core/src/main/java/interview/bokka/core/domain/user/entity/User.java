package interview.bokka.core.domain.user.entity;

import interview.bokka.core.common.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Builder
public class User extends BaseEntity {

    @Id
    @Column(name = "user_seq", nullable = false)
    private String userSeq;
}
