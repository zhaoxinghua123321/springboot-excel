package com.zhao.springbootexcel.service;

import com.zhao.springbootexcel.entity.ExcelData;
import com.zhao.springbootexcel.utils.ExportExcelUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class PoiService {
    public void export(HttpServletResponse response){
        ExcelData data = new ExcelData();

        List<String> titles = new ArrayList();
        titles.add("a1");
        titles.add("a2");
        titles.add("a3");
        data.setTitles(titles);

        List<Object> row = new ArrayList();
        row.add("11111111111");
        row.add("22222222222");
        row.add("3333333333");
        List<List<Object>> rows = new ArrayList();
        rows.add(row);
        data.setRows(rows);
        data.setName("rondom");
        try {
            ExportExcelUtils.exportExcel(response, "hello.xlsx", data );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
