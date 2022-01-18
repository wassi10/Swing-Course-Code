package Thread;
public class Interrupted2 extends Thread{
	public void run() {
		
		System.out.println(Thread.interrupted());
		
		System.out.println(Thread.currentThread().isInterrupted());
		interrupt();
                System.out.println(Thread.interrupted());
                System.out.println(Thread.currentThread().isInterrupted());
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().isInterrupted());
			}
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		
		Interrupted2 t = new Interrupted2();
		t.start();
		
		t.interrupt(); //true
	}
}
