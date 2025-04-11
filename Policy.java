public class Policy
{
   //instance field for holding variables in policy
   private int number;
   private String proName;

   //add a static field that is used to keep track 
   //of the number of policy objects that have been created.
   private static int policyCount = 0;
   
   /*
      yes-arg constructor
      @param num        policy number
      @param pName      provider name
   */
   public Policy(int num, String pName)
   {
      number = num;
      proName = pName;
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
   
    //increments policyCount var for every instance of a policy object
   public int getPolicyCount()
   {
      return policyCount++;
   }
   
   //toString method which displays Policy fields when called
   public String toString()
   {
      String str = ("Policy Number: " + number +
                           "\nProvider Name: " + proName);
      return str;
   }
}