package commandPattern;

public class SellingStock implements Order {
	   private Stock abcStock;

	   public SellingStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public String  execute() {
	      return abcStock.sell();
	   }
	}