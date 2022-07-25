package ca.picksomething.PickSomething;

import java.util.List;
import lombok.Data;

@Data
public class SelectionList {
    public User user;
    public List<Restaurant> restaurantList;
}
