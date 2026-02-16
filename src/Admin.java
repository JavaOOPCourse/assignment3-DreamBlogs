public class Admin extends User {

    // DODO: constructor
    public Admin(String name, int id) {
        super(name, id);
    }


    @Override
    public void manageService(Service s) {
        System.out.println("Admin managing message");
        // DODO:
        // print admin managing message


    }

    @Override
    public void useService(Service s) {
        System.out.println("admin using message");
        s.performService();
        // TODO:
        // print admin using message
        // call performService()

    }
}