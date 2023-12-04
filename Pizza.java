/* Chapter 3 extra project
 * Starting price for a pizza is $13.99
 * Toppings cost .50 cents each
*/
public class Pizza
{
// Instance variables for the Pizza class.
    private String custName;
    private double price;
    private int numToppings;
// New default constructor for this class.
    public Pizza()
    {
        custName = "Customer";
        price = 13.99;
        numToppings = 0;
    } // End of constructor method.
// Basic static method for this class.
    public static void intro()
    {
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("Welcome to Yaya Geuseppe's");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    } // End of intro() method.
// Mutator (setter) methods for the Pizza class.
    public void enterName(String name)
    {
        custName = name; // Assign the value of the parameter.
    }
    public void addToppings(int num)
    {
        numToppings = num; // Assign the value of the parameter.
    }
    public void calcPrice()
    {
        price = price + (numToppings * .50);
    }
// Accessor (getter) methods for the Pizza class.
    public void summary()
    {
        System.out.println("\n" + "Thank you, " + custName);
        System.out.println("A pizza with " + numToppings + " topping(s) will cost $" + price);
    }
}


































































































