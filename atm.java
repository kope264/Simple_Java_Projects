import java.util.Scanner;

public class atm {
    static int balance=1000;
    
    static int amount;
    static Scanner sc = new Scanner( System.in);
    public static void balance(){
        System.out.println("balance in your account is :"+balance);

    }
    public static void withdraw(){
        System.out.println("enter withdrawal amount :");
        amount=sc.nextInt();
        if (amount == 0 || amount > balance){
            System.out.println("Insuficient Balance...");
        }
        else{
        balance=balance-amount;
        System.out.println("remaing balance is "+(balance));
        }
    }
    public static void deposite(){
        System.out.println("enter deposite amount :");
        amount=sc.nextInt();
        if (amount == 0 ){
            System.out.println("invalid amount.....!");
        }
        else
        {
        balance=balance+amount;
        System.out.println("Enter deposite amount :"+(balance));
        }
    }
    public static void main(String[] args) {
        
   
        int choice;
        System.out.println("Enter your pin :");
        int pin=sc.nextInt();

        while(pin==1234){
            System.out.println("1. Balance");
            
            System.out.println("2. Withdraw");
            
            System.out.println("3. Deposite");

            
            System.out.println("4. Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1: 
               balance();
                break;

                case 2: 
                withdraw();
                break;

                case 3:
                deposite();
                break;

                case 4:
                System.out.println("THANK YOU ......!!!!!!!!");
                return;

              default :
              System.out.println("Please choose from above options");
              break;
            }
        }
        while(pin!=1234){

            System.out.println("invalid pin");
            
        }
        
    }
}