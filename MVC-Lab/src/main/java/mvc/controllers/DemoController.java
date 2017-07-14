package mvc.controllers;

import jdk.nashorn.internal.ir.IfNode;
import mvc.models.DemoModel;
import mvc.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Adrian.Flak on 6/27/2017.
 */

@Controller
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;


    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demoGet (Model model){

        model.addAttribute("demo", new DemoModel());

        return "demo";
    }

    @RequestMapping(value = "/demo", method = RequestMethod.POST)
    public String demoPost (Model model,
                               @ModelAttribute("demo") DemoModel demoModel,HttpServletRequest request){

        if(demoModel.getBoxOne() == null){
            demoModel.setBoxOne("unChecked");
        }
        if(demoModel.getBoxTwo() == null){
            demoModel.setBoxTwo("unChecked");
        }
        if(demoModel.getBoxThree() == null){
            demoModel.setBoxThree("unChecked");
        }


            demoRepository.save(demoModel);
            System.out.println(demoModel.getUserName() + " " + demoModel.getPassword());
            return "redirect:/demo";


    }

}