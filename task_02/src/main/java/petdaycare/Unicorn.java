package petdaycare;

//Modify the code below
public class Unicorn extends Pet {
    private int glitterLevel;

    public Unicorn(String name, int age, double baseFee, int glitterLevel){
        super(name, age, baseFee);
        this.glitterLevel = glitterLevel;
    }

    @Override
    public double calculateDailyCost(){
        return baseFee + (glitterLevel * 30);
    }
    public void makeSound(){
        System.out.println("Neigh... ✨sparkle sparkle✨");
    }
}
