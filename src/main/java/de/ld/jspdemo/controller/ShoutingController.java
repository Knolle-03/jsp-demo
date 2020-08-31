package de.ld.jspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ShoutingController {

    @RequestMapping("/shout")
    public String shout(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName").toUpperCase();

        String res =  "Yo, " + name + "!";

        model.addAttribute("message", res);

        return "processedForm";

    }
    @RequestMapping("/shoutTwo")
    public String shoutTwo(@RequestParam("studentName") String name, Model model) {

        String res =  "Yohoho, " + name.toUpperCase() + "!";

        model.addAttribute("message", res);

        return "processedForm";

    }

}
