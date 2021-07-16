package company;

public class A4_Que_2 {

	public static void main(String[] args) {
	     
	     priceLambda obj= n -> {
	    	 
	            if(n>10000) {
	                return ("The order status: ACCEPTED");
	            }
	            else {
	                return ("The order status: NOT ACCEPTED");
	            }
	        };
	        
	        System.out.println(obj.price(12000));
	        System.out.println(obj.price(15600));
	        System.out.println(obj.price(6500));
	        System.out.println(obj.price(23500));
	        System.out.println(obj.price(4050));
	        System.out.println(obj.price(9950));

	    }
	       interface priceLambda {  
	    	                        String price(int n);
	                              }
	
	}

