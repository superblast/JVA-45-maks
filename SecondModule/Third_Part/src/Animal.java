/**
 * Created by red6 on 4/11/2017.
 */
public class Animal {
    private String name;
    private boolean feeded;
    private boolean isAngry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFeeded() {
        return feeded;
    }

    public void setFeeded(boolean feeded) {
        this.feeded = feeded;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public String toString() {
        return "Name is: " + getName() + ", is angry: " + isAngry() + ", feeded: "  + isFeeded();
    }

}
