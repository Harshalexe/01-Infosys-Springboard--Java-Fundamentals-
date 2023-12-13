public class RegistrationTester {
    public static void main(String[] args) {
        String[] telephoneNumbers1 = {"9452425421", "7676765252"};
        Registration user1 = new Registration("Kevin", "MN989IN", telephoneNumbers1);
        user1.displayDetails();

        System.out.println();

        String[] telephoneNumbers2 = {"2345615451", "6763562562"};
        Registration user2 = new Registration("Julias", "123", "PN7878", telephoneNumbers2);
        user2.displayDetails();

        System.out.println();

        String[] telephoneNumbers3 = {"9634524353", "9887373737"};
        Registration user3 = new Registration("Jammy", "45453", "765", telephoneNumbers3);
        user3.displayDetails();

        System.out.println();

        String[] telephoneNumbers4 = {"9867456367", "7645367356"};
        Registration user4 = new Registration("Rose", "PN8934", "34356", telephoneNumbers4);
        user4.displayDetails();
    }
}