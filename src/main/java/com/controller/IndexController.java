package com.controller;

import com.pojo.IfPswd;
import com.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    List<Users> l= new ArrayList<>();
//    @RequestMapping("/login")//mapping映射
//    public String login(String username, String password, Model model) {
//        if (username.equals("27")&&password.equals("27")){
//            model.addAttribute("msg","welcome"+username);
//            return "win";
//        }
//        else{
//            model.addAttribute("msg","NO NO NO");
//            return "failed";
//        }
//    }
@RequestMapping(value = "/login",method = RequestMethod.POST)//mapping映射get,post都认
public String login(Users users, Model model) {
    if (users.getUsername().equals("倒戈") && users.getPassword().equals("27")){

        Users u1 = new Users(2 , "赵", "1");
        Users u2 = new Users(3 , "钱", "2");
        Users u3 = new Users(4 , "孙", "1");
        l.add(users);
        l.add(u1);
        l.add(u2);
        l.add(u3);
        model.addAttribute("list",l);

        model.addAttribute("msg","你好"+users.getUsername());

        //中文参数不识别，需要web.xml里过滤
        return "win";
    }
    else{
        model.addAttribute("msg","NO NO NO");
        return "failed";
    }
}
//
@RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(int id,Model model){
    for(Users u:l){
        if(u.getId()==id){
            l.remove(id);
            break;
        }
    }
    model.addAttribute("list",l);

    return "win";
}
//

@RequestMapping(value = "/register",method = RequestMethod.POST)
public String register(Users users, IfPswd ifPswd, Model model){

    Users u1 = new Users(2 , "赵", "1");
    Users u2 = new Users(3 , "钱", "2");
    Users u3 = new Users(4 , "孙", "1");
    l.add(users);
    l.add(u1);
    l.add(u2);
    l.add(u3);
    model.addAttribute("list",l);
    return "win";
}
}
