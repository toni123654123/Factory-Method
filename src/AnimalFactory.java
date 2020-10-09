public class AnimalFactory {
    public Animal getAnimal (String types){
        if ("cannie".equals(types)){
            return new  Dog();
        }else{
            return new  Cat();
        }
    }
}
