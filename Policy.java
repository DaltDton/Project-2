import java.util.*;

public class Policy {
  
      private String policyNumber;
      private String providerName;
      private String policyholderFirstName;
      private String policyholderLastName;
      private int policyholdersAge;
      private String policyholdersSmokingStat;
      private double policyholdersHeight;
      private double policyholdersWeight;
      
      //Defualt constructor
      public Policy() {
         policyNumber = "  ";
         providerName = " ";
         policyholderFirstName = " ";
         policyholderLastName = " ";
         policyholdersAge = 0;
         policyholdersSmokingStat = " ";
         policyholdersHeight = 0;
         policyholdersWeight = 0;
         
      }
      
       /**
      Consturctor
      @param  {string}  policyNumber - The number of the policy.
      @param  {string}  providerName - The name of the provider.
      @param  {string}  policyholderFirstName - The  first name of the policyholders.
      @param  {string}  policyholderLastName - The  last name of the policyholders.
      @param  {int}     policyholdersAge - The policyholders age.
      @param  {string}  policyholdersSmokingStat - checks if policyholders smokes.
      @param  {double}  policyholdersHeight - The policyholders Height.
      @param  {double}  policyholdersWeight - The policyholders Weight.
      */
      public Policy(String policyNumber, String providerName,String policyholderFirstName, String policyholderLastName, int policyholdersAge, String policyholdersSmokingStat, double policyholdersHeight, double policyholdersWeight) {
         this.policyNumber = policyNumber;
         this.providerName = providerName;
         this.policyholderFirstName = policyholderFirstName;
         this.policyholderLastName = policyholderLastName;
         this.policyholdersAge = policyholdersAge;
         this.policyholdersSmokingStat = policyholdersSmokingStat;
         this.policyholdersHeight = policyholdersHeight;
         this.policyholdersWeight = policyholdersWeight;
         
      }
      //getters
      
      public String getPolicyNumber() {
      return policyNumber;
      }
      
      public String getProviderName() {
      return providerName;
      }
      
      public String getPolicyholderFirstName() {
      return policyholderFirstName;
      }
      
      public String getPolicyholderLastName() {
      return policyholderLastName;
      }
      
      public int getPolicyholdersAge() {
      return policyholdersAge;
      }
      
      public String getPolicyholdersSmokingStat() {
      return policyholdersSmokingStat;
      }
      
      public double getPolicyholdersHeight() {
      return policyholdersHeight;
      }
      
      public double getPolicyholdersWeightt() {
      return policyholdersWeight;
      }
      
      //setters
      public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
      }
            
      public void setPolicyName(String providerName) {
      this.providerName = providerName;
      }
      
      public void setPolicyholderFirstName(String policyholderFirstName) {
      this.policyholderFirstName = policyholderFirstName;
      }
      
      public void setPolicyholderLastName(String policyholderLastName) {
      this.policyholderLastName  = policyholderLastName;
      }
      
      public void setPolicyholdersAge(int policyholdersAge) {
      this.policyholdersAge  = policyholdersAge;
      }
      
      public void setPolicyholdersSmokingStat(String policyholdersSmokingStat) {
      this.policyholdersSmokingStat = policyholdersSmokingStat;
      }
      
      public void setPolicyholdersHeight(double policyholdersHeight) {
      this.policyholdersHeight = policyholdersHeight;
      }
      
      public void setPolicyholdersWeightt(double policyholdersWeight) {
      this.policyholdersWeight = policyholdersWeight;
      }    
      /**
      calculator for the BMI of the policy holder
      @returns the BMI of the policy holder
      */
      public double BMICalc (){
      return (policyholdersWeight * 703) / (policyholdersHeight * policyholdersHeight);
      }
      
      /**
      calculator for the price of the policy
      @returns the price of the policy
      */
      public double calcualtePrice(){
      double price = 600.00;
      
         if ( policyholdersAge > 50) {
            price = price + 75.00;
         }
         
         if ( policyholdersSmokingStat.equalsIgnoreCase("Smoker")) { 
            price = price + 100.00;
         }
         
         
         double BMI = BMICalc(); 
         if (BMI > 35) {
            price  = price + ((BMI - 35) * 20);
         }
         
         return price;
      }
      
      
}