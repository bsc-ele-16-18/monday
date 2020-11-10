
// has an interest rate
// a method to apply interest and profits
public abstract class Executive extends StudentAccount{

    // interest rate
    private double interestRate; 

   // default constructor
 
// Parameter constructor to initialize savings account
// With a customer account number and interest rate

public Executive(int accountNumber, double interestRate){
    super();
    this.interestRate = interestRate; 
} 
    //getter function
public double getInterestRate(){
    return this.interestRate; 
}
public void setInterestRate(double interestRate){
    this.interestRate = interestRate;
}
public double calcInterest(){
    return balance = interestRate;
}
public void applyInterest(){ 
   double interest = calcInterest();
 System.out.printf("Interest amount balance");

  deposit(interest);   
}

   public void deposit(double amount) {
   // first check ammount
   if (amount > 0){ 
       balance += amount;
       System.out.println("Amount  balance is");
      
       
   } else{
       System.out.println("A negative amount can not be deposited");
   }
}
   
       public void withdraw(double amount){
           // Same check
           if(amount > 0){
               // Check sufficient balance
               if((amount) <= balance){
                   System.out.printf("Amount withdrawn");
                   balance -= amount;
                  
                   System.out.printf("accountt fee balance");
                   System.out.printf("Current amount balance");
               }
           }else {
               System.out.println("Negative amount cannot be withdrawn");
             
           }
            
       }

   }
   
 