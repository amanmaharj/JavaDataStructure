package ArrayList;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aman", "Maharjan", 123));
        employeeList.add(new Employee("Anish","Shrestha",456));
        employeeList.add(new Employee("Arvind","Jaiswal", 789));
        employeeList.add(new Employee("Mike", "Wilson", 3456));

       // employeeList.forEach(employee -> System.out.println(employee));
        employeeList.set(0, new Employee("Hari", "khadka", 234));
      for(Employee x: employeeList){
            System.out.println(x);
        };

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());

    Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        System.out.println("________________________-");
    for(Employee emp :employeeArray){
        System.out.println(emp);
    }

        System.out.println(employeeList.contains(new Employee("Arvind", "Jaiswal",789)));

        System.out.println(employeeList.indexOf(new Employee("Hari", "khadka", 234)));

    }


}