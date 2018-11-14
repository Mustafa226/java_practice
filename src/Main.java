import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Mustafa", "Mehuljic");
        Employee employee2 = new Employee(1, "Sabina", "Mehuljic");
        Employee employee3 = new Employee(3, "Alma", "Mehuljic");

        System.out.println(employee1.equals(employee2));

        Map<Employee, String> map = new HashMap<>();
        map.put(employee1, "Employee #1");
        System.out.println(map.get(employee1));
        System.out.println(map.get(new Employee(1, "xxx", "yyyyyy")));

    }

}
