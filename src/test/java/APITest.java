import io.restassured.RestAssured;
import io.restassured.response.Response;


public class APITest {
    public static void main(String[] args) {
        // Отправляем POST запрос на страницу входа
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParam("username", "dzmitryi.miadzvedzeu@gmail.com")  // Замените на ваши данные
                .formParam("password", "65Daysofblink?")  // Замените на ваши данные
                .post("https://passport.skillbox.ru/login");  // Укажите правильный URL для входа

        // Получаем статус и тело ответа
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.getBody().asString());

        // Если необходимо, извлекаем токен или другую информацию из ответа
        // Например, если в ответе будет содержаться токен:
        // String token = response.jsonPath().getString("token");
        // System.out.println("Token: " + token);
    }
}