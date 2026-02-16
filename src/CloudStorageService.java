public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // DODO: declare premium field
    private boolean isPremium = false;



    // DODO: constructor
    public CloudStorageService(String name, int id){
        super(name, id);
    }


    @Override
    public void performService() {
        // DODO:
        // check if active
        // print cloud access message
        if (isActive()) {
            System.out.println("cloud access message");
        }
        else {
            System.out.println("cloud access denied");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println("Welcome to cloud storage premium!");
        // DODO:
        // enable premium
        // print message

    }

    @Override
    public void generateBill() {
        System.out.println("cloud storage billing message");
        // TODO:
        // print billing message

    }
}