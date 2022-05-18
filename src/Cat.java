import javax.swing.*;

public class Cat extends Animal implements domesticAnimal{
    public Cat(
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
                "The cat is eating");
    }

    @Override
    public void defecate() {
        JOptionPane.showMessageDialog(
                null,
                "The cat is defecating");
    }

    @Override
    public void pee() {
        JOptionPane.showMessageDialog(
                null,
                "The cat is urinating");
    }

    @Override
    public void sleep() {
        JOptionPane.showMessageDialog(
                null,
                "The cat is sleeping");
    }

    @Override
    public void makeSound() {
        JOptionPane.showMessageDialog(
                null,
                "Miau, Miau, Miau");
    }

    @Override
    public void play() {
        JOptionPane.showMessageDialog(
                null,
                "The cat is playing");
    }

    @Override
    public void doTrick() {
        JOptionPane.showMessageDialog(
                null,
                "The cat is making a trick");
    }

    public void ignorePeople() {
        JOptionPane.showMessageDialog(
                null,
                "The cat is ignoring people."
        );
    }
}
