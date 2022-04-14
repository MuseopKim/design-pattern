package builder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan beachTrip = director.longBeachTrip();
    }
}
