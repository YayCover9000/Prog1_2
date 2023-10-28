import java.util.Scanner;
public class UeberlaufTester {

	public static void main(String[] args) {
		int firstNum;
		int secNum;
		Scanner sc = new Scanner(System.in);
		firstNum = sc.nextInt();
		secNum = sc.nextInt();
		int res;
		boolean plusOne1 = false;
		boolean plusOne2 = false;
		boolean passtNicht = false;
		int MaxIntLength = Integer.MAX_VALUE;
		
		//Berechnung
		if (firstNum <= (MaxIntLength/2)) {
			
		} else if(firstNum == (MaxIntLength/2)+1) {
			plusOne1 = true;
		}
		if(secNum <= (MaxIntLength/2)) {
			
		} else if(secNum == (MaxIntLength/2)+1) {
			plusOne2 = true;
		}
		if(plusOne1 && plusOne2 == true) {
			passtNicht = true;
		}else if(secNum <= (MaxIntLength/2)+1  || firstNum <= (MaxIntLength/2)+1 && passtNicht == false) {	
			res = firstNum + secNum;
			System.out.println("res is: " + res);
		}
		
		if(passtNicht == true) {
			System.out.println("Nicht mehr im Int groessen Bereich");
		}
		//System.out.println("MaxLengthInt: " + MaxIntLength);
		//System.out.println("MaxLengthInt/2: " + MaxIntLength/2);

	}

	//1073741823
}
