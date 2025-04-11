public class Policy
{
   //instance field for holding variables in policy
   private int number;
   private String proName;

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
   
   //toString method which displays Policy fields when called
   public String toString()
   {
      return String ("Policy Number: " + number +
                     "\nProvider Name: " + proName);
   }
}