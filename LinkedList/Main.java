package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList();


        Employee hari = new Employee("hari", "Prasad",1234);
        Employee shyam = new Employee("Shyam","hariyana", 9393);
        Employee raju = new Employee("Raju","jaikishan",420);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());
        list.addToFront(hari);
        list.addToFront(shyam);
        list.addToFront(raju);


        System.out.println("The size of the list is : "+list.getSize());
        list.printLinkedList();
        list.removeFromFont();
        System.out.println("The size of the list is : "+list.getSize());


    }
}
