import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Input {

    public static ArrayList<MyObject> myobjlist = new ArrayList<>();
//list of objects
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    //date fromat to store date

    public void fileInput() throws NumberFormatException, ParseException {

        try {

            File file = new File("NamedFloridaHurricanes.txt");//name of the file in same folder
            FileReader reader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] myarr = line.split(",|\\:");    //delimitter for the line
                MyObject temp = new MyObject(myarr[0], Integer.parseInt(myarr[1]), sdf.parse(myarr[2]));
                                        //storing/converting line to my object class
                myobjlist.add(temp);  //storing my object to the list
            }

            System.out.println("list size--->" + myobjlist.size());
            reader.close();  //closing the file reader after use

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeUsingFileWriter(ArrayList<MyObject> d, String filename) {
        String data = d.toString().replace(",", " ").replace("[", " ").replace("]", " "); //converting my list of object sto string
        File file = new File(filename+".txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);   //writing data into the file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
