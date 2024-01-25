Creatine Calculator


Basic Java Creatine Calc, that uses the formula of 14mg of creatine per pound of body weight. While giving recommened amounts based on weight. Both minimum recommendations and maintenance doses.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* Enables the ablility to get user input */
        Scanner scnr = new Scanner(System.in);
        //initializing our values
        int weight;
        int creatine;
        int convert_mg_to_g;
        // Prints text for the user
        System.out.print("Please Enter your weight: ");
        //Use to calculate weight and the 14 mg per Pound of body weight
        /* three to five grams per day 14 mg per pound of body weight  */
        weight = scnr.nextInt();
        creatine = 14 * weight;
        convert_mg_to_g = creatine / 1000;


        System.out.println("Your weight is " + weight + " LBs." + " We recommend you take a minimum of " + convert_mg_to_g + " gram of Creatine Daily");

        /*
        Under 120 pounds: 3 grams
        121-200 pounds: 5 grams
        Over 200 pounds: 8 grams
         */

        if (weight <= 120) {
            System.out.println("The recommended dose is 3 Grams Daily");
        }
        if (weight > 120) {
            System.out.println("The recommended dose is 5 Grams Daily");
        }

        System.out.println("Don't Forget To Drink Lots Of Water When Taking Creatine!!!!");


    }
}
