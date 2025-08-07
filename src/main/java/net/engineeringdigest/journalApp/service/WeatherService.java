package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import net.engineeringdigest.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private  static final String API = "http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWheater(String city){
        String finalAPI = API.replace("CITY", city).replace("API_KEY", apiKey);
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }

    // this part is just for understanding a concept of How Consume extrenal  POST API effectively
    // NOTE: This function does not work beacuse the weather api does not have any post api feature
    public WeatherResponse postWheater(String city){
        String finalAPI = API.replace("CITY", city).replace("API_KEY", apiKey);

//        String requestBody = "{\n" +
//                "  \"userName\":\"suraj\", \n" +
//                "  \"password\": \"suraj\"\n" +
//                "}  ";
//        HttpEntity<String> httpEntity = new HttpEntity<>(requestBody);

//        HttpHeaders headers = new HttpHeaders();
//        headers.set("key", "value");

        User user = User.builder().userName("suraj").password("suraj").build();
        HttpEntity<User> httpEntity = new HttpEntity<>(user);

        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.POST, httpEntity, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }
}
