/*
 * Written by Kirk Allgeyer
 */
public class HouseOfCats {
    
    public static void main(String[] args) {
        
        Cat cat01;
        Cat cat02;

        cat01 = new Cat();
        cat02 = new Cat("Triscuit", 9.2, 4);

        System.out.println(cat01.getName()+" "+cat01.getWeight()+" "+cat01.getNumberOfLegs());

        System.out.println(cat02.getName()+" "+cat02.getWeight()+" "+cat02.getNumberOfLegs());

        cat01.setName("Mr.Flufferkins");
        cat01.setWeight(8.0);

        System.out.println(cat01.getName()+" "+cat01.getWeight()+" "+cat01.getNumberOfLegs());

        Cat cat03 = new Cat("Mr.Flufferkins", 8.0, 4);

        //Is False
        System.out.println(cat01.equals(cat02));
        //Is True
        System.out.println(cat01.equals(cat03));
        //Is False; they don't share the same memory address
        System.out.println(cat01 == cat03);

    }

}
