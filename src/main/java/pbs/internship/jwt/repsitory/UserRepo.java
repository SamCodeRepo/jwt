package pbs.internship.jwt.repsitory;


import org.springframework.data.jpa.repository.JpaRepository;
import pbs.internship.jwt.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
