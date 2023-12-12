class EmployeeRecord {
    public static void main(String[] args) {
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        double averageSalary = calculateAverage(salaries);
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Above Average: " + countAboveAverage(salaries, averageSalary));
        System.out.println("Below Average: " + countBelowAverage(salaries, averageSalary));
    }

    private static double calculateAverage(double[] salaries) {
        double sum = 0;
        for (double salary : salaries) sum += salary;
        return sum / salaries.length;
    }

    private static int countAboveAverage(double[] salaries, double averageSalary) {
        int count = 0;
        for (double salary : salaries) if (salary > averageSalary) count++;
        return count;
    }

    private static int countBelowAverage(double[] salaries, double averageSalary) {
        int count = 0;
        for (double salary : salaries) if (salary < averageSalary) count++;
        return count;
    }
}