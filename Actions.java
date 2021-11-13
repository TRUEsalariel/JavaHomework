package JavaHW.Lesson6;

public class Actions {
    public static void main (String[] args){

        Cat[] cat = new Cat[2];
        cat[0]= new Cat("Ozzy", 10, 5, 200);
        cat[1]= new Cat("Whisky", 8, 7, 200);
        Dog[] dog = new Dog[2];
        dog[0] = new Dog ("Bobik", 7, 16, 500);
        dog[1] = new Dog ("Sharik", 12, 40, 500);

        cat[0].run(150);
        cat[1].run(70);
        dog[0].run(250);
        dog[1].run(120);
        cat[0].swim(10);
        cat[1].swim(5);
        dog[0].swim(8);
        dog[1].swim(12);
        System.out.println("-------------");
        System.out.println("Total animals count: " + (cat.length + dog.length));
        System.out.println("Total cats count: " + cat.length);
        System.out.println("Total dogs count: " + dog.length);
    }

}
