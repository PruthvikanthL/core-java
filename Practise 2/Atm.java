import java.util.Scanner;
class Atm{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our ATM ");
		System.out.println("Please enter your user name \n");
		String name=sc.next();
		if (name.equals("Pruthvi") || name.equals("pruthvi")) {
			System.out.println("Please enter your user password \n");
		int password=sc.nextInt();
			if(password.equals("1234")){
			
    System.out.println("Hey Pruthvi, Welcome Back!!.... \n Please select your choice:");
	double balance=5000.00;
	while(true){
    System.out.println("1. Balance\n2. Withdrawal\n3. Deposit Money\n4. Exit");
    int choice = sc.nextInt();
	switch(choice){
		case 1:System.out.println("Your current Balance is -->Rs"+balance);
		break;
		case 2:System.out.println("Enter the amount to withdraw");
		double amount=sc.nextDouble();
		if(amount<=balance){
			double withdrawal=balance-amount;
			balance=withdrawal;
			System.out.println("Amount after withdrawal-->"+withdrawal);
		}
		else {
			System.out.println("insufficient Balance please check the balance and enter valid amount to withdraw");
			
		}
		break;
		case 3:System.out.println("Enter the amount for Deposit \n");
		double depamount=sc.nextDouble();
		double Deposit=balance+depamount;
		System.out.println("Your overall balance is -->Rs"+Deposit);
		break;
		case 4:System.out.println("Thank you visit Again");
		sc.close();
		return;
		
		default:System.out.println("you have entered the wrong option please enter valid options given below\n");
		break;
		
		
	}//switch closing	
	}// while closing 
	}// if password closing 
	}//if condtion closing
	
		
	}
}