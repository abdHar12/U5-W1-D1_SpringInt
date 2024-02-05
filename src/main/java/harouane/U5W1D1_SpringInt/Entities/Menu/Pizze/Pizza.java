package harouane.U5W1D1_SpringInt.Entities.Menu.Pizze;

import harouane.U5W1D1_SpringInt.Entities.Menu.Menu;
import harouane.U5W1D1_SpringInt.Entities.Menu.Toppings.Topping;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public abstract class Pizza extends Menu {

    static final Set<String> basicToppings = new HashSet<>(Arrays.asList("Tomato", "Cheese"));
    HashSet<Topping> toppings;

    public Pizza(String name, double calories, double price, HashSet<Topping> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return name + ": " + basicToppings + ", " + toppings + "-> Costo: " + price + ", Calorie: " + calories;
    }


}
