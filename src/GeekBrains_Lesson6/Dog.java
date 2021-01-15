package GeekBrains_Lesson6;

public class Dog extends Animal {

    public Dog(String name, int length) {
        super(name, length);
    }

    @Override
    public void run() {
        if (getLength() > 500) {
            System.out.println("К сожалению, собака " + getName() + " не смогла пробежать больше 500 м");
        } else System.out.println("Собака " + getName() + " пробежала " + getLength() + " м");
    }

    @Override
    public void swim() {
        if (getLength() > 10) {
            System.out.println("К сожалению, собака " + getName() + " не смогла проплыть больше 10 м");
        } else System.out.println("Собака " + getName() + " проплыла " + getLength() + " м");
    }
}