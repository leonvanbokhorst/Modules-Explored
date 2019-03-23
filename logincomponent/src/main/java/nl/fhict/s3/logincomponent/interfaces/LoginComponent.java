package nl.fhict.s3.logincomponent.interfaces;

import java.util.Collection;

public interface LoginComponent {

    User registerUser(User newUser);

    Collection<User> getAllUsers();
}
