package com.kodilla.testing.weather.mock;                                     // [1]

import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;// [5]

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTest {                                              // [7]
/*
    @Mock
    private Temperatures temperaturesMock;
    @Test                                                                      // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1); // [10]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap)
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }
    @Test
    void testGetAverageWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap)
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageValues = weatherForecast.getAverage();
        }
*/
}