package petdaycare;

//Modify the code below
public class NinjaCat extends Pet {
    private int stealthLevel;

    public NinjaCat(String name, int age, double baseFee, int stealthLevel){
        super(name, age, baseFee);
        this.stealthLevel = stealthLevel;
    }

    @Override
    public double calculateDailyCost(){
        return baseFee - (stealthLevel * 10);
    }
    public void makeSound(){
        System.out.println("...");
    }
}
