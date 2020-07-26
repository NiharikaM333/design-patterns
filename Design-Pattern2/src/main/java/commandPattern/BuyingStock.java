package commandPattern;

public class BuyingStock implements Order {
	   private Stock abcStock;

	   public BuyingStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public String execute() {
	       return abcStock.buy();
	   }
	}