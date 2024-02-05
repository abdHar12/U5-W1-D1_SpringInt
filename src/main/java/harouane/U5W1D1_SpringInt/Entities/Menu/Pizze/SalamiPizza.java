package harouane.U5W1D1_SpringInt.Entities.Menu.Pizze;

import harouane.U5W1D1_SpringInt.Entities.Menu.Toppings.Topping;

import java.util.Arrays;
import java.util.HashSet;


public class SalamiPizza extends Pizza {
    public SalamiPizza() {
        super("Salami Pizza", 1160, 5.99, new HashSet<Topping>(Arrays.asList()));
    }
}
