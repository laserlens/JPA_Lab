/**
 * Created by Adrian.Flak on 6/21/2017.
 */
public class mysql {


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("MySQL Driver Found");
        } catch (ClassNotFoundException ex) {
            System.out.println("MySQL Driver Not Found: " + ex);
        }

    }

}
