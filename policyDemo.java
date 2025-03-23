import java.util.*; //java import

public class policyDemo
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in); //scanner object
      
      //policy number 
      System.out.print("Please enter the Policy Number: ");
      int number = scanner.nextInt();
      
      //provider name 
      System.out.print("\nPlease enter the Provider Name: ");
      String proName = scanner.next();
      
      //policy holder first name 
      System.out.print("\nPlease enter the Policy Holder's First Name: ");
      String firstName = scanner.next();
      
      //policy holder Last name 
      System.out.print("\nPlease enter the Policy Holder's Last Name: ");
      String lastName = scanner.next();
      
      //policy holder Age  
      System.out.print("\nPlease enter the Policy Holder's Age: ");
      int age = scanner.nextInt();
      
      //policy holder smoking status 
      System.out.print("\nPlease enter the Policy Holder's Smoking Status: ");
      String smokingStatus = scanner.next();
      
      //policy holder height 
      System.out.print("\nPlease enter the Policy Holder's Height: ");
      double height = scanner.nextDouble();
      
      //policy holder weight 
      System.out.print("\nPlease enter the Policy Holder's Weight: ");
      double weight = scanner.nextDouble();
      
      //instantiate policy object
      Policy policy = new Policy(number, proName, firstName, lastName, age, smokingStatus, height, weight);
      
      //print info
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policy Holder's First Name: " + policy.getPolicyHolderFirstName());
      System.out.println("Policy Holder's Last Name: " + policy.getPolicyHolderLastName());
      System.out.println("Policy Holder's Age: " + policy.getPolicyHolderAge());
      System.out.println("Policy Holder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
      System.out.println("Policy Holder's Height: " + policy.getPolicyHolderHeight());
      System.out.println("Policy Holder's Weight: " + policy.getPolicyHolderWeight());
      double policyPrice = policy.calculatePolicyPrice();
      System.out.printf("Policy Price: $%.2f \n", policyPrice);
   }
}