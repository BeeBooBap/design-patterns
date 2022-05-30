package DesignPatterns.Observer;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserver = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(101.00);
        stockGrabber.setAAPLPrice(321.00);
        stockGrabber.setGOOGPrice(500.01);

    }
}
