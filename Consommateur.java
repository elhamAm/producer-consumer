package tp2ques2ElhamAmin;
import java.util.Random;
import java.time.LocalTime;

public class Consommateur extends Thread{
	Queue q;
	public Consommateur(Queue q) {
			this.q = q;
	}
	public void run() {
		Random r = new Random();
		while(true) {
			System.out.println("I am consommateur , the size is: "+ (q.tail - q.head));
			LocalTime myObj = LocalTime.now();
			System.out.println("time: "+ myObj);
			this.q.deq();
			Thread.yield();
			
			/*try {
				sleep(r.nextInt(5));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}	
	}
}
