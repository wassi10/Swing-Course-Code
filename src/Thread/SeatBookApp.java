//package Thread;
//class A{
//	int total_seats=10;
//	
//	synchronized void bookSeat(int seats)
//	{
//		if(total_seats>=seats) {
//			System.out.println(seats+" seats are booked successfully");
//			total_seats = total_seats - seats;
//			System.out.println("Seats Left : "+total_seats);
//		}
//		else {
//			System.out.println("Sorry, Seats can't be booked!");
//			System.out.println("Seats Left : " + total_seats);
//		}
//	}
//}
//
//public class SeatBookApp extends Thread{
//	static A b;
//	int seats;
//	public void run() {
//		b.bookSeat(seats);
//	}
//	public static void main(String[] args) {
//		b =new A();
//		
//		SeatBookApp person1 = new SeatBookApp();
//		person1.seats=7;
//		person1.start();
//		
//		SeatBookApp person2 = new SeatBookApp();
//		person2.seats=5;
//		person2.start();
//	}
//}
