import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public String findRestaurantByName(String restaurantName) {
        for (Restaurant restaurant : restaurants) {

            if (restaurant.getName().equals(restaurantName)) {
                return restaurantName;
            }
        }
        return restaurantName;
    }

    public Restaurant Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public String removeRestaurant(String pumpkin_tales, String restaurantName, LocalTime localTime, LocalTime parse) throws restaurantNotFoundException {
        String restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public String addRestaurant(String pumpkin_tales, String restaurantName, LocalTime localTime, LocalTime parse) throws restaurantNotFoundException {
        String restaurantToBeAdded = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeAdded);
        return restaurantToBeAdded;
    }


    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}


