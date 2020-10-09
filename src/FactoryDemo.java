public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSong());

        Animal a2 = animalFactory.getAnimal("cannie");
        System.out.println("a2 sound: " + a2.makeSong());
    }
}
