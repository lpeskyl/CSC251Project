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
      double height = 0.0, weight = 0.0, BMI = 0.0;
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
         
         PolicyHolder myPolicyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         Policy myPolicy = new Policy(number, proName, myPolicyHolder);
         
         policies.add(myPolicy);
      }
      
      inputFile.close();      
      
      //print info
      for(int i = 0; i < policies.size(); i++)
      {
         System.out.println(policies.get(i));
         if(policies.get(i).getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
            totalSmokers ++;
         else
            totalNonSmokers ++;
         System.out.println();
      }
      
      System.out.printf("There were %d Policy objects created.\n", Policy.getPolicyCount());
      System.out.println("The number of policies with a smoker is: " + totalSmokers);
      System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
   }
}