package ru.netology.test;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MobileBankApiPostTest {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("test post")
                // Выполняемые действия
        .when()
                .post("/post")
                // Проверки
        .then()
                .statusCode(200)
                .body("data", equalTo("test post"));
    }
}
