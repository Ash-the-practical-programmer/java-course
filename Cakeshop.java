import java.util.Scanner;
  // Import the Scanner class
  //simple java program

class Main {
  public static void main(String[] args) {
    Scanner  custm= new Scanner(System.in); 
     // Create a Scanner object
    System.out.println("Please enter your name :");

    String userName = custm.nextLine();
     // Read user input
    System.out.println("Your Goodname is: " + userName);  
    
    // Output user input
    /*----------------menu-------------------*/
    //menu
    
     
      
    System.out.println("Please chooes what you  want to eat Today :");
     System.out.println("Enter \n1 for cake \n2 for small cake \n3 for large  cake \n4 for extra large" );
    // Order user input
    Scanner mu= new Scanner(System.in);
    int menu = mu.nextInt();
    
    switch(menu){
        case 1: 
           System.out.println("extra small cake");
        break;
        case 2 :     
        System.out.println("small cake");
        break;
        case 3:
        System.out.println("large cake");
        break;
        case 4:
        System.out.println("extra large");  
        break;
        default:
        System.out.println("Error");
        
    } 
    
     // Read user input items
     System.out.println("Enter \n1 for Conformation the order \n2 for cancel the order");
    Scanner mm= new Scanner(System.in);
    int confor = mm.nextInt();
    switch(confor){
        case 1:
    System.out.println("Now your order is conformed"); 
    System.out.println("Thank you! for Purcheas form us");
        break;
        default:
        System.out.println("Thank you! for visit our store \nHave a Nice day ");
        
      
        
        if(confor==1)            
            System.out.println("Thank you!for buy form hear come next time again");
            
         /*   else {
                System.out.println("Thank you!");                      

    }*/
    }
  }
}