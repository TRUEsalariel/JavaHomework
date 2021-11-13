package JavaHW.Lesson6;

//создаем общий класс собаки

public class Dog extends Animals{
    private int maxSwimDist;


    public Dog(String name, int age, int weight, int maxRunDist) {
        super(name, age, weight, maxRunDist);
        this.maxSwimDist = 10;
    }

//прописываем, что собаки могут плавать на длину не более 10м.

    public void swim(int inputSwimDist) {
        if (inputSwimDist <= maxSwimDist){
            System.out.println(name + " swims for " + inputSwimDist + " meters");
        } else {
            System.out.println("This action is impossible! ");
        }
    }
}
