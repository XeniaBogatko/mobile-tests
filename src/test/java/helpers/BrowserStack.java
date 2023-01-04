package helpers;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class BrowserStack {
    //curl -u "kseniiabogatko_gbDJ2A:VdRu6UvRq8ojJYKpyy5b" -X GET "https://api.browserstack.com/app-automate/sessions/7004353fbfe6bb7748c64ed517e483e302a29a01.json"

    public static String getVideoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .auth().basic("kseniiabogatko_gbDJ2A", "VdRu6UvRq8ojJYKpyy5b")
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
