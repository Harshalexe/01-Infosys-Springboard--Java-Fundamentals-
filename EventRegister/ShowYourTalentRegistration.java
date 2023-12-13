public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        // Single event registrations
        EventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        participant1.registerEvent();

        EventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        participant2.registerEvent();

        // Team event registration
        EventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 1, 5);
        team1.registerEvent();
    }
}