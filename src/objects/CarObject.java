package objects;

public class CarObject {

    private String owner;
    private String identifier;

    public CarObject(String owner, String identifier) {
        this.owner = owner;
        this.identifier = identifier;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
