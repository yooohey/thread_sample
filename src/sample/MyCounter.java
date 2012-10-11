package sample;

class MyClient extends Thread{
	private Counter counter;
	
	MyClient(Counter counter2){
		this.counter = counter2;
	}
	
	public void run(){
		for(int i=0;i<10000000;i++){
			this.counter.increment();
		}
	}
}

class Counter {
	private static Counter my;
	private int amount;
	
	private Counter(){
		
	}
	public static Counter getInstance(){
		synchronized(my){	
			if(my == null){
				my = new Counter();
			}
		}
		return my;
	}
	
	public synchronized void increment(){
			this.amount++;
	}
	public int returnAmount(){
		return this.amount;
	}
}

public class MyCounter {
	public static void main(String[] args) throws Exception {
		Counter counter = Counter.getInstance();
		
		MyClient cl1 = new MyClient(counter);
		MyClient cl2 = new MyClient(counter);
		MyClient cl3 = new MyClient(counter);
		
		cl1.start();
		cl2.start();
		cl3.start();
		
		cl1.join();
		cl2.join();
		cl3.join();
		
		System.out.println(counter.returnAmount());
	}
}
