package Thread;
public class Interrupt extends Thread
{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
//				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		Interrupt t = new Interrupt();
		t.start();
		t.interrupt();
	}
}
