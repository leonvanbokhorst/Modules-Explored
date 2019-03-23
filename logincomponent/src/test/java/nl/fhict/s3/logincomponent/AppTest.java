package nl.fhict.s3.logincomponent;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;
import nl.fhict.s3.logincomponent.interfaces.LoginComponent;
import nl.fhict.s3.logincomponent.interfaces.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    private LoginComponent sut;
    private User fakeUser;

    @BeforeEach
    void init() {
        sut = new LoginComponentImpl();
        fakeUser = getFakeUser("Leon");
    }

    private User getFakeUser(final String name) {
        return new User() {
            private UUID id;

            @Override
            public String getName() {
                return name;
            }

            @Override
            public UUID getId() {
                return id;
            }

            @Override
            public void setName(String newName) {

            }

            @Override
            public void setId(UUID newId) {
                id = newId;
            }
        };
    }

    @Test
    void registerUser_ShouldReturnUserWithValidId() {
        // assign

        // act
        final User registeredUser = sut.registerUser(fakeUser);
        final UUID actual = registeredUser.getId();

        // assert
        assertNotNull(actual);
    }
}
