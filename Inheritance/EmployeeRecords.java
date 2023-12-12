public class EmployeeRecords {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        permanentEmployee.setName("Anil");
        permanentEmployee.setEmpId(101);
        permanentEmployee.setBasicPay(10000);
        permanentEmployee.setHra(1500);
        permanentEmployee.setExperience(3);
        permanentEmployee.calculateSalary();
        System.out.println("Permanent Employee: Your salary is: " + permanentEmployee.getSalary());

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName("Ankit");
        contractEmployee.setEmpId(102);
        contractEmployee.setWages(500);
        contractEmployee.setHours(10);
        contractEmployee.calculateSalary();
        System.out.println("Contract Employee: Your salary is: " + contractEmployee.getSalary());
    }
}
