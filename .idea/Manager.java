package JavaHW.Lesson5;

public class Manager {
    public static void main(String[] args) {
        Сотрудник[] persArray = new Сотрудник[5];
        persArray[0] = new Сотрудник("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Сотрудник("Ivanov Oleg", "Senior Engineer", "ivoleg@mailbox.com", "892312344", 50000, 43);
        persArray[2] = new Сотрудник("Ivanov Petr", "Boss", "ivboss@mailbox.com", "892399999", 150000, 38);
        persArray[3] = new Сотрудник("Ivanov Andrey", "Chief security", "ivsec@mailbox.com", "892366666", 80000, 65);
        persArray[4] = new Сотрудник("Ivanova Olga", "Secretary", "ivolga@mailbox.com", "892313312", 40000, 35);
    //    persArray[2].print(); // выводим на печать любого сотрудника
        for (int i = 0; i < persArray.length; i++) {
            if ( persArray[i].getAge() > 40) {
                persArray[i].print();
                ;
            }
        }
    }
}