package JavaHW.Lesson5;

public class Сотрудник {
    String name = "default";
    String position = "default";
    String email = "123@mail.ru";
    String phone;
    int payment;
    int age;

    public Сотрудник(String name, String position, String email, String phone, int payment, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.payment = payment;
        this.age = age;
    }
    public int getAge(){
        return age;
        }
public void print (){
    System.out.println("ФИО сотрудника " + name);
    System.out.println("Должность " + position);
    System.out.println("Email " + email);
    System.out.println("Номер телефона " + phone);
    System.out.println("Зарплата " + payment);
    System.out.println("Возраст" + age);
    System.out.println("---------");
}

}







//    public static void main ( String[] args){
//        Сотрудник сотрудник1 = new Сотрудник();
//        сотрудник1.name = "Ivanov Ivan";
//        сотрудник1.position = "engineer";
//        сотрудник1.email = "invanovivan@mail.ru";
//        сотрудник1.phone = "892312312";
//        сотрудник1.payment = 30000;
//        сотрудник1.age = 30
//    }




















