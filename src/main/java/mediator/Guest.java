package mediator;

import java.time.LocalDateTime;

public class Guest {

    private Integer id;
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(int numberOfTowrers) {
        this.frontDesk.getTowers(this, numberOfTowrers);
    }

    private void dinneer(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public Integer getId() {
        return this.id;
    }
}
