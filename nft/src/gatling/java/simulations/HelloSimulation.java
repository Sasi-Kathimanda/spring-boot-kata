package simulations;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;
import java.time.Duration;

import static io.gatling.javaapi.core.CoreDsl.rampUsers;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class HelloSimulation extends Simulation {

    HttpProtocolBuilder httpProtocol = http
            .baseUrl("http://localhost:8080")
            .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");

    ScenarioBuilder scn = scenario("simulations.HelloSimulation")
            .exec(http("request_1")
                    .get("/").check(status().is(200)));

    {
        setUp(scn.injectOpen(rampUsers(10).during(Duration.ofSeconds(60))))
                .protocols(httpProtocol);
    }
}
