package harouane.U5W1D1_SpringInt.Entities.Menu.Pizze;

import harouane.U5W1D1_SpringInt.Entities.Menu.Toppings.Ham;
import harouane.U5W1D1_SpringInt.Entities.Menu.Toppings.Pineapple;
import harouane.U5W1D1_SpringInt.Entities.Menu.Toppings.Topping;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashSet;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class HawaiianPizza extends Pizza {

    public HawaiianPizza() {
        super("Hawaiian Pizza", 1024, 6.49, new HashSet<Topping>(Arrays.asList(new Ham(), new Pineapple())));
    }


}