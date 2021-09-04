// Don't change this class
public class Cat {
    // Implement instance variables here
    private String name;
    private int age;
    private String color;
    private boolean isPlaying;

    public Cat() // Default constructor
    {
        this.name = "";
        this.age = Integer.MIN_VALUE;
        this.color = "";
        this.isPlaying = false;
    }

    public Cat(String name, int age, String color) // Initializing constructor
    {
        // Assign input parameters values to corresponding instance variables
        this.name = name;
        this.age = age;
        this.color = color;

        // Set default instance variables
        this.isPlaying = false;
    };

    // Instance Variable Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public boolean getPlaying() {
        return isPlaying;
    }

    // Instance Variable Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    // Additional methods
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isPlaying=" + isPlaying +
                '}';
    }
}