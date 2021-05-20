public class ToiletMan extends Staff {

    private int toiletPaperStock;


    public ToiletMan(String name, int toiletPaperStock) {
        super(name);
        this.toiletPaperStock = toiletPaperStock;
    }

    public int getToiletPaperStock() {
        return toiletPaperStock;
    }

    public void setToiletPaperStock(int toiletPaperStock) {
        this.toiletPaperStock = toiletPaperStock;
    }



    private void fillToiletStallsWithToiletPaper(int amountOfStalls) throws Exception {
        toiletPaperStock -= amountOfStalls;
        if (toiletPaperStock < 0){
            throw new Exception("Toiletpaper is out of stock");
        }
        //remove the amount of your stock
        //this method will throw a selfmade Exception if you're
        //out of toilet paper
    }

    private void promoteSafeFun(Customer customer){
        if(customer.isDTF() && !customer.isHasCondom() && customer.getBeersThatTheyDrunk() < 3){
            customer.setHasCondom(true);
        }
        //check if Customer is DTF and if he has no condom
        //AND if he had less than 3 drinks
        //give them a condom
    }
}
