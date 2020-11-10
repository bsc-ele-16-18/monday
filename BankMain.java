// Main class
import java.util.Scanner;
import java.util.arraylis;

public class BankMain {
    // Main method
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
 // Create an array of accountNumbers
ArrayList<StudentAccount> StudentArray = new ArrayList<>();
ArrayList<Executive> ExecutiveArray = new ArrayList<>();

int repeat = 1;
while (repeat == 1) {

    // Menu to display options and get user selections
 
    System.out.println("Bank accountNumber Menu");
    System.out.println("1. accountNumber Name");
    System.out.println("2. accountNumber Number");
    System.out.println("3. Brancht");
    System.out.println("4. Create New accountNumber");
    System.out.println("5. Deposite Funds");
    System.out.println("6. Withdraw Funds");
    System.out.println("7. Check Balance");
    System.out.println("8. Exist");
    System.out.println("Enter your choice: ");
    int choice = input.nextInt();
    if(choice ==2) {
        System.out.println("1. StudentAccount");
        System.out.println("2. Execitive account: ");
        System.out.println("choose account");
        int choose = input.nextInt();
        if(choose ==1){
            StudentAccount student = new StudentAccount();
              
        student.createStudentAccount();
       studentarray.add(student);

        }
        else if(choose ==2) {
            Executive executive = new Executive();
            executive.createAccount();
            executiveArray.add(executive);
        }
        else{
            System.out.println("Exist");
        }
    }
    else if (choice == 3) {
    System.out.println("Enter your account number");
    int m = input.nextInt();
    int n;
    for(int i = 0; i < studentAccountArray.size(); i++){
        n = studentAccountArray.get(i).getAccountnumber();

        if (m == n) {
            studentArray.get(i).deposit();
          }
       }

       for (int i = 0; i < excutiveArray.size(); i++) {
          n = excutiveArray.get(i).getAccountnumber();

          if (m == n) {
            excutiveArray.get(i).deposit();
          }
       }
}

    else if ( choice == 4) {
     System.out.println (" Enter your Account Number: ");
       int m = input.nextInt();
       int n;

       for (int i = 0; i < studentArray.size(); i++) {
          n = studentArray.get(i).getAccountnumber();

          if (m == n) {
            studentArray.get(i).withdraw();
          }
       }

       for (int i = 0; i < excutiveArray.size(); i++) {
          f = excutiveArray.get(i).getAccountnumber();

          if (m == n) {
            excutiveArray.get(i).withdraw();
          }
       }  
    } 
    else if (action == 5) {

        System.out.println (" Enter  Account Number: ");
        int k = input.nextInt();
        int f;

        for (int i = 0; i < studentArray.size(); i++) {
           f = studentArray.get(i).getAccountnumber();

           if (k == f) {
             studentArray.get(i).checkBalance();
           }
        }

         for (int i = 0; i < excutiveArray.size(); i++) {
           f = excutiveArray.get(i).getAccountnumber();

           if (k == f) {
             excutiveArray.get(i).checkBalance();
           }
        }
         
     }

     else if (action == 6) {
         System.out.println("loging out , thanks for using our service");
       System.exit(0);
     }

     else if (action == 1) {
       System.out.println("\t\t" +"Account Name" + "\t branch" + "\t balance" + "\t account Number");
       System.out.println("-----------------------------------------------------------------------");

       for (int i = 0; i < studentArray.size(); i++) {
         studentArray.get(i).showAccounts();
       }

       for (int i = 0; i < excutiveArray.size(); i++) {
         excutiveArray.get(i).showAccounts();
       }
     }

}



    // display the account types
    
    // felix nkumbira
    // bsc-ele-16-18
    }
   
}
    

      