package ca.picksomething.PickSomething;

import java.util.List;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PickSomethingController {

    @PostMapping
    public Room newRoom(@RequestBody Room room) {
        System.out.println(room);
        return null;
    }

    @PostMapping("{roomId}/submit")
    public void submitRestaurantSelections(@RequestBody @NonNull SelectionList selectionList, @PathVariable long roomId) {
        System.out.println(selectionList);
    }

    @GetMapping("{roomId}/results")
    public List<Restaurant> getResults(@PathVariable long roomId) {

        return null;
    }

    @GetMapping("{roomId}/get-qualifying-restaurants")
    public List<Restaurant> getQualifyingRestaurants(@PathVariable long roomId) {

        return null;
    }
}
