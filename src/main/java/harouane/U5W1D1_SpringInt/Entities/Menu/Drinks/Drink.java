package harouane.U5W1D1_SpringInt.Entities.Menu.Drinks;

import harouane.U5W1D1_SpringInt.Entities.Menu.Menu;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public abstract class Drink extends Menu {
    double capacity;

    public Drink(String name, double calories, double price, double capacity) {
        super(name, calories, price);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "-> Costo: " + price + ", Calorie: " + calories;
    }
}
