package at.technikumwien.sksue.resource;

import at.technikumwien.sksue.other.*;
import at.technikumwien.sksue.resource.entities.*;
import java.util.*;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

/**
 * @author Link
 */
public class StudioRestClient {

    public static void main(String[] args) {
        Studio studio = handleInput();

        WebTarget target = ClientBuilder.newClient().register(new RequestFilter("admin", "admin")).target(("http://localhost:8080/sksuebung/resources/studio"));
        Response response = target.request().post(Entity.json(studio));
        System.out.println(response.getStatusInfo());
    }

    public static Studio handleInput() {
        Studio studio = new Studio();
        Scanner in = new Scanner(System.in);
        String input;

        System.out.println("You are creating a new studio.");
        System.out.print("Name: ");
        input = in.nextLine();
        studio.setName(input);

        System.out.print("Country code: ");
        input = in.nextLine();
        studio.setCountryCode(input);

        System.out.print("Post code: ");
        input = in.nextLine();
        studio.setPostCode(input);

        return studio;
    }
}
