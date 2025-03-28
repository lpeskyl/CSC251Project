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

   /*
      yes-arg constructor
      @param num        policy number
      @param pName      provider name
      @param first      policy holder first name
      @param last       policy holder last name
      @param a          policy holder age
      @param sStatus    policy holder smoker status
      @param h          policy holder height
      @param w          policy holder weight
   */
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
      
      BMI = calculateBMI(weight, height);
   }
   
   /*
      mutator methods
      @param num     policy number
   */ 
   public void setPolicyNumber(int num)
   {
      number = num;
   }
   /*
      @param pName      provider name
   */
   public void setProviderName(String pName)
   {
      proName = pName;
   }
   /*
      @param first      policy holder first name
   */
   public void setPolicyHolderFirstName(String first)
   {
      firstName = first;   
   }
   /*
      @param last      policy holder last name
   */
   public void setPolicyHolderLastName(String last)
   {
      lastName = last;  
   }
   /*
      @param a      policy holder age
   */
   public void setPolicyHolderAge(int a)
   {
      age = a;  
   }
   /*
      @param sStatus      policy holder smoking status
   */
   public void setPolicyHolderSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   /*
      @param h      policy holder height
   */
   public void setPolicyHolderHeight(double h)
   {
      height = h;
   }
   /*
      @param w      policy holder weight
   */
   public void setPolicyHolderWeight(double w)
   {
      weight = w;
   }

   /*
      accessor methods
      @return number    policy number
   */
   public int getPolicyNumber()
   {
      return number;
   }
   /*
      @return proName      provider name
   */
   public String getProviderName()
   {
      return proName;
   }
   /*
      @return firstName    policy holder first name              
   */
   public String getPolicyHolderFirstName()
   {
      return firstName;
   }
   /*
      @return lastName     policy holder last name      
   */
   public String getPolicyHolderLastName()
   {
      return lastName;
   }
   /*
      @return age    policy holder age      
   */
   public int getPolicyHolderAge()
   {
      return age;
   }
   /*
      @return smokingStatus      policy holder smoking status      
   */
   public String getPolicyHolderSmokingStatus()
   {
      return smokingStatus;
   }
   /*
      @return height    policy holder height      
   */
   public double getPolicyHolderHeight()
   {
      return height;
   }
   /*
      @return weight    policy holder weight      
   */
   public double getPolicyHolderWeight()
   {
      return weight;
   }
   
   /*
      BMI calculation
      @param w    policy holder weight
      @param h    policy holder height
      @return BMI    policy holder BMI     
   */
   public double calculateBMI(double weight, double height)
   {
      double BMI = (weight * 703) / (height * height);
      return BMI;
   }
   
   /*
      price calculation
      @return policyPrice     price for policy
   */
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