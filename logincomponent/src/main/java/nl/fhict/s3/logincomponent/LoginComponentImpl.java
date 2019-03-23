package nl.fhict.s3.logincomponent;

import java.util.HashMap;
import nl.fhict.s3.logincomponent.data.RegistersUsers;
import nl.fhict.s3.logincomponent.interfaces.LoginComponent;
import nl.fhict.s3.logincomponent.interfaces.User;

public class LoginComponentImpl implements LoginComponent {

    private final RegistersUsers registersUsers = new RegistersUsers(new HashMap<>());

    public User registerUser(User newUser) {
        newUser.setId(java.util.UUID.randomUUID());

        return registersUsers.registerUser(newUser);
    }

    public Iterable<? extends User> getAllUsers() {
        return registersUsers.getAll();
    }


}
