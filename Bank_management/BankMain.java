package Bank_management;
import java.util.*;



public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		BankAccount b1=new BankAccount(1234L,"Poorani",2999);
		
		Deposit d=new Deposit();
		GetDeatils g=new GetDeatils();
		Withdraw w=new Withdraw();
		System.out.println("1.Deposit\n2.Withdraw\n3.CheckBalance");
		System.out.println("Enter choice");
		int choice =sc.nextInt();
		
		
		switch(choice) {
		case 1:{
			d.deposit(b1, 2000);
			
			break;
		}
		case 2:{
			w.withdraw(b1, 1000);
			System.out.println("Withdraw sucessful");
			break;
		}
		case 3:{
			System.out.println(g.getDetails(b1));
			break;
		}
		default :{
			System.out.println("Invalid choice");
			break;
		
			
		
		}
		
		}
	}

}
