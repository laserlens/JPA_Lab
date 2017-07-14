package common.helpers;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Adrian.Flak on 5/31/2017.
 */
public class SQLDateHelper extends CommonHelper{

    public static java.sql.Date utilToSQLDateConverter(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

    public static java.util.Date sqlToUtilDateConverter(java.sql.Date date){
        return new java.util.Date(date.getTime());
    }

    public static Date stringToDate(String stringDate, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format, Locale.ENGLISH);
        Date date = java.sql.Date.valueOf(LocalDate.parse(stringDate, formatter));
        ;
        return date;
    }
}
