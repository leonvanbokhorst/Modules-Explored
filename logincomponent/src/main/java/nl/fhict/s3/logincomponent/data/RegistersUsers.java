package nl.fhict.s3.logincomponent.data;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import nl.fhict.s3.logincomponent.interfaces.User;

public class RegistersUsers {

    private final Map<UUID, User> userHashMap;

    public RegistersUsers(Map<UUID, User> map) {
        userHashMap = map;
    }

    public User registerUser(User newUser) {
        userHashMap.put(newUser.getId(), newUser);

        return newUser;
    }

    public Collection<User> getAll() {
        return userHashMap.values();
    }
}