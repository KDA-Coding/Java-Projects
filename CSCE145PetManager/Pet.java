/*
 * Written by: Kirk Allgeyer
 */

//Step 1. Define the Class
public class Pet {
    //Step 2. Create the Properties
    //Instance Variables

    private String name;
    private int age;
    private double weight;
    private PetType type;
    
    //Step 3. Create Constructors
    public Pet()//Default 
    {
        this.name = "none";
        this.age = 0;
        this.weight = 0.0;
        this.type = PetType.UNKNOWN;
    }

    public Pet(String aN, int anA, double aW, PetType aT)//Parameterized 
    {
        //TODO Use Mutators
    }

    //Step 4. Create Accessors
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public PetType getType() {
        return this.type;
    }


    //Step 5. Create Mutators

    


}