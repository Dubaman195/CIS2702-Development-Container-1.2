package petdaycare;

//Modify the code below
public abstract class Pet{
    protected String name;
    protected int age;
    protected double baseFee;

    public Pet(String name, int age, double baseFee){
        this.name = name;
        this.age = age;
        this.baseFee = baseFee;
    }

    public abstract double calculateDailyCost();
    public abstract void makeSound();

    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}