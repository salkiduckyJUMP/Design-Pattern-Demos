package com.collabera.designpatterns.observerpattern;

public class GrabStocks {
	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setApplePrice(677.60);
		stockGrabber.setGooglePrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setApplePrice(677.60);
		stockGrabber.setGooglePrice(676.40);
		
		stockGrabber.unregister(observer1);
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getApple = new GetTheStock(stockGrabber, 2, "Apple", 677.40);
		Runnable getGoogle = new GetTheStock(stockGrabber, 2, "Google", 676.40);

		new Thread(getIBM).start();
		new Thread(getApple).start();
		new Thread(getGoogle).start();


		

	}
}
