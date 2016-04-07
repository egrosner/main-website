package com.erichgrosner;

import com.erichgrosner.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/")
    public String index(Model model) {

        List<BlogPost> posts = new ArrayList<BlogPost>();
        val curPost = new BlogPost();
        curPost.setBody("hey my first blog post!");
        curPost.setTitle("My first Post!");
        curPost.setTitleCaption("many more to come");
        curPost.setCategory("General");
        curPost.setUserName("Erich Grosner");
        curPost.setPostDate(Date.from(Instant.now()));
        posts.add(curPost);

        model.addAttribute("items", posts);

        return "index";
    }

}
