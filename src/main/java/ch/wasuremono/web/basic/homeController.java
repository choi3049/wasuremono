package ch.wasuremono.web.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class homeController {

    @GetMapping
    public String home() {
        return "page/index";
    }

    @GetMapping("/index/login")
    public String login() { return "page/login"; }
}
