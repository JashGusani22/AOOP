class Animal{
    public void makesound(){
        System.out.println("Animal is making a 
        sound");
    }
}
class Dog extends Animal{
    @Override;
    public void makesound(){
        System.out.println("Dog is barking");
    }
}
class methodoverring{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makesound();
        Dog dog = new Dog();
        dog.makesound();
    }
}