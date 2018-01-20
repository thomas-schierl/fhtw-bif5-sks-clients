package at.technikumwien.sksue.other;

import java.net.*;

public class PasswordAuthenticator {

    private PasswordAuthenticator() {
    }

    public static void install(String username, String password) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });
    }
}
