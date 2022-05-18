class Animal {
    private double weight;
    private double height;
    private String breed;
    private int age;
    private String habitat;
    public enum foodType{
        CARNIVORE,
        HERBIVORE,
        OMNIVORE
    };
    private String furType;
    private foodType alimentation;

    // Constructor
    public Animal(
            double weight, double height, String breed, String furType,
            int age, String habitat, foodType alimentation
    ){
        this.weight = weight;
        this.height = height;
        this.breed = breed;
        this.furType = furType;
        this.age = age;
        this.habitat = habitat;
        this.alimentation = alimentation;
    }

    // Getters
    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

    public String getBreed(){
        return breed;
    }

    public String getFurType(){
        return furType;
    }

    public int getAge(){
        return age;
    }

    public String getHabitat(){
        return habitat;
    }

    public foodType getAlimentation(){
        return alimentation;
    }

    // Setters
    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setFurType(String furType){
        this.furType = furType;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public void setAlimentation(foodType alimentation){
        this.alimentation = alimentation;
    }

    public void eat() {}

    public void defecate() {}

    public void pee() {}

    public void sleep() {}

    public void makeSound() {}
}
