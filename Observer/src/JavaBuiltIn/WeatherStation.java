package JavaBuiltIn;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMesurements(80, 65);
        weatherData.setMesurements(82, 70);
        weatherData.setMesurements(78, 90);

    }
}
