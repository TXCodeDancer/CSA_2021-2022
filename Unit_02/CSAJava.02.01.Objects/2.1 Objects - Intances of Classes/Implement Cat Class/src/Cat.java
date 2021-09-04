public class Cat {
  // Implement instance variables here

    public Cat() // Don't change this constructor
    {
        this.name = null;
        this.color = null;
        this.age = Integer.MIN_VALUE;
        this.playing = false;
    }

    public Cat(String name, int age, String color) // Initializing constructor
    {
        // Assign input parameters values to corresponding instance variables

        // Set default instance variables
        this.playing = false;
    };

    public void Age(int age) // age setter method
    {
        // Assign input parameter value to corresponding instance variable
        this.age = age;
    }

    public int Age() // age getter method
    {
        // Return corresponding instance variable
        return this.age;
    }

    // Implement getter and setter methods for all other instance variable

}