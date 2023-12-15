import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        try {
            long lops = employeeService.calculateLOPs("01/01/2022", "10/01/2022");
            System.out.println("LOPs: " + lops);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

