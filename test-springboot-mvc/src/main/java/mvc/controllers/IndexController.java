package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adrian.Flak on 6/23/2017.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }

}