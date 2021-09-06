package pbs.internship.jwt.repsitory;


import org.springframework.data.jpa.repository.JpaRepository;
import pbs.internship.jwt.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);

}
