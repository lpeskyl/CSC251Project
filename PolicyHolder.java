public class PolicyHolder
{
   //instance field for holding variables in PolicyHolder
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   private double BMI;
   
   /*
      yes-arg constructor
      @param firstName        policy holder first name
      @param lastName         policy holder last name
      @param age              policy holder age
      @param smokingStatus    policy holder smoker status
      @param height           policy holder height
      @param weight           policy holder weight
   */
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
      
      this.BMI = calculateBMI(weight, height);
   }
   
   /*
      mutator methods
      @param firstName      policy holder first name
   */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;   
   }
   /*
      @param lastName      policy holder last name
   */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;  
   }
   /*
      @param age      policy holder age
   */
   public void setPolicyHolderAge(int age)
   {
      this.age = age;  
   }
   /*
      @param smokingStatus      policy holder smoking status
   */
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   /*
      @param height      policy holder height
   */
   public void setHeight(double height)
   {
      this.height = height;
   }
   /*
      @param weight      policy holder weight
   */
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   /*
      accessor methods
      @return firstName    policy holder first name              
   */
   public String getFirstName()
   {
      return firstName;
   }
   /*
      @return lastName     policy holder last name      
   */
   public String getLastName()
   {
      return lastName;
   }
   /*
      @return age    policy holder age      
   */
   public int getAge()
   {
      return age;
   }
   /*
      @return smokingStatus      policy holder smoking status      
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   /*
      @return height    policy holder height      
   */
   public double getHeight()
   {
      return height;
   }
   /*
      @return weight    policy holder weight      
   */
   public double getWeight()
   {
      return weight;
   }
   
   /*
      BMI calculation
      @param weight    policy holder weight
      @param height    policy holder height
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