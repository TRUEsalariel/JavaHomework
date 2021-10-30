package JawaHW.Lesson2;

public class HomeworkApp2 {
    public static void main(String[] args) {
summChk();
nmbrChk();
falseChk();
mathCheck();

    }
    public static void summChk() {
        int a = 15;
        int b = 25;
        if ( a + b > 10 && a + b <= 20 ) {
            System.out.println("True");
        } else {
            System.out.println( "False");
        }
    }

    public static void nmbrChk() {
        int c = -17;
        if ( c < 0 ) {
            System.out.println( "Число отрицательное");
        } else {
            System.out.println("Число положительно");
        }

    }

    public static void falseChk() {
        int d=5;
        if (d>=0){
        System.out.println("False");
        }else {
        System.out.println("True");
        }
    }


    public static void mathCheck() {
        int e = 4;
        for (int f = 0; f < e; f++) {
            System.out.println("Считаем строчки");
        }

    }
}
