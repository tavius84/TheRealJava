package weather;

public class WeatherConditionals {

        public static String getWeatherAdvice(int temperature, String description) {
            boolean windy = false;
            if(description.indexOf("windy" ) >= 0){
                windy = true;
            }
            if(description.indexOf("windy" ) >=0 && temperature > 100){
                return ("It can NOT snow if temperature exceeds 100!");
            }
            else {
                return "Too windy or cold enjoy watching the weather through your window!";
            }
        }

}
