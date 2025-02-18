public class Policy
{
   //instance field for holding variables in policy
   private int number;
   private String proName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   private double BMI;
   
   //no-arg constructor
   public Policy()
   { 
      int number = 0;
      String proName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokingStatus = "";
      double height = 0.0;
      double weight = 0.0;
      double BMI = 0.0;
   }
   
   //yes-arg constructor
   public Policy(int num, String pName, String first, String last, int a, String sStatus, double h, double w)
   {
      number = num;
      proName = pName;
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   //mutator methods 
   public void setPolicyNumber(int num)
   {
      number = num;
   }
   public void setProviderName(String pName)
   {
      proName = pName;
   }
   public void setPolicyHolderFirstName(String first)
   {
      firstName = first;   
   }
   public void setPolicyHolderLastName(String last)
   {
      lastName = last;  
   }
   public void setPolicyHolderAge(int a)
   {
      age = a;  
   }
   public void setPolicyHolderSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   public void setPolicyHolderHeight(double h)
   {
      height = h;
   }
   public void setPolicyHolderWeight(double w)
   {
      weight = w;
   }

   //accessor methods
   public int getPolicyNumber()
   {
      return number;
   }

   public String getProviderName()
   {
      return proName;
   }

   public String getPolicyHolderFirstName()
   {
      return firstName;
   }
   
   public String getPolicyHolderLastName()
   {
      return lastName;
   }
   
   public int getPolicyHolderAge()
   {
      return age;
   }
   
   public String getPolicyHolderSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getPolicyHolderHeight()
   {
      return height;
   }
   
   public double getPolicyHolderWeight()
   {
      return weight;
   }
   
   //BMI calculation
   public double calculateBMI(double weight, double height)
   {
      double BMI = (weight * 703) / (height * height);
      return BMI;
   }
   
   //price calculation
   public double calculatePolicyPrice()
   {
      //base fee of 600
      double policyPrice = 600;
      //elder fee
      if (age > 50)
      {
         policyPrice += 75;
      }
      //smoker fee
      if (smokingStatus.equalsIgnoreCase("smoker"))
      {
         policyPrice += 100;
      }
      //BMI fee
      if (BMI > 35)
      {
         policyPrice += (BMI - 35) * 20;
      }
      //return policy price
      return policyPrice;
   }
}