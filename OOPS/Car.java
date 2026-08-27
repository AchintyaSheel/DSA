public class Car {
    // Car is the class name.
// The class is a blueprint for creating Car objects.

    // =========================================================
    // INSTANCE VARIABLES / FIELDS
    // =========================================================

    // These are instance variables.
    // Every Car object will have its own copy of these variables.

    String engineType;   // Stores the type of engine, e.g. "V8"
    String Colour;       // Stores the colour of the car, e.g. "White"
    int horsePower;      // Stores the horsepower, e.g. 400


    // =========================================================
    // 1. DEFAULT CONSTRUCTOR
    // =========================================================

    public Car() {

        // This is a constructor with no parameters.
        //
        // It is called when we create an object like:
        //
        // Car c1 = new Car();
        //
        // Since there is no code inside this constructor,
        // the instance variables will get their default values.
        //
        // String -> null
        // int    -> 0
    }


    // =========================================================
    // 2. ONE-PARAMETER CONSTRUCTOR
    // =========================================================

    public Car(String engineType) {

        // This constructor receives one parameter:
        //
        // engineType
        //
        // The parameter contains the value passed while
        // creating the object.
        //
        // Example:
        //
        // Car c1 = new Car("V8");
        //
        // In this case:
        //
        // engineType = "V8"


        // 'this.engineType' refers to the instance variable
        // belonging to the current Car object.
        //
        // 'engineType' on the right side refers to the
        // parameter of this constructor.
        //
        // Therefore:
        //
        // this.engineType = engineType;
        //
        // means:
        // "Store the parameter value inside the object's
        // engineType variable."

        this.engineType = engineType;
    }


    // =========================================================
    // 3. TWO-PARAMETER CONSTRUCTOR
    // =========================================================

    public Car(String engineType, String Colour) {

        // This constructor has two parameters:
        //
        // 1. engineType
        // 2. Colour
        //
        // Example:
        //
        // Car c1 = new Car("V8", "White");


        // this(engineType) calls the one-parameter constructor.
        //
        // This is called CONSTRUCTOR CHAINING.
        //
        // The one-parameter constructor will execute:
        //
        // this.engineType = engineType;
        //
        // So we don't have to write the same code again.

        this(engineType);


        // Store the Colour parameter in the object's
        // Colour instance variable.
        //
        // 'this.Colour' -> instance variable
        // 'Colour'      -> constructor parameter

        this.Colour = Colour;
    }


    // =========================================================
    // 4. THREE-PARAMETER CONSTRUCTOR
    // =========================================================

    public Car(String engineType, String Colour, int horsePower) {

        // This constructor has three parameters:
        //
        // 1. engineType
        // 2. Colour
        // 3. horsePower
        //
        // Example:
        //
        // Car c1 = new Car("V8", "White", 400);


        // this(engineType, Colour) calls the two-parameter
        // constructor.
        //
        // This is also called CONSTRUCTOR CHAINING.
        //
        // The two-parameter constructor will take care of:
        //
        // this.engineType = engineType;
        // this.Colour = Colour;
        //
        // Therefore, we don't need to write those statements
        // again in this constructor.

        this(engineType, Colour);


        // Store the horsepower parameter in the object's
        // horsePower instance variable.
        //
        // 'this.horsePower' -> instance variable
        // 'horsePower'      -> constructor parameter

        this.horsePower = horsePower;
    }


    // =========================================================
    // FUNCTIONS / METHODS
    // =========================================================


    // =========================================================
    // METHOD 1: doubleHorsepower()
    // =========================================================

    public void doubleHorsepower() {

        // This method doubles the current horsepower.
        //
        // For example:
        //
        // If horsePower = 400
        // then after calling this method:
        //
        // horsePower = 800


        // Multiply the current horsepower by 2.

        this.horsePower *= 2;


        // The above statement is the short form of:
        //
        // this.horsePower = this.horsePower * 2;
        //
        // Example:
        //
        // 400 * 2 = 800
    }


    // =========================================================
    // METHOD 2: changeColour()
    // =========================================================

    public void changeColour(String newColour) {

        // This method is used to change the colour of the car.
        //
        // 'newColour' is a parameter of this method.
        //
        // Example:
        //
        // c1.changeColour("Black");
        //
        // In this case:
        //
        // newColour = "Black"


        // Store the new colour inside the object's
        // Colour instance variable.
        //
        // 'this.Colour' -> instance variable
        // 'newColour'   -> method parameter

        this.Colour = newColour;
    }


    // =========================================================
    // toString() METHOD
    // =========================================================

    public String toString() {

        // toString() is used to return a String representation
        // of the Car object.
        //
        // It returns the values of:
        //
        // 1. engineType
        // 2. Colour
        // 3. horsePower


        // '\n' means new line.
        //
        // So each piece of information will appear on a
        // separate line.


        // When we write:
        //
        // System.out.print(c1);
        //
        // Java automatically calls:
        //
        // c1.toString();
        //
        // Therefore, we don't have to explicitly call
        // the toString() method.

        return "\nEngine type is:" + this.engineType
             + "\nCar colour is:" + this.Colour
             + "\nHorse power is:" + this.horsePower;
    }


    // =========================================================
    // MAIN METHOD
    // =========================================================

    public static void main(String[] args) {

        // The main() method is the starting point of the program.
        //
        // Program execution starts from here.


        // =====================================================
        // CREATING THE CAR OBJECT
        // =====================================================

        // Create a Car object called c1.
        //
        // We are passing three values:
        //
        // "V8"    -> engineType
        // "White" -> Colour
        // 400     -> horsePower
        //
        // Therefore Java chooses this constructor:
        //
        // Car(String engineType, String Colour, int horsePower)

        Car c1 = new Car("V8", "White", 400);


        // =====================================================
        // FIRST PRINT
        // =====================================================

        // =====================================================
        // PRINTING USING toString()
        // =====================================================

        // We can simply write:

        System.out.print(c1);
         // Java automatically converts the Car object into a String
        // by calling:
        //
        // c1.toString();
        //
        // So this:
        //
        // System.out.print(c1);
        //
        // is effectively:
        //
        // System.out.print(c1.toString());


        // =====================================================
        // NORMAL WAY WITHOUT toString()
        // =====================================================

        // If we DON'T use toString(), we can print each variable
        // separately.
        //
        // For example:

        /*
        System.out.println("Engine type is:" + c1.engineType);
        System.out.println("Car colour is:" + c1.Colour);
        System.out.println("Horse power is:" + c1.horsePower);
        */

        // The above is the normal way.
        //
        // Output:
        //
        // Engine type is:V8
        // Car colour is:White
        // Horse power is:400
        //
        // Notice that we have to manually write every variable.
        //
        // With toString(), we can simply write:
        //
        // System.out.print(c1);
        //
        // and Java calls c1.toString() automatically.


        // =====================================================
        // DOUBLING THE HORSEPOWER
        // =====================================================

        // Call the doubleHorsepower() method.

        c1.doubleHorsepower();


        // The current horsepower is 400.
        //
        // doubleHorsepower() multiplies it by 2.
        //
        // Therefore:
        //
        // 400 * 2 = 800


        // =====================================================
        // SECOND PRINT
        // =====================================================

        // Print the updated Car object.

        System.out.print(c1);


        // The output will now be:
        //
        // Engine type is:V8
        // Car colour is:White
        // Horse power is:800


        // =====================================================
        // CHANGING THE COLOUR
        // =====================================================

        // Call the changeColour() method.
        //
        // Pass "Black" as the new colour.

        c1.changeColour("Black");


        // The changeColour() method executes:
        //
        // this.Colour = newColour;
        //
        // Therefore:
        //
        // Colour changes from "White" to "Black"


        // =====================================================
        // THIRD PRINT
        // =====================================================

        // Print the updated Car object again.

        System.out.print(c1);


        // The final output will be:
        //
        // Engine type is:V8
        // Car colour is:Black
        // Horse power is:800
    }
}

    

