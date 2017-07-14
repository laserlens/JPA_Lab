package common.helpers;
import java.util.*;

/**
 * Created by Adrian.Flak on 5/22/2017.
 */
public class StringHelper extends CommonHelper{

    //this checks a string if it is null or empty and returns true orthwise false
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    //compare stings to see if same case insensitive
    public static boolean hasSame(String... s){
        for(int i = 0; i < s.length; i++){
            for(int n = i+1; n < s.length; n++){
                if (s[i].equalsIgnoreCase(s[n])) return true;
            }
        }
        return false;
    }

    //delete same from list of strings return capitalized list
    public static List deleteSame(String... s){
        List<String> al = new ArrayList<>();
        for(String string: s) al.add(string.toLowerCase());//adds strings to a list as all lower case

        Set<String> hs = new LinkedHashSet<>(al); //hash set doesn't allow duplicates and linked keeps insertion order

        al.clear(); //clear old list

        //capitalizes first letter and add back to original list
        for(String string: hs) al.add(string.substring(0, 1).toUpperCase() + string.substring(1));
        return al;
    }

    //capitalize a single String
    public static String capitalizer(String s){
       String prettyString = s.toLowerCase();
       return prettyString.substring(0, 1).toUpperCase() + prettyString.substring(1);
    }
}
