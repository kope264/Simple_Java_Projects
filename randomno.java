import java.util.Random;
import java.util.Scanner;


public class randomno {

    

    static Scanner sc=new Scanner(System.in);
    public static void guess() {
        
            Random Rand= new Random();
            int randomNumber = Rand.nextInt(100)+1;
            
            
            int y=0;
            

            while(y<=2){
                // System.out.println(randomNumber);
                System.out.println("enter you guess between 0-100");
                int x = sc.nextInt();
                System.out.println("Entered Number is : "+x);
             
                    
                     if(x==randomNumber){
                    System.out.println("hurray you won!!!!!!!!!!!!");
                    break;
                   
                
                }
                else if(x>randomNumber){
                    System.out.println("Too High");
                    System.out.println("Try Again");
                    }
                else if (x<randomNumber){
                        System.out.println("Too Low");
                        System.out.println("Try Again");
                
                    }
                
   
            y++;

            
        

   }
   
   System.out.println("the number was : "+randomNumber);
}


public static int input(){
    System.out.println("Enter your choice : 1.Start playing  2.Exit");
       int ch=sc.nextInt();
       
       return ch;
}

    public static void main(String[] args) {

       int y=input();

        

        while(true){
            System.out.println("you have 3 attempts : start playing...");
            guess();
            int a1=input();
            if(a1==2){
                break;
            }
            else if(a1!=1 || a1!=2){
                System.out.println("enter either 1 or 2");
            }
        }
        System.out.println("Bye..");
   
        
    }
}
