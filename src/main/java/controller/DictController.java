package controller;

import model.SysDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.DictService;

import java.util.List;

/**
 * @Author: admin
 * @Description: 字典控制器类
 * @BelongsProject: mybatis-learn
 * @BelongsPackage: controller
 * @CreateTime: 2020-11-25 00:15:11
 */
@Controller
@RequestMapping("/dicts")
public class DictController {

    @Autowired
    private DictService service;

    @GetMapping("/page")
    public ModelAndView dicts(SysDict sysDict, Integer offset, Integer limit) {
        ModelAndView mv = new ModelAndView("dicts");
        List<SysDict> list = service.findBySysDict(sysDict, offset, limit);
        mv.addObject("dicts", list);
        return mv;
    }
}
