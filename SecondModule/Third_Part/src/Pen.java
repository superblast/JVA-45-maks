/**
 * Created by Red6 on 11.04.2017.
 */

// Should be always with pasta inserted
public class Pen {
    String colour = "";

    public Pen() {
//        Pasta pastaInst = new Pasta();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}


// should be always in Pen
class Pasta {
    private String pasta_colour = "";
    private String[] available_colrs = {"Red","Green", "Yellow"};

    public Pasta() {
        this.pasta_colour = setPasta_colour();
    }

    public String getPasta_colour() {
        return this.pasta_colour;
    }

    public String setPasta_colour() {
        int randomNum = 0;
        randomNum = 0 + (int)(Math.random() * 2);
//        for (String curr_color : available_colrs
//        ) {
//
//        }
        pasta_colour = available_colrs[randomNum];
        this.pasta_colour = pasta_colour;
        return pasta_colour;
    }

//    public void printS () {
//        System.out.println("pasta");
//    }
}
