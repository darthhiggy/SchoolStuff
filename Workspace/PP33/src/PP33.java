import java.util.*;
public class PP33 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		String aCode;
		
		Random r1 = new Random();
		num1 = r1.nextInt(8);
		num2 = r1.nextInt(8);
		num3 = r1.nextInt(8);
		num4 = r1.nextInt(743);
		num5 = r1.nextInt(1000);
		
		
		System.out.print("(" +num1 + num2 + num3 + ")" + "-" + num4 + "-" + num5);

	}

}
