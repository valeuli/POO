import javax.swing.*;

public class Tiger extends Animal implements salvageAnimal{
    public Tiger(
            double weight,
            double height,
            String breed,
            String furType,
            int age,
            String habitat,
            Animal.foodType alimentation
    ) {
        super(weight, height, breed, furType, age, habitat, alimentation);
    }

    @Override
    public void eat(){
        JOptionPane.showMessageDialog(
                null,
                "The tiger is eating");
    }

    @Override
    public void defecate() {
        JOptionPane.showMessageDialog(
                null,
                "The tiger is defecating");
    }

    @Override
    public void pee() {
        JOptionPane.showMessageDialog(
                null,
                "The tiger is urinating");
    }

    @Override
    public void sleep() {
        JOptionPane.showMessageDialog(
                null,
                "The tiger is sleeping");
    }

    @Override
    public void makeSound() {
        JOptionPane.showMessageDialog(
                null,
                "Grgrgrgrgr");
    }

    @Override
    public void runAway() {
        JOptionPane.showMessageDialog(
                null,
                "The tiger is running");
    }

    @Override
    public void hunt() {
        JOptionPane.showMessageDialog(
                null,
                "The tiger is hunting");
    }

    @Override
    public void fight() {
        JOptionPane.showMessageDialog(
                null,
                "The tiger is fighting");
    }

    public void climbTree() {
        JOptionPane.showMessageDialog(
                null,
                "The tiger is climbing a tree."
        );
    }
}
