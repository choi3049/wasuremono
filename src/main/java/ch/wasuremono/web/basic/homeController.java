package ch.wasuremono.web.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class homeController {

    @RequestMapping("/index")
    public String home() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/sessionClear")
    public String sessionClear(HttpSession ss) {
        ss.invalidate();
        return "OK";
    }
}
