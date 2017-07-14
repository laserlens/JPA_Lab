package common.helpers;
import javax.servlet.http.HttpServletRequest;

import java.util.Enumeration;


/**
 * Created by Adrian.Flak on 6/14/2017.
 */
public class ServletHelper extends CommonHelper {

    public static void logRequestParams(HttpServletRequest request){
        //this should be  refractored

        Enumeration<String> paramNameList = request.getParameterNames();
        while (paramNameList.hasMoreElements()){
            String paramName = paramNameList.nextElement();
            String value = "";
            for (String str: request.getParameterValues(paramName)){
                value += str;
            }

            logger.info("Parameter Name = " + paramName + ", value(s) = " + value);
        }
    }


}
