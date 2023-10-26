import java.util.Scanner;

public class Aufgabe_14 {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
int firstNumber = 0;
int secondNumber = 0;
int res;
boolean isNumber = true;

if(sc.hasNextInt()) {
	firstNumber = sc.nextInt();
	if(firstNumber <= 0) {isNumber = false;}
	System.out.println(firstNumber);
	
	if (sc.hasNextInt()) {
		secondNumber = sc.nextInt();
	}
	if(secondNumber > firstNumber) {isNumber = false;} 
	else {
		System.out.println("Man kann damit rechnen");
	}
	
	
} else {
	System.out.println("Not an Integer");
	
	
}
System.out.println(isNumber);


}
}
