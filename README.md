# Creatine Calculator


#### Basic Java Creatine Calc, that uses the formula of 14mg of creatine per pound of body weight. While giving recommened amounts based on weight. Both minimum recommendations and maintenance doses.

```
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* Enables the ablility to get user input */
        Scanner scnr = new Scanner(System.in);
        //initializing our values
        int weight;
        double creatine;
        // Prints text for the user
        System.out.print("Please Enter your weight: ");
        //Use to calculate weight and the .014 g per Pound of body weight
        /* three to five grams per day 14 mg per pound of body weight  */
        weight = scnr.nextInt();
        creatine = .014 * weight;



        System.out.println("Your weight is " + weight + " LBs." + " We recommend you take a minimum of " + creatine + " gram of Creatine Daily");

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
```


