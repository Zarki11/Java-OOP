package Encapsulation.AnimalFarm;

public class Chicken {

    private String name;

    private int age;

    public Chicken(String name, int age) {
        setAge(age);
        setName(name);
    }

    public void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }else {
            this.age = age;
        }
    }

    private double calculateProductPerDay(){
        if (this.age < 6){
            return 2;
        } else if (this.age < 12) {
            return 1;
        }else {
            return 0.75;
        }
    }

    public double productPerDay (){
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s %d can produce %.2f eggs per day.", this.name, this.age, this.productPerDay());
    }
}
