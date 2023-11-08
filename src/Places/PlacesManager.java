package Places;

import java.util.ArrayList;

public class PlacesManager {

    public void enterPlace(Place place) {
        place.appear();
        currPlace = place;
    }
    public void changePlace(Place place) {
        leavePlace();
        enterPlace(place);

    }
    public void leavePlace() {
        currPlace.disappear();
        currPlace = null;
    }
    public void increaseCurrentPlace() {
        if (isPlaceIncreasable()) {
            ((IIncreasable)currPlace).increase();
        }
    }

    private Place currPlace;

    private Boolean isPlaceIncreasable() {
        return (currPlace instanceof IIncreasable);
    }

}
