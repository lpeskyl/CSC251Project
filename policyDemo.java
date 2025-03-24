import java.io.*; //java import
import java.util.*;

public class policyDemo
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt");
      
      if(!file.exists())
      {
         System.out.println("Unable to locate file");
         System.exit(0);
      }
      
      Scanner inputFile = new Scanner(file);
      
      String proName = "", firstName = "", lastName = "", smokingStatus = "";
      int number = 0, age = 0; 
      double height = 0.0, weight = 0.0;
      int totalSmokers = 0, totalNonSmokers = 0;
      
      ArrayList<Policy> policies = new ArrayList<>();
            
      while(inputFile.hasNext())
      {
         number = inputFile.nextInt();
         inputFile.nextLine();
         proName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
         
         Policy p = new Policy(number, proName, firstName, lastName, age, smokingStatus, height, weight);
         
         policies.add(p);
      }
      
      inputFile.close();      
      
      //print info
      for(int i = 0; i < policies.size(); i++)
      {
         Policy p = policies.get(i);
         System.out.println("Policy Number: " + p.getPolicyNumber());
         System.out.println("Provider Name: " + p.getProviderName());
         System.out.println("Policy Holder's First Name: " + p.getPolicyHolderFirstName());
         System.out.println("Policy Holder's Last Name: " + p.getPolicyHolderLastName());
         System.out.println("Policy Holder's Age: " + p.getPolicyHolderAge());
         System.out.println("Policy Holder's Smoking Status: " + p.getPolicyHolderSmokingStatus());
         if(p.getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker"))
            totalSmokers ++;
         else
            totalNonSmokers ++;
         System.out.println("Policy Holder's Height: " + p.getPolicyHolderHeight());
         System.out.println("Policy Holder's Weight: " + p.getPolicyHolderWeight());
         double policyPrice = p.calculatePolicyPrice();
         System.out.printf("Policy Price: $%.2f ", policyPrice);
         System.out.println("\n");
      }
      
      System.out.println("The number of policies with a smoker is: " + totalSmokers);
      System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
   }
}