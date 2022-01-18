package Thread;
class SeatBook{
	static int total_seats=20;
	
	synchronized static void bookSeat(int seats)
	{

		try {
			if(total_seats>=seats) {
				System.out.println(seats+" seats are booked successfully");
				total_seats = total_seats - seats;
				System.out.println("Seats Left : "+total_seats);
			}
			else {
				System.out.println("Sorry, Seats can't be booked!");
				System.out.println("Seats Left : " + total_seats);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
class MyThread1 extends Thread{
	SeatBook b;
	int seats;
	public MyThread1(SeatBook b, int seats) {
		this.b=b;
		this.seats=seats;
	}
	public void run() {
		b.bookSeat(seats);
	}
}
class MyThread2 extends Thread{
	SeatBook b;
	int seats;
	public MyThread2(SeatBook b, int seats) {
		this.b=b;
		this.seats=seats;
	}
	public void run() {
		b.bookSeat(seats);
	}
}
public class SeatBookApp3 extends Thread{
	
	public static void main(String[] args) {

		SeatBook b1 = new SeatBook();
		MyThread1 t1 = new MyThread1(b1, 7);
		t1.start();
		MyThread1 t2 = new MyThread1(b1, 6);
		t2.start();
		
		//--------
		SeatBook b2 = new SeatBook();
		MyThread2 t3 = new MyThread2(b2, 4);
		t3.start();
		MyThread2 t4 = new MyThread2(b2, 9);
		t4.start();
	}
}
