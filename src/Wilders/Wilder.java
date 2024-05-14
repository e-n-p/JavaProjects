package Wilders;

public class Wilder
{
    private String firstName;
    private boolean aware;

    Wilder(String firstName, boolean aware){
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI(){
        return "My name is " + firstName + " and I am " + ((aware) ? "" : "not ") + "aware";
    }
}

