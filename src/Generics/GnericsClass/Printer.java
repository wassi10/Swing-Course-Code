package GnericsClass;

public class Printer <T,T1>{
	T toPrint;T1 toPrint1;
	
	public Printer(T toPrint,T1 toPrint1) {
		this.toPrint = toPrint;
                this.toPrint1 = toPrint1;
	}
	public void print() {
		System.out.println(toPrint);
                System.out.println("hjj");
                System.out.println(toPrint1);
	}
}
