public class StreamingService extends Service
        implements PremiumFeature {

    // DODO: declare premium field
    private boolean isPremium = false;

    // DODO: constructor
    StreamingService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {

        // DODO:
        // check if service is active
        // print different message for premium and normal
        if (isActive()) {
            System.out.println("premium message");
        }
        System.out.println("Normal message");
    }

    @Override
    public void upgradeToPremium() {

        // DODO:
        // set premium = true
        // print message

        isPremium=true;
        System.out.println("welcome to premium");
    }
}