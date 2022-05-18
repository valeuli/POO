import javax.swing.*;

public class Shark extends Animal implements salvageAnimal{
    public Shark(
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
                "The shark is eating");
    }

    @Override
    public void defecate() {
        JOptionPane.showMessageDialog(
                null,
                "The shark is defecating");
    }

    @Override
    public void runAway() {
        JOptionPane.showMessageDialog(
                null,
                "The shark is swimming away");
    }

    @Override
    public void hunt() {
        JOptionPane.showMessageDialog(
                null,
                "The shark is hunting");
    }

    @Override
    public void fight() {
        JOptionPane.showMessageDialog(
                null,
                "The shark is fighting");
    }

    public void swim() {
        JOptionPane.showMessageDialog(
                null,
                "The shark is swimming");
    }
}
