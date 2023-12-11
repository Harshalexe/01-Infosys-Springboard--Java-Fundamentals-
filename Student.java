public class Student {
    private String studentName;
    private int studentId;
    private double qualifyingMarks;
    private int yearOfEngineering;
    private String residentialStatus;

    public void setStudentDetails(String name, int id, double marks, int year, String status) {
        studentName = name;
        studentId = id;
        qualifyingMarks = marks;
        yearOfEngineering = year;
        residentialStatus = status;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name       : " + studentName);
        System.out.println("Student Id         : " + studentId);
        System.out.println("Qualifying marks   : " + qualifyingMarks);
        System.out.println("Year of Engineering: " + yearOfEngineering);
        System.out.println("Residential status : " + residentialStatus);
    }
}