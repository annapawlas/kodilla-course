package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateTheAverage(){
        double sum = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            sum += temperature.getValue();
        }
        return sum/temperatures.getTemperatures().size();
    }

    public double calculateTheMedian(){
        List<Double> series = new ArrayList<>();
        for (Map.Entry<String, Double> entry : temperatures.getTemperatures().entrySet()) {
            for (double count = entry.getValue(); count > 0; count--) {
                series.add(entry.getValue());
            }
        }
        double median = 0;
        Collections.sort(series);
        if (series.size() % 2 == 0) {
            median = series.get((series.size() - 1) / 2);
        } else {
            median = (series.get((series.size() - 1) / 2) + series.get(series.size() / 2)) / 2;
        }
        return median;
    }
}