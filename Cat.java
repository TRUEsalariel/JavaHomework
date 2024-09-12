package JavaHW.Lesson6;

//создаем общий класс кошки

public class Cat extends Animals {
   private int maxSwimDist;

   public Cat(String name, int age, int weight, int maxRunDist) {
        super(name, age, weight, maxRunDist);
        this.maxSwimDist = 0;
    }

    //прописываем,что они не могут плавать

    public void swim(int inputSwimDist) {
        if (inputSwimDist > maxSwimDist) {
            System.out.println(name + " can`t swim. ");
        }
    }
}