import java.util.*;
import java.io.*;

public class Demo{

   public static void main (String args[]) throws IOException {
   
      List<Policy> policies = new ArrayList<>();
      
      File file = new File("C:/Users/dalto/OneDrive/Documents/GitHubRepositories/CSC151Project/Project_Samuel_Lambert/PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
   
      while (inputFile.hasNextLine()) {
         String policyNumber = inputFile.nextLine();
         String providerName = inputFile.nextLine();
         String policyholderFirstName = inputFile.nextLine();
         String policyholderLastName = inputFile.nextLine();
         int policyholdersAge = inputFile.nextInt();
         inputFile.nextLine();
         String policyholdersSmokingStat = inputFile.nextLine();
         double policyholdersHeight = inputFile.nextDouble();
         inputFile.nextLine();
         double policyholdersWeight = inputFile.nextDouble();
         inputFile.nextLine();
         
         if (inputFile.hasNextLine()) {
            inputFile.nextLine();
         }
            
      
         Policy newPolicy = new Policy(policyNumber, providerName, policyholderFirstName, policyholderLastName, policyholdersAge, policyholdersSmokingStat, policyholdersHeight, policyholdersWeight);
      
         policies.add(newPolicy);
      }
   
      for (Policy newPolicy : policies) {
      
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
         System.out.println();
      }
   }
}