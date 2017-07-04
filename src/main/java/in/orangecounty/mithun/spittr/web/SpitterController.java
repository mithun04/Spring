package in.orangecounty.mithun.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by mithun on 7/4/17.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {
    @RequestMapping(value="/register", method=GET)
    public String showRegistrationForm() {
        return "registerForm";
    }
}