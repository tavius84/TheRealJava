package weather;

public class StringTester {
    public static void main(String[] args) {
        String weatherCondition = "not available";
        System.out.println(weatherCondition.length());
        String weatherCondition1 = new String("mixed rain and snow");
        String weatherCondition2 = new String("mixed rain and snow");
        System.out.println(weatherCondition.indexOf("thunder"));
        boolean result = (weatherCondition1.equals(weatherCondition2));


        System.out.println(WeatherConditionals.getWeatherAdvice(32, "heavy snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(33, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));

    }
}
