package petdaycare;

//Modify the code below
public class Dragon extends Pet{
    private int fireBreathIntensity;

    public Dragon(String name, int age, double baseFee, int fireBreathIntensity){
        super(name, age, baseFee);
        this.fireBreathIntensity = fireBreathIntensity;
    }

    @Override
    public double calculateDailyCost(){
        return baseFee + (fireBreathIntensity * 50);
    }
    public void makeSound(){
        System.out.println("ROAAAAR! 🔥");
    }
}