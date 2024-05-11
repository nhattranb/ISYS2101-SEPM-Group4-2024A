package java.t4.backend;

import static spark.Spark.get;
 
import spark.Request;
import spark.Response;
import spark.Route;

public class rest_api {
    public static void connection() {
        // the GET route
        get(new Route("/account/:id") {
            @Override
        public Object handle(Request request, Response response) {
            return  "User: username=test, email=test@test.net";
        }
        });

        // the POST route
        post(new Route("/account/:id") {
            @Override
        public Object handle(Request request, Response response) {
            String username = request.queryParams("username");
            String password = request.queryParams("password");
            user u = new user();
            u.setUsername(username);
            u.setEmail(email);
            userDao.create(user);
            response.status(201); // 201 Created
            return u;
        }
        });
    }
}
