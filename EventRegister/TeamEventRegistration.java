public class TeamEventRegistration extends EventRegistration {
    private int teamNo;
    private int noOfParticipants;

    public TeamEventRegistration(String name, String nameOfEvent, int teamNo, int noOfParticipants)
 
{
        super(name, nameOfEvent);
        this.teamNo = teamNo;
        this.noOfParticipants = noOfParticipants;
    }

    @Override
    public void registerEvent() {
        super.registerEvent();
        switch (nameOfEvent) {
            case "ShakeALeg":
                registrationFee = 50 * noOfParticipants;
                break;
            case "Sing&Win":
                registrationFee = 60 * noOfParticipants;
                break;
            case "Actathon":
                registrationFee = 80 * noOfParticipants;
                break;
            case "PlayAway":
                registrationFee = 100 * noOfParticipants;
                break;
            default:
                System.out.println("Please choose a valid event");
        }
        System.out.println("You are team no: " + teamNo);
    }
}