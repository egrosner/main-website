package com.erichgrosner;

import com.erichgrosner.model.BlogPost;
import org.joda.time.DateTime;
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

        model.addAttribute("items", posts);

        return "index";
    }

}
