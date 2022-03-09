package com.example.weatherthingmar9;

import com.example.weatherthingmar9.entity.City;
import com.example.weatherthingmar9.entity.Weather;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Controller
@AllArgsConstructor
public class WeatherController {

    private WeatherService weatherService;

    @GetMapping("")
    public String home() {
        return "begin";
    }

    @PostMapping("/weather")
    public String getWeather(@ModelAttribute City city, Model model) {
//        Weather cityWeather = ;
                weatherService.getWeatherForCity(city.getName(), "90290811b7c94493a26140206220703");

        model.addAttribute("cityName", city.getName());
//        model.addAttribute("aqi", cityWeather.getCurrent().getAirQuality().toString());
//        model.addAttribute("temp", cityWeather.getCurrent().getTempC());
        return "weather";
    }

}
