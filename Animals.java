package JavaHW.Lesson6;

//создаем общий класс животные

public class Animals {
        protected String name;
        protected int age;
        protected int weight;
        protected int maxRunDist;

//создаем конструктор общих черт,так как у нас есть общий метод бега, то ввожу инт.


    public Animals(String name, int age, int weight, int maxRunDist) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.maxRunDist = maxRunDist;
    }

    //принцип бега у животных один, создаем общий метод

        public void run ( int inputRunDist){
            if (inputRunDist <= maxRunDist) {
                System.out.println(name + " runs for " + inputRunDist + " meters.");
            } else {
                System.out.println( "This action is impossible! ");
            }







        }
    }
