package Observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private final int observerID;

    public StockObserver(Subject stockGrabber) {
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double IBM, double AAPL, double GOOG) {
        this.ibmPrice = IBM;
        this.aaplPrice = AAPL;
        this.googPrice = GOOG;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}
