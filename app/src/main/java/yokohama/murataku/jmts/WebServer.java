package yokohama.murataku.jmts;

import static spark.Spark.*;

public class WebServer {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World!");
        get("/hello/:name", (req, res) -> "Hello " + req.params(":name"));
    }
}
