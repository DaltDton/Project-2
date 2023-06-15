import java.util.*;

public class Demo{

   public static void main (String args[]){
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Please enter the Policy Number: ");
   String policyNumber = scanner.nextLine();
   
   System.out.println("Please enter the Provider Name: ");
   String providerName = scanner.nextLine();
   
   System.out.println("Please enter the Policyholder’s First Name:");
   String policyholderFirstName = scanner.nextLine();
   
   System.out.println("Please enter the Policyholder’s Last Name: ");
   String policyholderLastName = scanner.nextLine();
   
   System.out.println("Please enter the Policyholder’s Age: ");
   int policyholdersAge = scanner.nextInt();
   scanner.nextLine();
   
   System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
   String policyholdersSmokingStat = scanner.nextLine();
   
   
   System.out.println("Please enter the Policyholder’s Height (in inches): ");
   double policyholdersHeight = scanner.nextDouble();
   scanner.nextLine();
   
   System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
   double policyholdersWeight = scanner.nextDouble();
   scanner.nextLine();
   
   Policy newPolicy = new Policy(policyNumber, providerName, policyholderFirstName, policyholderLastName, policyholdersAge, policyholdersSmokingStat, policyholdersHeight, policyholdersWeight);
   
   System.out.println("Policy Number: " + newPolicy.getPolicyNumber());
   System.out.println("Provider Name: " + newPolicy.getProviderName());
   System.out.println("Policyholder’s First Name: " + newPolicy.getPolicyholderFirstName());
   System.out.println("Policyholder’s Last Name: " + newPolicy.getPolicyholderLastName());
   System.out.println("Policyholder’s Age: " + newPolicy.getPolicyholdersAge());
   System.out.println("Policyholder’s Smoking Status: " + newPolicy.getPolicyholdersSmokingStat());
   System.out.println("Policyholder’s Height: " + newPolicy.getPolicyholdersHeight());
   System.out.println("Policyholder’s Weight: " + newPolicy.getPolicyholdersWeightt());
   System.out.printf("Policyholder’s BMI: $%.2f%n",  newPolicy.BMICalc());
   System.out.printf("Policy Price: $%.2f%n", newPolicy.calcualtePrice());
   }
}