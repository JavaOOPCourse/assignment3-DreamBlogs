public abstract class Service {

    // DODO: declare private fields
    // serviceName
    // serviceId
    // isActive
    private String serviceName;
    private int serviceId;
    private boolean isActive;

    // DODO: constructor
    public Service (String name, int id) {
        this.serviceName = name;
        this.serviceId = id;
        this.isActive = true;
    }

    // DODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService() {
        this.isActive = true;
        System.out.println("Service is active!");
    }

    // DODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    public void deactivateService() {
        this.isActive = false;
        System.out.println("Service is deactivated!");
    }


    // DODO: getter for serviceName

    public String getServiceName() {
        return serviceName;
    }

    // DODO: getter for isActive

    public boolean isActive() {
        return isActive;
    }




    // DODO: abstract method performService()
    abstract void performService();
}