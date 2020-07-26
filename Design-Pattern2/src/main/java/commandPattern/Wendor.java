package commandPattern;

import java.util.*;

   public class Wendor {
   private List<Order> orderList = new ArrayList<Order>(); 

   public void takeOrder(Order order){
      orderList.add(order);		
   }

   public String placeOrders(){
	   String s="";
      for (Order order : orderList) {
         s=order.execute();
      }
      orderList.clear();
      
	return s;
   }
}