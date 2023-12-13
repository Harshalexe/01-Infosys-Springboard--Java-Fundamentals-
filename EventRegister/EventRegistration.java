public class EventRegistration{
    protected String name;
    protected String nameOfEvent;
    protected
 
double registrationFee;

    public
 
EventRegistration(String name, String nameOfEvent)
 
{
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public
 
void
 
registerEvent() {
        System.out.println("Thank You " + name + " for your participation.");
        System.out.println("Your registration fee is: " + registrationFee);
    }
}