import GeekBrains_Lesson6.Animal;
import GeekBrains_Lesson6.Cat;
import GeekBrains_Lesson6.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animalList = new ArrayList<>();
        makeArrayOfAnimals(animalList); // создаем массив животных
        int typeMove = getAnimalMove(); // выбираем вид спорта
        getAnimalMove(animalList, typeMove); //печать результата в консоль

    }

    /** Запрос типа животного */
    public static int getAnimalType() {
        int type;
        do {
            System.out.println("Введите какого типа животного будем вводить данные: 0 - кошка, 1 - собака");
            Scanner s = new Scanner(System.in);
            type = s.nextInt();
        } while (type != 0 & type != 1);
        return type;
    }

    /** Запрос параметров животного*/
    public static void getParameterName(int animalType, ArrayList<Animal> animalList) {
        getParameterDog(animalType, animalList);
        getParameterCat(animalType, animalList);
    }

    /** Запрос параметров кошки*/
    public static void getParameterCat(int animalType, ArrayList<Animal> animalList) {
        if (animalType == 1) {
            System.out.print("Введите имя собаки - ");
            Scanner dogName = new Scanner(System.in);
            String setName = dogName.nextLine();

            System.out.print("Введите длину препятствия для собаки - ");
            Scanner dogLength = new Scanner(System.in);
            int setLength = dogLength.nextInt();

            Dog dog = new Dog(setName, setLength);
            animalList.add(dog);
        }
    }

    /** Запрос параметров собаки*/
    public static void getParameterDog(int animalType, ArrayList<Animal> animalList) {
        if (animalType == 0) {
            System.out.print("Введите имя кошки - ");
            Scanner catName = new Scanner(System.in);
            String setName = catName.nextLine();

            System.out.print("Введите длину препятствия для кошки - ");
            Scanner catLength = new Scanner(System.in);
            int setLength = catLength.nextInt();

            Cat cat = new Cat(setName, setLength);
            animalList.add(cat);
        }
    }

    /** Создание массива животных*/
    public static void makeArrayOfAnimals(ArrayList<Animal> animalList) {
        int a = 0;
        do {
            int animalType = getAnimalType(); //Запрос типа животного
            getParameterName(animalType, animalList); //Запрос параметров животного c созданием объекта

            Scanner ask = new Scanner(System.in);
            System.out.print("Ввести еще одного животного? да - 1, нет - 0");
            int askNext = ask.nextInt();
            if (askNext == 1) {
                a = 1;
            }
            else {
                break;
            }
        } while (a == 1) ;
    }

    /** Запрос действия*/
    public static int getAnimalMove() {
        int type;
        do {
            System.out.println("Введите вид спорта: 0 - бег, 1 - плавание");
            Scanner s = new Scanner(System.in);
            type = s.nextInt();
        } while (type != 0 & type != 1);
        return type;
    }

    /** Вывод в консоль результат выбранного действия животного*/
    public static void getAnimalMove(ArrayList<Animal> animalList, int typeMove) {
        if (typeMove == 0) {
            for (int i = 0; i < animalList.size(); i++) {
                animalList.get(i).run();
            }
        } else {
            for (int i = 0; i < animalList.size(); i++) {
                animalList.get(i).swim();
            }
        }
    }

}
