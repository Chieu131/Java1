package com.assignment6;

public class ManagementPerson {
    /**
     * This is method used to input information of Person
     *
     * @param name
     *            of Person
     * @param address
     *            of Person
     * @param sSalary
     *            of Person
     * @return person
     * @throws Exception "Salary is greater than zero"
     *                   "You must input Salary."
     *                   "You must input digit.
     */
    public Person inputPersonInfo(String name, String address, String sSalary)
            throws Exception {
        // Student write code here
        try {
            if(name.isEmpty()) {
                throw new Exception("Name cannot be empty");
            }

            if(address.isEmpty()) {
                throw new Exception("Address cannot be empty");
            }

//            if(sSalary.isEmpty()) {
//                throw new Exception("Salary cannot be empty");
//            }

            double salary = Double.parseDouble(sSalary);

//            if(salary > 0) {
//                return new Person(name, address, salary);
//            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return null;
    }

    /**
     * This is method used to display information of Person you have entered.
     *
     * @param person
     *            Object
     */
    public void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Salary: " + person.getSalary());
    }

    /**
     * This is method used to sort Person entered by gradually increased of
     * Salary.
     *
     * @param persons
     *            of Array Person
     * @return Person Object
     * @throws Exception "Can't Sort Person"
     */
    public Person[] sortBySalary(Person[] persons) throws Exception {
        try {
            // Bubble sort implementation
            int n = persons.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (persons[j].getSalary() > persons[j + 1].getSalary()) {
                        // Swap persons[j] and persons[j+1]
                        Person temp = persons[j];
                        persons[j] = persons[j + 1];
                        persons[j + 1] = temp;
                    }
                }
            }
            return persons;
        } catch (Exception e) {
            throw new Exception("Can't Sort Person: " + e.getMessage());
        }
    }


}





