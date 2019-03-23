package nl.fhict.s3.loginservice;

import nl.fhict.s3.logincomponent.LoginComponentImpl;
import nl.fhict.s3.logincomponent.interfaces.LoginComponent;
import nl.fhict.s3.loginservice.model.LocalUser;

class LoginComponentTester {

    static void testLoginComponentImpl() {
        LoginComponent loginComponent = new LoginComponentImpl();
        loginComponent.registerUser(new LocalUser("Nico K."));
        loginComponent.registerUser(new LocalUser("Leon van B."));
        loginComponent.registerUser(new LocalUser("Frenk R."));

        System.out.println(loginComponent.getAllUsers());
    }
}