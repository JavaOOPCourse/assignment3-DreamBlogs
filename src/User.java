public abstract class User {

    // DODO: declare fields
    // name
    // id
    String name;
    int id;

    // DODO: constructor
    User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // TODO: abstract method manageService(Service s)
    abstract void manageService(Service s);

    // TODO: abstract method useService(Service s)
    abstract void useService(Service s);
}