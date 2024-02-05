package harouane.U5W1D1_SpringInt.Entities.Menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MenuItem {
    protected double calories;
    protected double price;
    protected String name;

    public MenuItem(String name, double calories, double price) {
        this.calories = calories;
        this.price = price;
        this.name = name;
    }


}


