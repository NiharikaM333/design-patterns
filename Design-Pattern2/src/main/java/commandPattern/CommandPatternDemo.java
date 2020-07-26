package commandPattern;

public class CommandPatternDemo {
	   public String Buy(){
	      Stock abcStock = new Stock();

	      BuyingStock buyStockOrder = new BuyingStock(abcStock);
	      

	      Wendor wendor = new Wendor();
	      wendor.takeOrder(buyStockOrder);
	     return wendor.placeOrders();
	   }
	   public String Sell(){
		      Stock abcStock = new Stock();

		      SellingStock sellStockOrder = new SellingStock(abcStock);
		      

		      Wendor wendor = new Wendor();
		      wendor.takeOrder(sellStockOrder);
		     return wendor.placeOrders();
		   }
		}