public class ConsultationService extends Service
        implements Billable {

    // DODO: constructor
    ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (isActive()) {
            System.out.println("consultation message");
        }
        else {
            System.out.println("not consultation message");
        }
        // DODO:
        // check active
        // print consultation message


    }

    @Override
    public void generateBill() {

        // DODO:
        // print billing message
        System.out.println("consultation billing message");
    }
}