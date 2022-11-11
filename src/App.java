import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Input i = new Input(); //initializing input class
        i.fileInput();  //take input from file 
        Analyse analyse = new Analyse();//calling the analyse class

        String input = JOptionPane.showInputDialog("Florida Named Hurricanes 1950 - 2022"
        +"\n Select an option "
                + "\n 1. display by storm name order"
                + "\n 2.display by storm category order"
                + "\n 3.display by storm year order"
                + "\n 4.display by strom month order"
                + "\n 5.display the average storm Category"
                + "\n 6.display the most active year"
                + "\n 7.display the aggregate total by category"
                + "\n 8.display the aggregate total by year"
                + "\n 9.exit the program");
        int n = Integer.parseInt(input);


        if (n > 9) {
            JOptionPane.showMessageDialog(null, "enter valid option " + n + " ");
            //validating out of range

        }else{
            analyse.analyse(n); //if vaild input
        }

    }
}
