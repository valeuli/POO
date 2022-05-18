import javax.swing.*;

public class Cow extends Animal implements domesticAnimal{
    public Cow(
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
                "The cow is eating");
    }

    @Override
    public void defecate() {
        JOptionPane.showMessageDialog(
                null,
                "The cow is defecating");
    }

    @Override
    public void pee() {
        JOptionPane.showMessageDialog(
                null,
                "The cow is urinating");
    }

    @Override
    public void sleep() {
        JOptionPane.showMessageDialog(
                null,
                "The cow is sleeping");
    }

    @Override
    public void makeSound() {
        JOptionPane.showMessageDialog(
                null,
                "Muuu, Muuu, Muuu");
    }

    @Override
    public void play() {
        JOptionPane.showMessageDialog(
                null,
                "The cow is playing");
    }

    @Override
    public void doTrick() {
        JOptionPane.showMessageDialog(
                null,
                "The cow is making a little trick");
    }

    public void cowStuff() {
        JOptionPane.showMessageDialog(
                null,
                "The cow is doing some cow stuff."
        );
    }
}
