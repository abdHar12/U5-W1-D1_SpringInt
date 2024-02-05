package harouane.U5W1D1_SpringInt.Entities.Menu;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Pizza extends MenuItem {

    List<Topping> toppings;

    public Pizza(String name, double calories, double price, List<Topping> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return name + ": " + toppings + "-> Costo: " + price + ", Calorie: " + calories;
    }


}
