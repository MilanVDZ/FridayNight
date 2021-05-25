import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestToiletMan {

    //GREGORY

    @Test
    public void fillToiletStallsWithToiletPaperTest() throws Exception {
        ToiletMan toiletman = new ToiletMan("greg", 5);
        toiletman.fillToiletStallsWithToiletPaper(1);
        Assertions.assertEquals(4, toiletman.getToiletPaperStock());
        Assertions.assertThrows(Exception.class, () -> {
                    toiletman.fillToiletStallsWithToiletPaper(5);
                }
        );
    }

    @Test
    public void promoteSafeFunTest(){
        Customer customer = new Customer("greg",10,1,true,false);
        customer.setDrinksThatTheyDrunk(2);
        ToiletMan toiletMan = new ToiletMan("greg", 2);
        toiletMan.promoteSafeFun(customer);
        Assertions.assertTrue(customer.isHasCondom());
    }
}