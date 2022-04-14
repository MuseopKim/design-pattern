package builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailPlan {

    private int day;

    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }
}
