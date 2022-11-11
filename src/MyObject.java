import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class MyObject {
SimpleDateFormat sf = new SimpleDateFormat("MM-dd-yyyy"); 
//date fromat to store the date

    @Override
    public String toString() {
        return ""  + getStrom_name() + "      \t" +
                getIntensity() + "        \t" +
                 sf.format(getStrorm_date()) + "\n" ;
    }//customized to string method for ease

    public MyObject(String Strom_name, int intensity, Date Strorm_date) {
        this.Strom_name = Strom_name;
        this.intensity = intensity;
        this.Strorm_date = Strorm_date;
    }  //constructor for myObject

    private String Strom_name;
    private int intensity;
    private Date Strorm_date;

    public String getStrom_name() {
        return this.Strom_name;
    }

    public void setStrom_name(String Strom_name) {
        this.Strom_name = Strom_name;
    }

    public int getIntensity() {
        return this.intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public Date getStrorm_date() {
        return this.Strorm_date;
    }

    public void setStrorm_date(Date Strorm_date) {
        this.Strorm_date = Strorm_date;
    }

    public static Comparator<MyObject> MyObjectComparator = new Comparator<MyObject>() {
        public int compare(MyObject s1, MyObject s2) {
            int a = s1.getIntensity();
            int b = s2.getIntensity();

            // Returning in ascending order
            return a - b;

            // return
        }
    }; ///custom comparator used for sorting based on category

    public static Comparator<MyObject> MyObjectComparator1 = new Comparator<MyObject>() {
        public int compare(MyObject s1, MyObject s2) {
            int a = s1.getIntensity();
            int b = s2.getIntensity();
            // for descending order
            // Returning in ascending order
            return b - a;   ///custom comparator used for sorting based on category


            // return
        }
    };
}
