public class Policy
{
   //instance field for holding variables in policy
   private int number;
   private String proName;
   
   private PolicyHolder policyHolder; //Instance of the PolicyHolder class

   //add a static field that is used to keep track 
   //of the number of policy objects that have been created.
   private static int policyCount = 0;
   
   /*
      yes-arg constructor
      @param num        policy number
      @param pName      provider name
   */
   public Policy(int num, String pName, PolicyHolder holder)
   {
      number = num;
      proName = pName;
      policyHolder = new PolicyHolder(holder); //avoid security hole
      policyCount ++;
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
      @param holder     a PolicyHolder object
   */
   public void setPolicyHolder(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
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
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
   public double getBMI()
   {
      return policyHolder.calculateBMI();
   }
   
    //increments policyCount var for every instance of a policy object
   public static int getPolicyCount()
   {
      return policyCount++;
   }
   
   //toString method which displays Policy fields when called
   public String toString()
   {
      return String.format("Policy Number: %d%n" +
                           "Provider Name: %s%n" + 
                           policyHolder.toString() +
                           "Policy Holder BMI: %.2f%n" +
                           "Policy Price: $%.2f%n", 
                           number, proName, policyHolder.calculateBMI(), policyHolder.calculatePolicyPrice());
   }
}