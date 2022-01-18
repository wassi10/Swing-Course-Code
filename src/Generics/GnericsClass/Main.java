package GnericsClass;

public class Main {
	public static void main(String[] args) {
//		IntegerPrinter ip = new IntegerPrinter(99);
//		ip.print();
//		DoublePrinter dp = new DoublePrinter(5.6);
//		dp.print();
//		Printer<Integer> IntegerPrint = new Printer<>(6);
//		IntegerPrint.print();
		Printer<String,Integer> StringPrint = new Printer<String,Integer>("String",1);
		StringPrint.print();
	}
}


//Bounded