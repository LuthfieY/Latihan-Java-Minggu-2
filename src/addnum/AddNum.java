package addnum;

import java.io.*;
import w2.Soal2v2;

/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer number and Prints
 * the output on the screen.
 * <p>
 * <b>Note</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *@author Luthfie
 */

public class AddNum {
	/**
	 * This method is used to add two integers. This is
	 * the simplest form of a class method, just to
	 * show the usage of various javadoc Tags.
	 * @param numA This is the first parameter to addNum method
	 * @param numB This is the second parameter to addNum method
	 * @return int This returns sum of numA and numB.
	 */
	
	public int addNum(int numA, int numB) {
		return numA + numB;
	}
	
	public static void main(String args[]) throws IOException {
		AddNum obj = new AddNum();
		int sum = obj.addNum(10, 20);
		
		System.out.println("Sum of 10 and 20 is: " + sum);
		System.out.println("Nilai var CM_PER_INCH pada package w2, class Soal2v2: " + Soal2v2.CM_PER_INCH);
	}
	
}
