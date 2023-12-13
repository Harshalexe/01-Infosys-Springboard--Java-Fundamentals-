public class EnumExercise {

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(0001);
        student.setName("Harshal");
        student.setTotalMarks(250);
        student.calculateGrade();
        student.calculateScholarshipAmount();

        System.out.println("Student Details");
        System.out.println("Student Id: " + student.getStudentId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());
        System.out.println("Scholarship amount: " + student.getScholarshipAmount());
    }
}
