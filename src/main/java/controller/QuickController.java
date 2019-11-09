package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhaihs
 * @date 2019/11/8
 */
@Controller
@RequestMapping("/start")
public class QuickController {
    @RequestMapping("/hello")
    public String hello() {
        return "index.jsp";
    }
}
