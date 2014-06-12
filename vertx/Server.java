import org.vertx.java.core.Handler;
import org.vertx.java.core.net.NetSocket;
import org.vertx.java.core.streams.Pump;
import org.vertx.java.platform.Verticle;


import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.http.HttpServerRequest;
import java.util.Map;

public class Server extends Verticle {

    public void start() {
    //    vertx.createNetServer().connectHandler(new Handler<NetSocket>() {
    //        public void handle(final NetSocket socket) {
    //            Pump.createPump(socket, socket).start();
    //        }
    //        }).listen(1234);

         HttpServer server = vertx.createHttpServer();

         server.requestHandler(new Handler<HttpServerRequest>() {
             public void handle(HttpServerRequest request) {
                         request.response().headers().set("Content-Type", "text/plain");
                         request.response().end("Hello world");
             }
         }).listen(8080, "43.8.251.171");

    }
}
