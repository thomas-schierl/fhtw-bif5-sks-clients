package at.technikumwien.sksue.resource;

import at.technikumwien.sksue.other.*;
import at.technikumwien.sksue.resource.entities.*;
import at.technikumwien.sksue.resource.enums.*;
import java.text.*;
import static java.time.Instant.now;
import java.util.*;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

/**
 * @author Link
 */
public class ActorRestClient {

    public static void main(String[] args) {
        Actor actor = handleInput();

        WebTarget target = ClientBuilder.newClient().register(new RequestFilter("admin", "admin")).target(("http://localhost:8080/sksuebung/resources/actor"));
        Response response = target.request().post(Entity.json(actor));
        System.out.println(response.getStatusInfo());
    }

    public static Actor handleInput() {
        Actor actor = new Actor();
        Scanner in = new Scanner(System.in);
        String input;

        System.out.println("You are creating a new actor.");
        System.out.print("First name: ");
        input = in.nextLine();
        actor.setFirstName(input);

        System.out.print("Last name: ");
        input = in.nextLine();
        actor.setLastName(input);

        while (true) {
            try {
                System.out.print("Gender: ");
                input = in.nextLine();
                actor.setSex(Sex.valueOf(input.toUpperCase()));
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println("MALE or FEMALE only.");
            }
        }

        while (true) {
            try {
                System.out.print("Birthdate: ");
                input = in.nextLine();
                if (!input.isEmpty()) {
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    actor.setBirthdate(format.parse(input));
                } else {
                    actor.setBirthdate(Date.from(now()));
                }
                break;
            } catch (ParseException ex) {
                System.out.println("Wrong format! Use dd/MM/yyyy");
            }
        }

        return actor;
    }
}
