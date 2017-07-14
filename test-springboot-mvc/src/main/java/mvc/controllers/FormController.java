package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Adrian.Flak on 6/23/2017.
 */

@Controller
public class FormController {

    //region GET

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    String formGet(Model model){

        model.addAttribute("unBoundTextBox", "Initial Value");

        return "form";
    }

    @RequestMapping(value = "/form/{id}/var2/{id2}", method = RequestMethod.GET)
    String formPath(@PathVariable String id,
                    @PathVariable String id2
            , Model model){

        model.addAttribute("unBoundTextBox", id);
        model.addAttribute("id2", id2);

        return "form";
    }

    //endregion

    //region Post

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    String formPost(@RequestParam("unBoundTextBox") String unBoundTextValue){

        System.out.println("POSTBACK SUBMIT:   text box value = " + unBoundTextValue);

        return "form";
    }

    //endregion


}
