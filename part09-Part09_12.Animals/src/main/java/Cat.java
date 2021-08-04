public class Cat extends Animal implements NoiseCapable {

    public Cat(String animalName) {
        super(animalName);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
