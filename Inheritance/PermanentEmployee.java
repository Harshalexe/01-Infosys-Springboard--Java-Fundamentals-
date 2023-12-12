public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private int experience;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary() {
        double variableComponent = (experience < 3) ? 0.5 * basicPay :
                                   (experience < 5) ? 0.7 * basicPay :
                                   (experience < 10) ? 1.2 * basicPay : 1.5 * basicPay;

        setSalary(variableComponent + basicPay + hra);
    }
}
