package ch.wasuremono.web.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("index")
public class homeController {

    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() { return "login"; }
}
