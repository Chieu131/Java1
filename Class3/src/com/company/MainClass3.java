package com.company;

public class MainClass3 {
    public static void main(String[] args) {

//        Manager manager1
//                = new Manager("Man1", "man1@gmail.com", 2000, "IT");
//        manager1.display();
//        Manager manager2
//                = new Manager("Man2", "man2@gmail.com", 2000, "HR");
//        manager2.display();
//
//        Employee emp = new Employee("Emp1", "emp1@gmail.com", 500, 2);
//        emp.display();


        Person person[] = new Person[4];
        person[0] = new Director("Tuan", "tuan@gmail.com", 3000, "MKT");
        person[1] = new Manager("Man1", "man1@gmail.com", 2000, "IT");
        person[2] = new Manager("Man2", "man2@gmail.com", 2000, "HR");
        person[3] = new Employee("Emp1", "emp1@gmail.com", 500, 2);


        for (Person item : person) {
            item.display();
        }

        int total = 0;
        for (Person item : person) {
            System.out.println("Bonus " + item.getBonus());
            total += item.getBonus();
        }

        System.out.println("Total bonus of this year: " + total);

    }
}
