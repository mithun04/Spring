package in.orangecounty.mithun.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by mithun on 7/3/17.
 */
@Controller
public class HomeController {

    @RequestMapping (value="/", method=GET)
    public String home() {
        return "home";
    }
}
