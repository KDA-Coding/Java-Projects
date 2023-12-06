/*
 * Written by Kirk Allgeyer
 */

 public class Cat {

    private String name;
    private double weight;
    private int numberOfLegs;

    public Cat() {
        this.name = "None";
        this.weight = 1.0;
        this.numberOfLegs = 4;
    }

    public Cat(String aN, double aW, int aL) {

        this.setName(aN);
        this.setWeight(aW);
        this.setNumberOfLegs(aL);

    }

    //Getters
    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }


    //Setters
    public void setName(String aN) {

        if(aN != null) {
            this.name = aN;
        }
        else {
            this.name="none";
        }
    }

    public void setWeight(double aW) {

        if(aW > 0.0) {
            this.weight = aW;
        }
        else {
            this.weight=1.0;
        }
    }

    public void setNumberOfLegs(int aL) {

        if(aL >= 0.0 && aL <= 4) {
            this.numberOfLegs = aL;
        }
        else {
            this.numberOfLegs = 4;
        }

    }

    //Same Instance Boolean Check
    public boolean equals(Cat aC) {
        
        return aC != null &&
            this.name.equals(aC.getName()) &&
            this.weight == aC.getWeight() &&
            this.numberOfLegs == aC.getNumberOfLegs();
    }

    //ToString for Printing any Cat Instance's properties
    //Useful for debugging
    public String toString() {
        return this.name + " " + 
            this.weight + " " +
            this.numberOfLegs;
    }
 
    // "Action" Methods

    public void eat() {
        this.weight += 0.2;
    }

    public void sleep() {
        System.out.println("Zzz. Cat snore.");
    } 

    public void destroyYourStuff() {
        System.out.println("I am become "+this.name+" Destroyer of Worlds!");
    }
}