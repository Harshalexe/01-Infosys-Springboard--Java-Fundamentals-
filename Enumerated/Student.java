public class Student {

    private int studentId;
    private String name;
    private Grade grade;
    private int scholarshipAmount;
    private int totalMarks;

    public enum Grade {
        A, B, C, D, E
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setScholarshipAmount(int scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void calculateGrade() {
        switch (totalMarks) {
            case 250:
                grade = Grade.A;
                break;
            case 200:
                if (totalMarks < 250) {
                    grade = Grade.B;
                }
                break;
            case 175:
                if (totalMarks < 200) {
                    grade = Grade.C;
                }
                break;
            case 150:
                if (totalMarks < 175) {
                    grade = Grade.D;
                }
                break;
            default:
                grade = Grade.E;
        }
    }

    public void calculateScholarshipAmount() {
        switch (grade) {
            case A:
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;
            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            default:
                scholarshipAmount = 0;
        }
    }
}
