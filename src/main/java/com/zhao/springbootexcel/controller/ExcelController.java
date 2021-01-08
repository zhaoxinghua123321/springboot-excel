package com.zhao.springbootexcel.controller;

import com.zhao.springbootexcel.service.PoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class ExcelController {
    @Autowired
    private PoiService poiService;

    @RequestMapping("export")
    @ResponseBody
    public String export(HttpServletResponse response){
        poiService.export(response);
        return "导出excel成功";
    }
}
