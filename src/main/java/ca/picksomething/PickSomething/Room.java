package ca.picksomething.PickSomething;

import java.util.List;
import lombok.Data;

@Data
public class Room {
    public long id;
    public String location;
    public float radius;
    public int numUsers;
    public List<Restaurant> selectionLists;
    public List<Restaurant> results;

}
