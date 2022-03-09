package com.example.weatherthingmar9;

import com.example.weatherthingmar9.entity.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private final WebClient webClient;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://api.weatherapi.com/").build();
    }

    public void getWeatherForCity(String city, String apiKey) {
//        Mono<Weather> weather = ;
                this.webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("v1/current.json")
                        .queryParam("key", apiKey)
                        .queryParam("q", "berlin")
                        .queryParam("aqi", "yes")
                        .build())
                .exchange().doOnSuccess(clientResponse -> System.out.println("clientResponse.statusCode() = " + clientResponse.statusCode()));
//                .retrieve().bodyToMono(Weather.class);
//        System.out.println(weather.block().);
//        return weather.block();
    }
}
