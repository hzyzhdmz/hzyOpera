package controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hzy-pc on 2016/6/28.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/find", method = RequestMethod.GET)

    public String index() {
        return "index";
    }
}
