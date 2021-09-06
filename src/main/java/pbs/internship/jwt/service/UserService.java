package pbs.internship.jwt.service;

import pbs.internship.jwt.domain.Role;
import pbs.internship.jwt.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User>getUsers();


}
