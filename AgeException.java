import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class AgeException {

	public static void main(String[] args) {
		int age;
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("Enter the Age to check if its ok to enter the venue:");
		age=scan.nextInt();
		if(age>17)
			System.out.println("you have entered the plaza...!");
		else
			throw new InvalidAgeException("Age should be greater then 18");	
			
		}catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
