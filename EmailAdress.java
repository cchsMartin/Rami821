import java.util.Scanner;

public class EmailAdress {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your 1st name ?");
    String first = keyboard.nextLine();
    System.out.println("What is your middle name?");
    String middle = keyboard.nextLine();
    System.out.println("What is your last name ?");
    String last = keyboard.nextLine();
    System.out.println("What is your birthdate in mm-dd-yyyy");
    String birthdate = keyboard.nextLine();
    String password = birthdate.substring(0,2) + birthdate.substring(3,5)+birthdate.substring(6);
    String email = last.toLowerCase()+first.substring(0,1).toUpperCase() + middle.substring(0,1).toUpperCase()+"@sharkmail.com";
    System.out.println("Email:"+ email);
    System.out.println("Temp Password:" + password);
    System.out.println("This temporary password is very insecure. Please change it immediately!");
   
    
    
	}

}
//Perfect. 
