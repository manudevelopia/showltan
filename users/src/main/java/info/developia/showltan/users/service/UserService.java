package info.developia.showltan.users.service;

import info.developia.showltan.users.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByEmail(String email);

}
