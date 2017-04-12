/**
 * Created by red6 on 4/12/2017.
 */
public abstract class Figures {
    String name;
    String parameters;

    public Figures() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameByFigure(Figures figure) {
        if (figure instanceof Parallel) {
            System.out.println("The Parallel name is: ");
        }
        else if (figure instanceof Treugolniki) {
            System.out.println("The Treugolnik name is: ");
        }
        return name;
    }

    public String getParamsByFigure(Figures figure) {
        if (figure instanceof Parallel) {
            System.out.println("The Parallel params are: ");
            parameters = ((Parallel) figure).printAll();
        }
        else if (figure instanceof Treugolniki) {
            System.out.println("The Treugolnik params are: ");
            parameters = ((Treugolniki) figure).printAll();
        }
        return parameters;
    }

    public String getName() {
        return name;
    }
}
