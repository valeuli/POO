/* Subclase Dog*/
import javax.swing.*;


public class Dog extends Animal implements domesticAnimal{
    public Dog(
            double weight,
            double height,
            String breed,
            String furType,
            int age,
            String habitat,
            foodType alimentation
    ) {
        super(weight, height, breed, furType, age, habitat, alimentation);
    }

    @Override
    public void eat(){
        JOptionPane.showMessageDialog(
                null,
                "The dog is eating");
    }

    @Override
    public void defecate() {
        JOptionPane.showMessageDialog(
                null,
                "The dog is defecating");
    }

    @Override
    public void pee() {
        JOptionPane.showMessageDialog(
                null,
                "The dog is urinating");
    }

    @Override
    public void sleep() {
        JOptionPane.showMessageDialog(
                null,
                "The dog is sleeping");
    }

    @Override
    public void makeSound() {
        JOptionPane.showMessageDialog(
                null,
                "Guau, Guau, Guau");
    }

    @Override
    public void play() {
        JOptionPane.showMessageDialog(
                null,
                "The dog is playing");
    }

    @Override
    public void doTrick() {
        JOptionPane.showMessageDialog(
                null,
                "The dog is making a trick");
    }

    public void biteStuff() {
        JOptionPane.showMessageDialog(
                null,
                "The dog is biting some stuff"
        );
    }
}
