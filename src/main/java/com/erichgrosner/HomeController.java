package com.erichgrosner;

import com.erichgrosner.model.BlogPost;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by egros on 4/4/2016.
 */
@Controller
public class HomeController {

    List<BlogPost> posts = new ArrayList<>();

    public HomeController() {
        BlogPost curPost = BlogPost.builder()
                .body("hey my first blog post!")
                .title("My first Post!")
                .titleCaption("many more to come")
                .category("General")
                .userName("Erich Grosner")
                .postDate(DateTime.now())
                .postPhoto("mountainme.jpg")
                .build();
        posts.add(curPost);
    }

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("items", posts);

        return "index";
    }

    @RequestMapping("/blog")
    public String blog(Model model) {
        return index(model);
    }

    @RequestMapping("/login")
    public String login(Model model) { return "login"; }

    @RequestMapping("/admin")
    public String admin(Model model) {

        model.addAttribute("newBlogPost", BlogPost.builder().build());

        return "admin";
    }

    @RequestMapping(value = "/savePost", method = RequestMethod.POST)
    public String savePost(@ModelAttribute BlogPost newBlogPost, Model model) {
        posts.add(0, newBlogPost);

        return "redirect:";
    }
}
