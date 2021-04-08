package com.kodilla.testing.weather.stub;
import java.util.*;


public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }


    public double getAvg() {
        Map<String, Double> resultMap = new HashMap<>();
        double result = 0;

        for (Map.Entry<String, Double> tmp : temperatures.getTemperatures().entrySet()) {
            resultMap.put(tmp.getKey(), tmp.getValue());
            result = result + tmp.getValue();
        }
        return result / resultMap.size();
    }

    public List<Double> getSortedList() {
        Map<String, Double> resultMap = new HashMap<>();
        List<Double> list = new LinkedList<>();

        for (Map.Entry<String, Double> tmp : temperatures.getTemperatures().entrySet()) {
            resultMap.put(tmp.getKey(), tmp.getValue());
            list.add(tmp.getValue());
        }
        Collections.sort(list);
        return list;
    }

    public Double getMedian(List<Double> list) {
        if(list.size() % 2 == 0) { // if even
            int middleElement = (list.size() / 2); // first middle  | 1 2 '3' 4 5 6 |
            int middleElementPlusOne = middleElement; //second middle  | 1 2 3 '4' 5 6 |
            double getMiddleElement = list.get(middleElement -1);    //get first middle | 1 2 '3' 4 5 6 |
            double getMiddleElementPlusOne = list.get(middleElementPlusOne); //get second middle | 1 2 3 '4' 5 6 |
            return (getMiddleElement + getMiddleElementPlusOne) / 2; // return median  (3 + 4) / 2
        } else { // if odd
            int middle2 = ((list.size() -1) / 2); // get middle  (5 - 1) / 2
            return list.get(middle2);  // return median     2 - middle element
        }
    }
}



