package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	/* HINT: You will most likely need to do this with recursion */
	static int thread = 0;
	public static void main(String[] args) {
		loop();
	}
	public static void loop(){
		thread++;
		System.out.println("Hello From Thread: " + thread + "!");
		if(thread >= 50){
		Thread t2 = new Thread(()->loop());
		t2.start();
		}
		
	}
}
