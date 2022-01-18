//package Thread;
//class A{
//	int total_seats=10;
//	
//	 void bookSeat(int seats)
//	{
//		System.out.println("Hello :"+Thread.currentThread().getName());
//		System.out.println("Hello :"+Thread.currentThread().getName());
//		System.out.println("Hello :"+Thread.currentThread().getName());
//		System.out.println("Hello :"+Thread.currentThread().getName());
//		System.out.println("Hello :"+Thread.currentThread().getName());
//		
////		synchronized (this) {
////			
////		}
//		if(total_seats>=seats) {
//			System.out.println(seats+" seats are booked successfully");
//			total_seats = total_seats - seats;
//			System.out.println("Seats Left : "+total_seats);
//		}
//		else {
//			System.out.println("Sorry, Seats can't be booked!");
//			System.out.println("Seats Left : " + total_seats);
//		}
//		
//		System.out.println("Hello :"+Thread.currentThread().getName());
//		System.out.println("Hello :"+Thread.currentThread().getName());
//		System.out.println("Hello :"+Thread.currentThread().getName());
//		System.out.println("Hello :"+Thread.currentThread().getName());
//	}
//}
//
//public class SeatBookApp2 extends Thread{
//	static A b;
//	int seats;
//	public void run() {
//		b.bookSeat(seats);
//	}
//	public static void main(String[] args) {
//		b =new A();
//		
//		SeatBookApp2 person1 = new SeatBookApp2();
//		person1.seats=7;
//		person1.start();
//		
//		SeatBookApp2 person2 = new SeatBookApp2();
//		person2.seats=1;
//		person2.start();
//	}
//}
