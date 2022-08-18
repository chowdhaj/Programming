package simplycoding.practice;

interface Store extends Tax{
	
	// buy, sell, price
	
	Object buy(double cost);
	double sell(Object item);
	double buy(Object item);
	
	default Object trade(Object item) {
		return new Object();
	}

}
