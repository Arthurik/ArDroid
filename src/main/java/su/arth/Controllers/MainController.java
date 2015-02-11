package su.arth.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Артур on 24.01.2015.
 */
@Controller
@RequestMapping("/")
public class MainController {

@RequestMapping(method = RequestMethod.GET)
    public String index(ModelAndView modelAndView){
        return "index";
    }

    @RequestMapping("auto")
    public String auto(ModelAndView modelAndView){
        return "auto";
    }
     @RequestMapping("auto/getStatus")
    public ModelAndView getStatus(){

         return new ModelAndView("auto");
     }

}
