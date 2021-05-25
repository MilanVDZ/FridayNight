import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCustomer {

    // DENIS

    @Test
    public void feelingConfident(){
        Customer denis = new Customer("denis",10,49,true,true);
        denis.setDrinksThatTheyDrunk(7);
        denis.feelingConfident();
        Assertions.assertTrue(denis.feelingConfident());
    }

    @Test
    public void tipTheCuteStaff(){
        BarTender barTender = new BarTender("denis",2.50,5);
        Customer denis = new Customer("denis",10,50,true,false);
        denis.setDrinksThatTheyDrunk(7);
        denis.tipTheCuteStaff(barTender);
        Assertions.assertEquals(denis.getDrinksThatTheyDrunk()*1.50,barTender.getAmountsOfTips());

    }
}
