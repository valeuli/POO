public class Main {
    public static void main(String[] args) {
        Dog dog;
        dog = new Dog(
                12,
                55,
                "Criolla",
                "Pelaje negro y suave",
                5,
                "Bogota",
                Animal.foodType.CARNIVORE
                );
        dog.eat();
        dog.play();
        dog.biteStuff();

        Cat cat;
        cat = new Cat(
                2.8,
                40,
                "Persa",
                "Pelaje beige y suave",
                3,
                "Bogota",
                Animal.foodType.CARNIVORE
        );
        cat.defecate();
        cat.doTrick();
        cat.ignorePeople();

        Tiger tiger;
        tiger = new Tiger(
                110,
                110,
                "Tigre de Bengala ",
                "Pelaje naranja",
                2,
                "India, Nepal, Bangladés, Bután, Birmania y Tíbet",
                Animal.foodType.CARNIVORE
        );
        tiger.hunt();
        tiger.climbTree();

        Shark shark;
        shark = new Shark(
                750,
                500,
                "Tiburón blanco",
                "Coloración es gris marronosa",
                5,
                "Regiones sub- tropicales y templadas",
                Animal.foodType.CARNIVORE
        );
        shark.fight();
        shark.getAlimentation();
        shark.swim();

        Cow cow = new Cow(
                720,
                129,
                "Holstein",
                "Blanco y negro",
                6,
                "Campos",
                Animal.foodType.OMNIVORE
        );
        cow.getBreed();
        cow.cowStuff();

        Bear bear = new Bear(
                110,
                180,
                "Oso frontino",
                "Negro",
                2,
                "Bosques nublados andinos y subandinos",
                Animal.foodType.OMNIVORE
        );
        bear.hibernate();
    }
}
