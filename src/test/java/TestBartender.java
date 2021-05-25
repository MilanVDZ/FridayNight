import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//MILAN
public class TestBartender {
        @Test
        public void buyBeertest() {
                Customer customer = new Customer("Mike",25,2.00,true,true);
                BarTender barTender = new BarTender("Dirk", 2.5, 5);
                barTender.buyBeer(customer,2);
                Assertions.assertEquals(1,customer.getEuros());
                Assertions.assertEquals(0,customer.getBeersThatTheyDrunk());
        }

        @Test
        public void buyCoctailTest(){
                Customer customer = new Customer("Jonas",27,1.00,true,true);
                BarTender barTender = new BarTender("Frank", 2.5, 5);
                barTender.buyCocktail(customer,1);
                Assertions.assertEquals(1,customer.getEuros());
                Assertions.assertEquals(0,customer.getBeersThatTheyDrunk());
        }

}
