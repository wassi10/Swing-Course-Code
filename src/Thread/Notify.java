package Thread;
class Total extends Thread{
	int total=0;
	public void run() {
		
//		for(int i=1;i<=10;i++) {
//			total = total+100;
//		}
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total = total+100;
			}
			this.notify();
		}
		
	}


	
	public static void main(String[] args) throws InterruptedException {
		Total te = new Total();
		te.start();
//		System.out.println(te.total);
		
		synchronized (te) {
			te.wait();
			System.out.println(te.total);
		}
	}
}

