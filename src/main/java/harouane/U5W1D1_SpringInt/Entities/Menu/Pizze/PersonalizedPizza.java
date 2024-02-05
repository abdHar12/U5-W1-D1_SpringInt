package harouane.U5W1D1_SpringInt.Entities.Menu.Pizze;

import harouane.U5W1D1_SpringInt.Entities.Menu.Toppings.Topping;

import java.util.HashSet;

public class PersonalizedPizza extends Pizza {
    static final PizzaMargherita pizzaMargherita = new PizzaMargherita();

    public PersonalizedPizza(HashSet<Topping> toppings) {
        super("Pizza " + toppings.toString(), pizzaMargherita.getCalories(), pizzaMargherita.getPrice(), toppings);
    }
}
