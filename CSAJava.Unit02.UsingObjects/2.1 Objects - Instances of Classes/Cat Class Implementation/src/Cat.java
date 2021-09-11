public class Cat
{
    // Implement instance variables
    private final String name;
    private int age;
    private final String color;
    private boolean isSleeping;

    public Cat() // Default constructor
    {
        this.name = "";
        this.age = Integer.MIN_VALUE;
        this.color = "";
        this.isSleeping = false;
    }

    public Cat(String name, int age, String color) // Initializing constructor
    {
        // Assign input parameters values to corresponding instance variables
        this.name = name;
        this.age = age;
        this.color = color;

        // Set default instance variables
        this.isSleeping = false;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // Implement class methods
    public void Sleep()
    {
        isSleeping = true;
    }

    public void Wake()
    {
        isSleeping = false;
    }

    private String SleepingState()
    {
        if (isSleeping)
        {
            return "is sleeping.";
        } else
        {
            return "is not sleeping.";
        }
    }

    @Override
    public String toString()
    {
        return name + ", the " + age + "-year-old " + color + " cat, " + SleepingState();
    }
}