package tp2ques2ElhamAmin;

public class Queue {
public volatile int head = 0;
public volatile int tail = 0;
int QSIZE = 2;
Item items[] = new Item[QSIZE];
	public synchronized void enq(Item x) {
		while ((this.tail-this.head) == QSIZE)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.items[this.tail++%QSIZE] = x; // on insère l’élément 
		this.notify(); // on informe les processus bloqués après deq
	}
	
	public synchronized Item deq(){
		while ((this.tail - this.head) == 0) // on attend si la queue est pleine
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.notify(); // on informe les processus bloqués après enq
		return this.items[this.head++%QSIZE]; 
		
	}
}

