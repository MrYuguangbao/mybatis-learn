package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author admin
 * @date 2020/6/2 7:24
 */
@Controller
public class MybatisController {

    @RequestMapping(value = {"", "/index"})
    public ModelAndView handleReq() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("now", new Date());
        return mv;
    }

}
