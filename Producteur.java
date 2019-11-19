package tp2ques2ElhamAmin;
import java.util.Random;
import java.time.LocalTime;

public class Producteur extends Thread{
	Queue q;
	public Producteur(Queue q) {
			this.q = q;
	}
	public void run() {
		Thread.yield();
		Random r = new Random();
		while(true) {
			Item x = new Item(3);
			
			System.out.println("I am producteur , the size is: "+ (q.tail - q.head));
			LocalTime myObj = LocalTime.now();
			System.out.println("time: "+ myObj);
			this.q.enq(x);
			
			/*try {
				sleep(r.nextInt(5));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}
