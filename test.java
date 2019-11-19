package tp2ques2ElhamAmin;

import java.time.LocalTime;

public class test {
	
	public static void main(String []args) throws Exception{
		Queue q = new Queue();
		Consommateur cons1 = new Consommateur(q);
		Consommateur cons2 = new Consommateur(q);
		Producteur prod = new Producteur(q);
		
		//          first question
		//cons1.start();
		//prod.start();
		
		//           second question
 
         
        // print the maximum priority of this thread  
		
        cons1.setPriority(Thread.MAX_PRIORITY);   
        cons2.setPriority(Thread.MAX_PRIORITY); 
        prod.setPriority(Thread.MIN_PRIORITY);   
        
        LocalTime myObj = LocalTime.now();
		System.out.println("time: "+ myObj);
		cons1.start();
		cons2.start();
		prod.start();
		
		
		
	}

}
