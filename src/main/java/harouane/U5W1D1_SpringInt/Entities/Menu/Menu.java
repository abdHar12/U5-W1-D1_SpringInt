package harouane.U5W1D1_SpringInt.Entities.Menu;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public abstract class Menu {
    protected double calories;
    protected double price;
    protected String name;

    public Menu(String name, double calories, double price) {
        this.calories = calories;
        this.price = price;
        this.name = name;
    }
}


