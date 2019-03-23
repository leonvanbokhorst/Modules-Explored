package nl.fhict.s3.loginservice.model;

import java.text.MessageFormat;
import java.util.UUID;
import nl.fhict.s3.logincomponent.interfaces.User;

public class LocalUser implements User {

    private String name;
    private UUID id;

    public LocalUser(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setId(UUID newId) {
        id = newId;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[LocalUser] name={0}, id={1}", getName(), getId());
    }
}
