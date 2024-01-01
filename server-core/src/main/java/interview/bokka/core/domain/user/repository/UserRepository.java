package interview.bokka.core.domain.user.repository;

import interview.bokka.core.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
