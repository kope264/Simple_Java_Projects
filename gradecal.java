import java.util.Scanner;

public class gradecal {
    
   
  
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);

        System.out.println("***Enter no. of subjects***   :");
        int x=sc.nextInt();
     

        System.out.println("***Enter maximum marks***   :");
        int y= sc.nextInt();
     
            
     
       int marks[]= new int[x];
       System.out.println("enter marks ");
       for (int i=0;i<x;i++){
           System.out.println(" Marks in Subject "+(i+1)+" :");
       
           marks[i]=sc.nextInt();
       }
       double total=0;
       for (double mks : marks){
           total += mks ;
        

    }


    double avg= (total/(x*y))*100;

    System.out.println("**************RESULT**************");
    System.out.println("----------------------------------");
    System.out.println(" \nTOTAL MARKS OUT OF "+(y*x)+": "+total);
    System.out.println("\n AVERAGE PERCENTAGE : "+avg+" %");

    
    if(avg>=90){
        System.out.print("\nCONGRATULATION YOU HAVE PASSED THIS EXAMINATION WITH GRADE : ");

        System.out.println(" A+ :)");
    }
    else if(avg>=75&&avg<=89){
        System.out.println("\nCONGRATULATION YOU HAVE PASSED THIS EXAMINATION WITH GRADE : ");
        
        System.out.println(" A :)\n\n");
    }
    else if(avg>=65&&avg<=74){
 
        System.out.println("\nCONGRATULATION YOU HAVE PASSED THIS EXAMINATION WITH GRADE : ");
        System.out.println(" B :)\n\n");
    }
    else if(avg>=45&&avg<=64){
        System.out.println("\nCONGRATULATION YOU HAVE PASSED THIS EXAMINATION WITH GRADE : ");
        
        System.out.println(" C :)\n\n");
    }
    else if(avg>=33&&avg<=44){
        System.out.println("\nCONGRATULATION YOU HAVE PASSED THIS EXAMINATION WITH GRADE : ");
        
        System.out.println(" D :)\n\n");
    }
    else{
        System.out.println("\nSORRY!!! YOU HAVE FAILED THIS EXAMINATION  :/\n\n");
    }

    

    }

}   

