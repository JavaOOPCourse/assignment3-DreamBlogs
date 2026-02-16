public class Customer extends User {

    // DODO: constructor
    public Customer(String name, int id){
        super(name, id);
    }

    @Override
    public void manageService(Service s) {

        // DODO:
        // print that customer cannot manage services
        System.out.println("that customer cannot manage services");
    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print customer using message
        // call performService()
        System.out.println("customer using message");
        s.performService();
    }
}