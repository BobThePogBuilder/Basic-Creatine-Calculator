import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    /* Enables the ability to get user input */
    Scanner scnr = new Scanner(System.in);
    // initializing our values
    int weight;
    // Prints text for the user
    System.out.print("Please Enter your weight: ");
    // Use to calculate weight and the .014 g per Pound of body weight
    /* three to five grams per day 14 mg per pound of body weight  */
    weight = scnr.nextInt();

    /*
    Under 120 pounds: 3 grams
    121-200 pounds: 5 grams
    Over 200 pounds: 8 grams
     */

    if (weight <= 120) {
      System.out.println(
          "You are "
              + weight
              + " lbs."
              + " The recommended dose is 3 Grams Daily for people 120 pounds or under.");
    } else if (weight <= 200) {
      System.out.println(
          "You are "
              + weight
              + " lbs."
              + " The recommended dose is 5 Grams Daily for people 121 pounds to 200 pounds.");
    } else {
      System.out.println(
          "You are "
              + weight
              + " lbs."
              + " The recommended dose is 8 Grams Daily for people 200 pounds and over.");
    }
    System.out.println("Don't Forget To Drink Lots Of Water When Taking Creatine!!!!");
  }
}
