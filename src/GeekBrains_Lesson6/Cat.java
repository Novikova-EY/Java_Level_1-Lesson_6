package GeekBrains_Lesson6;

public class Cat extends Animal {

    public Cat(String name, int length) {
        super(name, length);
    }

    @Override
    public void run() {
        if (getLength() > 200) {
            System.out.println("К сожалению, кошка " + getName() + " не смогла пробежать больше 200 м");
        } else System.out.println("Кошка " + getName() + " пробежала " + getLength() + " м");
    }

    @Override
    public void swim() {
        System.out.println("Кошки плавать не умеют...");
    }
}