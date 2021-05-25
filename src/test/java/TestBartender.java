import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//MILAN
public class TestBartender {
        @Test
        public void buyBeertest() {
                Customer customer = new Customer("Mike",14,1.00,true,false);
                BarTender barTender = new BarTender("Dirk", 1.5, 3.5);
                barTender.buyBeer(customer,2);
                Assertions.assertEquals(1,customer.getEuros());
                Assertions.assertEquals(0,customer.getBeersThatTheyDrunk());
        }

        @Test
        public void buyCoctailTest(){
                Customer customer = new Customer("Mike",14,1.00,true,false);
                BarTender barTender = new BarTender("Dirk", 1.5, 3.5);
                barTender.buyCocktail(customer,2);
                Assertions.assertEquals(1,customer.getEuros());
                Assertions.assertEquals(0,customer.getBeersThatTheyDrunk());
        }

}
