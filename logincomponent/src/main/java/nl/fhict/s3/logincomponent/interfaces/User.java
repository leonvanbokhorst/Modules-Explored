package nl.fhict.s3.logincomponent.interfaces;

import java.util.UUID;

public interface User {

    String getName();

    UUID getId();

    void setName(String newName);

    void setId(UUID newId);
}
