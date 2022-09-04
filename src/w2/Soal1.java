package w2;
import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		System.out.println("Nilai var CM_PER_INCH pada class Soal2v2: " + Soal2v2.CM_PER_INCH);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan angka: ");
		
		var angka = input.nextDouble();
		input.close();
		
		if(angka < Long.MIN_VALUE || angka > Long.MAX_VALUE) {
			System.out.println(angka + " cannot be fitted anywhere");
		}else {	
			System.out.println((angka + " can be fitted in: "));
			if(angka > Byte.MIN_VALUE && angka < Byte.MAX_VALUE) {
				System.out.println("* Byte");
			}
			if(angka > Short.MIN_VALUE && angka < Short.MAX_VALUE) {
				System.out.println("* Short");
			}
			if(angka > Integer.MIN_VALUE && angka < Integer.MAX_VALUE) {
				System.out.println("* Integer");
			}
			if(angka > Long.MIN_VALUE && angka < Long.MAX_VALUE) {
				System.out.println("* Long");
			}
		}

		
	}
	
}
