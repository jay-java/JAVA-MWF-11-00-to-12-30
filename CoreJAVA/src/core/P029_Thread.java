package core;
class Counter{
	private int count;
	Counter(int count){
		this.count = count;
	}
	public void countMe() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println("thread : "+count+" iteration : "+i);
			Thread.sleep(500);
		}
	}
}
class ByThreadClass extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(" iteration by thread class : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class ByRunnable extends Object implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(" iteration by runnable interface : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class P029_Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		long start_time = System.currentTimeMillis();
		Counter c = new Counter(1);
		c.countMe();
		System.out.println("++++++++++++++++++");
		Counter c1 = new Counter(2);
		c1.countMe();
		long end_time = System.currentTimeMillis();
		System.out.println("total time to execute thread is : "+(end_time-start_time));
		
		ByThreadClass b = new ByThreadClass();
		b.run();
		
		ByRunnable r = new ByRunnable();
		r.run();
	}
}
