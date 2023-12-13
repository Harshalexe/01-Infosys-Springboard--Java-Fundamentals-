public class SingleEventRegistration extends EventRegistration
 
{
    private
 
int participantNo;

    public
 
SingleEventRegistration(String name, String nameOfEvent, int participantNo)
 
{
        super(name, nameOfEvent);

        
this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        super.registerEvent();
        switch (nameOfEvent) {
            case "ShakeALeg":
                registrationFee = 100;
                break;
            case "Sing&Win":
                registrationFee = 150;
                break;
            case "PlayAway":
                registrationFee = 130;
                break;
            default:
                System.out.println("Please choose a valid event");
        }
        System.out.println("You are participant no: " + participantNo);
    }
}