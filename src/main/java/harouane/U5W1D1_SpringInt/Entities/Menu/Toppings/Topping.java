package harouane.U5W1D1_SpringInt.Entities.Menu.Toppings;

import harouane.U5W1D1_SpringInt.Entities.Menu.Menu;


public abstract class Topping extends Menu {
    public Topping(String name, double calories, double price) {
        super(name, calories, price);
    }
}
