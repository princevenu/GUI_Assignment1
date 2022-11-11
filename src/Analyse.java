import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Analyse { // class where all the operations are performed
    public void analyse(int a) {
        String Lastname = "";
        Input in = new Input();
        HashMap<Integer, Integer> hm = new HashMap<>();
        if (a == 1) {
            String filename = "SortByName" + Lastname;
            int order = Integer.parseInt(JOptionPane.showInputDialog("Florida Named Hurricane 1950-2022 \n"
                    + "\n select the order "
                    + "\n 1. Ascending order"
                    + "\n 2. Descending order"));
            ArrayList<MyObject> temp = Input.myobjlist; // using temporay varaiable in the block

            if (order == 1) {

                temp.sort((o1, o2) -> o1.getStrom_name().compareTo(
                        o2.getStrom_name())); // sorting in ascending order
                JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                        + "display by storm name order\n"
                        + "\n Ascending order \n " + temp.toString().replace(",", " ").replace("[", " ").replace("]", " "));
                in.writeUsingFileWriter(temp, filename);// writing data into file
            } else if (order == 2) {
                // sorting in descending order
                temp.sort((o1, o2) -> o2.getStrom_name().compareTo(
                        o1.getStrom_name()));
                JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                        + "\ndisplay by storm name order\n"
                        + "\n Descending order \n " + temp.toString().replace(",", " ").replace("[", " ").replace("]", " "));
                in.writeUsingFileWriter(temp, filename); // write to file
            }
        }

        if (a == 2) {

            // sorting by category
            int order = Integer.parseInt(JOptionPane.showInputDialog("Florida Named Hurricane 1950-2022 \n"
                    + "\n select the order "
                    + "\n 1. Ascending order"
                    + "\n 2. Descending order"));
            String filename = "SortByCategory" + Lastname;
            ArrayList<MyObject> temp = Input.myobjlist;
            /*
             * using custom collections to sort the list of myobjects
             */
            if (order == 1) {
                Collections.sort(temp,
                        MyObject.MyObjectComparator);
                JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                        + "\nstorm category order\n "
                        + "Ascending order\n" + temp.toString().replace(",", " ").replace("[", " ").replace("]", " "));
                in.writeUsingFileWriter(temp, filename);
            } else if (order == 2) {
                Collections.sort(temp,
                        MyObject.MyObjectComparator);
                JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                        + "\nstorm category order\n  "
                        + "Ascending order\n" + temp.toString().replace(",", " ").replace("[", " ").replace("]", " "));
                in.writeUsingFileWriter(temp, filename);
            }

        }

        if (a == 3) {
            // strom Year order

            /*
             * using custom collections method to sort the list of myobjects for year
             */
            String filename = "SortByYear" + Lastname;
            ArrayList<MyObject> temp = Input.myobjlist;

            int order = Integer.parseInt(JOptionPane.showInputDialog("\n select the order "
                    + "\n 1. Ascending order"
                    + "\n 2. Descending order"));

            if (order == 2) {

                Comparator<MyObject> comparatorDesc = (MyObject1, MyObject2) -> Integer.valueOf(
                        MyObject1.getStrorm_date().getYear())
                        .compareTo(MyObject2.getStrorm_date().getYear());

                // asecendid order
                Collections.sort(temp, comparatorDesc);
                JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                        + "\nstorm Year order\n  "
                        + "Ascending order\n" + temp.toString().replace(",", " ").replace("[", " ").replace("]", " "));
                in.writeUsingFileWriter(temp, filename);
            }

            if (order == 2) {

                Comparator<MyObject> comparatorDesc = (MyObject1, MyObject2) -> Integer.valueOf(
                        MyObject2.getStrorm_date().getYear())
                        .compareTo(MyObject1.getStrorm_date().getYear());

                // pass above Comparator and sort in descending order
                Collections.sort(temp, comparatorDesc);

                JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                        + "\nstorm Year order\n  "
                        + "Descending order\n" + temp.toString().replace(",", " ").replace("[", " ").replace("]", " "));
                // ptintObj(temp);
                in.writeUsingFileWriter(temp, filename);
            }

        }

        if (a == 4) {
            // strom month orde

            /*
             * using custom collections method to sort the list of myobjects for month
             */
            ArrayList<MyObject> temp = Input.myobjlist;
            String filename = "SortByMonth" + Lastname;
            int order = Integer.parseInt(JOptionPane.showInputDialog("\n select the order "
                    + "\n 1. Ascending order"
                    + "\n 2. Descending order"));

            if (order == 1) {
                Comparator<MyObject> comparatorDesc = (MyObject1, MyObject2) -> Integer.valueOf(
                        MyObject1.getStrorm_date().getMonth())
                        .compareTo(MyObject2.getStrorm_date().getMonth());

                // asecendid order
                Collections.sort(temp, comparatorDesc);
                JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                        + "\nstorm Month order\n  "
                        + "Ascending order\n" + temp.toString().replace(",", " ").replace("[", " ").replace("]", " "));
                in.writeUsingFileWriter(temp, filename);
            }

            if (order == 2) {

                Comparator<MyObject> comparatorDesc = (MyObject1, MyObject2) -> Integer.valueOf(
                        MyObject2.getStrorm_date().getYear())
                        .compareTo(MyObject1.getStrorm_date().getYear());

                // pass above Comparator and sort in descending order
                Collections.sort(temp, comparatorDesc);
                JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                        + "\nstorm Month order\n  "
                        + "Descending order\n" + temp.toString().replace(",", " ").replace("[", " ").replace("]", " "));
                in.writeUsingFileWriter(temp, filename);
            }

        }

        if (a == 5) {
            // AVG STORN CATEGORY
            ArrayList<MyObject> temp = Input.myobjlist;
            int tot = 0;
            for (int i = 0; i < temp.size(); i++) {
                tot = temp.get(i).getIntensity();
            } /// calculation total strom intensity
            float avg = tot / temp.size();

            JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                    + "\nAverage strom intensity\n  "
                    + "Average storn intensity is \n" + avg);

        }

        if (a == 6) {
            ArrayList<MyObject> temp = Input.myobjlist;
            int max = 0;
            for (int i = 0; i < temp.size(); i++) {
                // If element already exists, just increase the count:-
                /*
                 * using %100 as year is execeeding more than 100 in few cases
                 */
                if (hm.containsKey(temp.get(i).getStrorm_date().getYear() % 100)) {
                    hm.put((temp.get(i).getStrorm_date().getYear() % 100),
                            hm.get(temp.get(i).getStrorm_date().getYear() % 100) + 1);
                } else {
                    hm.put((temp.get(i).getStrorm_date().getYear() % 100), 1);
                }

            }

            int[] arr = getMaxOccurrence(hm); // getting most action strom based on the count of hurricanes in the year
            JOptionPane.showConfirmDialog(null, "Florida Named Hurricane 1950-2022 \n" +
                    "\n Most active storm Year \n"
                    + "Most active strom is in Year " + arr[0] + " which is having " + arr[1] + " stroms");
            System.out.println(max + "");
        }

        if (a == 8) {
            ArrayList<MyObject> temp = Input.myobjlist;

            /*
             * using hashmap to keep count on strom year and strom count
             * 
             */

            // aggregate by year
            hm.clear();

            for (int i = 0; i < temp.size(); i++) {
                // If element already exists, just increase the count:-

                if (hm.containsKey(temp.get(i).getStrorm_date().getYear() % 100)) {
                    hm.put((temp.get(i).getStrorm_date().getYear() % 100),
                            hm.get(temp.get(i).getStrorm_date().getYear()) + 1);
                } else {
                    hm.put((temp.get(i).getStrorm_date().getYear() % 100), 1);
                }

            }

            JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                    + "\n Aggregate by Year"
                    + "\n Year\t" + "Count"
                    + hm.toString().replace(",", " ").replace("[", " ").replace("]", " "));

            // for (Entry<Integer, Integer> w : hm.entrySet()) {
            // System.out.println("YEAR :" + w.getKey() + " Count" + w.getValue());
            // }

        }

        if (a == 7) {
            // display the aggregate total by category
            ArrayList<MyObject> temp = Input.myobjlist;

            /*
             * using hashmap to keep count on strom category and strom count
             * 
             */

            // aggregate by year
            hm.clear();

            for (int i = 0; i < temp.size(); i++) {
                // If element already exists, just increase the count:-

                if (hm.containsKey(temp.get(i).getIntensity())) {
                    hm.put((temp.get(i).getIntensity()),
                            hm.get(temp.get(i).getIntensity()) + 1);
                } else {
                    hm.put((temp.get(i).getIntensity()), 1);
                }

            }

            for (Entry<Integer, Integer> w : hm.entrySet()) {
                System.out.println("Total Category of:" + w.getKey() + " hurricane" + w.getValue());
            }
            JOptionPane.showMessageDialog(null, "Florida Named Hurricane 1950-2022 \n"
                    + "\n Aggregate by category"
                    + "\n category,\t" + "Count"
                    + hm.toString().replace(",", " ").replace("[", " ").replace("]", " "));
        }
        if (a == 9) {

            // exit from application
            System.exit(0);
        }

    }

    public void ptintObj(ArrayList<MyObject> obj) {
        // used this method for printing on the console

        for (int i = 0; i < obj.size(); i++) {
            System.out.print(obj.get(i).getStrom_name() + "\t");
            System.out.print(obj.get(i).getIntensity() + "\t");

            System.out.print(obj.get(i).getStrorm_date() + "\n");

        }

    }

    static int[] getMaxOccurrence(HashMap<Integer, Integer> inp) {
        // Initially set maximum count as unity
        int[] arr = new int[2];
        int max = 0;
        // Iterating over above Map using for-each loop
        for (Entry<Integer, Integer> w : inp.entrySet()) {

            // Condition check
            // Update current max value with the value
            // exceeding unity in Map while traversing
            if (w.getValue() > max) {
                max = w.getValue();
                arr[0] = w.getKey();
                arr[1] = w.getValue();
            }
        }

        // Return the maximum value from the Map
        return arr;
    }

}
