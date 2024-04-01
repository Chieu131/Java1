package com.assignment6;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ManagementPerson managementPerson = new ManagementPerson();
        Person persons[] = new Person[3];

        try {
            String name = "";
            String address = "";
            String sSalary = "";
//
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                System.out.println("\nEnter information for Person " + (i + 1));

                while (true) {
                    System.out.print("Name: ");
                    name = input.nextLine();

                    if (!name.isEmpty()) {
                        break; // Exit the loop if name is not empty
                    } else {
                        System.out.println("Name cannot be empty. Please enter a valid name.");
                    }
                }

                while (true) {
                    System.out.print("Address: ");
                    address = input.nextLine();

                    if (!address.isEmpty()) {
                        break; // Exit the loop if address is not empty
                    } else {
                        System.out.println("Address cannot be empty. Please enter a valid address.");
                    }
                }

                while (true) {
                    System.out.print("Salary: ");
                    sSalary = input.nextLine();

                    if (sSalary.matches("\\d+")) {
                        double salary = Double.parseDouble(sSalary);
                        if (salary > 0) {
                            persons[i] = managementPerson.inputPersonInfo(name, address, sSalary);
                            break;
                        } else {
                            System.out.println("Salary must be greater than zero. Please enter a valid salary.");
                        }
                    } else {
                        System.out.println("Invalid input. Salary must be a number. Please enter a valid salary.");
                    }
                }
            }

            Person person = managementPerson.inputPersonInfo(name, address, sSalary + " ");

            if (person != null) {
                managementPerson.displayPersonInfo(person);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
