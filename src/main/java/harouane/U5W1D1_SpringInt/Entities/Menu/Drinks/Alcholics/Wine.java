package harouane.U5W1D1_SpringInt.Entities.Menu.Drinks.Alcholics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wine extends Alcholic {
    public Wine() {
        super("Wine", 607, 7.49, 0.75, 13);
    }

}
