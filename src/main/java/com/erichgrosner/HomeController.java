package com.erichgrosner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by egros on 4/4/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {

        ArrayList<String> posts = new ArrayList<String>();
        posts.add("test1");
        posts.add("test2");
        posts.add("test3");

        model.addAttribute("items", posts);

        return "index";
    }

}
