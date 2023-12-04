import java.util.Scanner;
public class PizzaShop
{
// Classic.
        public static void main(String[] args)
        {
// Variables and Constants.
        String customer;
        int toppings;
        Scanner input = new Scanner(System.in);
        Pizza pizza1 = new Pizza();
// Input Phase.
        Pizza.intro();
        System.out.print("What name will the order be under?: ");
        customer = input.nextLine(); // Take user input into a string.
        System.out.print("How many toppings are ya getting?: ");
        toppings = input.nextInt(); // Take user input into an int.
        input.close();
// Processing Phase.
        pizza1.enterName(customer);
        pizza1.addToppings(toppings);
        pizza1.calcPrice();
// Output Phase.
        pizza1.summary();
        }



























































































}