package edu.njtech.hungry.controller;

import javax.servlet.http.HttpSession;

import edu.njtech.hungry.model.Horseman;
import edu.njtech.hungry.model.Order;
import edu.njtech.hungry.model.Recipients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.njtech.hungry.service.HorsemanService;

import java.util.*;

@Controller
@RequestMapping("/horseman")

//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
@SessionAttributes("horseman")
public class HorsemanController {

    @Autowired
    private HorsemanService horsemanServivce;

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "HorsemanLogin";
    }

    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(Horseman horseman,Model model){
        //调用service方法
        horseman = horsemanServivce.checkLogin(horseman.getHmname(), horseman.getHmpassword());
        //若有user则添加到model里并且跳转到成功页面
        if(horseman != null){
            model.addAttribute("horseman",horseman);
            return "HorsemanLoginSuccess";
        }
        return "HorsemanLoginFail";
    }

    //测试超链接跳转到另一个页面是否可以取到session值
    @RequestMapping("/anotherpage")
    public String hrefpage(){

        return "anotherpage";
    }
    @RequestMapping("/startorder")
    public String startorder(){

        return "HorsemanStartOrder";
    }
    @RequestMapping("/sendorder")
    public String sendorder(){

        return "HorsemanSendOrder";
    }

    //注销方法
    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        //通过session.invalidate()方法来注销当前的session
        session.invalidate();
        return "HorsemanLogin";
    }

    @RequestMapping("/regist")
    public String regist(){
        return "HorsemanRegist";
    }

    /**
     * 跳转到添加用户界面
     * @return
     */
    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "addMenu";
    }



    @RequestMapping("/doRegist")
    public String doRegist(Horseman hm, Model model){
        System.out.println(hm.getHmname());
        horsemanServivce.Regist(hm);
        return "HorsemanLoginSuccess";
    }

    @RequestMapping("/test")
    public String f1(){
        return "HorsemanLoginFail";
    }

    @RequestMapping("/checkOrder")
    public String checkOrder(HttpSession session){
        List<Map> list = horsemanServivce.findRecipientsByCid();
        System.out.println(list+"for外");
        for (Map<String,Object> map:list){
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                String key = iterator.next();
                System.out.println(map.get(key));
            }
        }
        session.setAttribute("list",list);
        return "CheckOrder";
    }

}