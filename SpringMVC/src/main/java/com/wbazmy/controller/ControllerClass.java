package com.wbazmy.controller;

import com.wbazmy.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/14 - 18:00
 */
@Controller
@RequestMapping("/user")
public class ControllerClass {
    @RequestMapping("/quick")
    public String run() {
        System.out.println("Controller running");
        return "quick";
    }

    @RequestMapping("/get")
    public ModelAndView get(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav = new ModelAndView();
        mav.addObject("username", "wbazmy");
        mav.setViewName("get");
//        response.sendRedirect("quick");
        return mav;
    }

    @RequestMapping("/getName")
    public void getName(HttpServletResponse response) throws IOException {
        response.getWriter().print("wbazmy");
    }

    @RequestMapping("/getId")
    @ResponseBody
    public String getId() {
        return "hello wbazmy";
    }

    @RequestMapping("/getStudent")
    @ResponseBody
    public Student getStudent() {
        Student s = new Student();
        s.setClassId(1);
        s.setId(213);
        s.setName("zy");
        return s;
    }

    @RequestMapping("/sendParameter")
    @ResponseBody
    public void sendStudent(@RequestParam("sname") String name, int id) {   //获取请求参数
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setClassId(1);
        System.out.println(s.toString());
    }

    @RequestMapping("/sendPojo")
    @ResponseBody
    public void sendStudent(Student s) {    //自动封装
        System.out.println(s.toString());
    }

    @RequestMapping("/sendPojo1")
    @ResponseBody
    public void sendStudent1(@RequestBody List<Student> list) {    //自动封装
        System.out.println(list.toString());
    }

    @RequestMapping("/sendFile")
    @ResponseBody
    public void receiveFile(String name, MultipartFile uploadFile) throws IOException {  //上传单个文件
        System.out.println(name);
        String originalFilename = uploadFile.getOriginalFilename(); //获取文件原始名称
        uploadFile.transferTo(new File("C\\upload\\" + originalFilename));      //转换为文件
    }


}
