package nl.fhict.s3.logincomponent.interfaces;

public interface LoginComponent {

    User registerUser(User newUser);

    Iterable<? extends User> getAllUsers();
}
