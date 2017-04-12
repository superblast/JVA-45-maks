/**
 * Created by red6 on 4/12/2017.
 */
public class FiguriAbstractDemo {
    public static void main(String[] args) {
        Parallel paral1 = new Parallel();
        paral1.setName("Paralel one");
        paral1.setNumberOfSides(4);
        System.out.println(paral1.getNameByFigure(paral1));
        System.out.println(paral1.getParamsByFigure(paral1));

        Treugolniki treug1 = new Treugolniki();
        treug1.setName("Treug one");
        treug1.setTreugolnikParams(true, false  );
        System.out.println(treug1.getNameByFigure(treug1));
        System.out.println(treug1.getParamsByFigure(treug1));
    }
}
