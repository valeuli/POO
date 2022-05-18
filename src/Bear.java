import javax.swing.*;

public class Bear extends Animal implements salvageAnimal{
    public Bear(
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
                "The bear is eating");
    }

    @Override
    public void defecate() {
        JOptionPane.showMessageDialog(
                null,
                "The bear is defecating");
    }

    @Override
    public void pee() {
        JOptionPane.showMessageDialog(
                null,
                "The bear is urinating");
    }

    @Override
    public void sleep() {
        JOptionPane.showMessageDialog(
                null,
                "The bear is sleeping");
    }

    @Override
    public void runAway() {
        JOptionPane.showMessageDialog(
                null,
                "The bear is running");
    }

    @Override
    public void hunt() {
        JOptionPane.showMessageDialog(
                null,
                "The bear is hunting");
    }

    @Override
    public void fight() {
        JOptionPane.showMessageDialog(
                null,
                "The bear is fighting");
    }

    public void hibernate(){
        JOptionPane.showMessageDialog(
                null,
                "The bear is hibernating");
    }
}
