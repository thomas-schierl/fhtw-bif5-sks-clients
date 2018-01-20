package at.technikumwien.sksue.other;

import java.io.*;
import javax.ws.rs.client.*;
import javax.xml.bind.*;

public class RequestFilter implements ClientRequestFilter {

    private String username;
    private String password;

    public RequestFilter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void filter(ClientRequestContext request) throws IOException {
        String token = username + ":" + password;
        String basicAuthentication = "Basic " + DatatypeConverter.printBase64Binary(token.getBytes("UTF-8"));
        request.getHeaders().add("Authorization", basicAuthentication);
    }
}
