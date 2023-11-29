package com.aiden.Controller;

import com.aiden.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll(){
        System.out.println("---------getAll-----------");
        List<User> list=new ArrayList<>();
        list.add(new User("Aiden","Aiden",20,new Date()));
        list.add(new User("Nico","Nico",20,new Date()));
        list.add(new User("Sakuta","Sakuta",18,new Date()));
        list.add(new User("Mai","Mai",19,new Date()));

        return list;
    }
    @RequestMapping("/checkName")
    @ResponseBody
    public boolean checkName(String name) {
        System.out.println("---------checkName-----------");
        System.out.println("name:" + name);
        //Call Service, Access data, implement function.
        if ("Aiden".equals(name)) {
            return true;
        }else {
            return false;
        }
    }

    @RequestMapping("/login6")
    public String login6(User user,HttpServletRequest request){
        System.out.println("---------login6-----------");
        System.out.println("user:"+user);

        User user2=new User("Mai","Mai",19,new Date());
        List<User> list=new ArrayList<>();
        list.add(new User("Aiden","Aiden",20,new Date()));
        list.add(new User("Nico","Nico",20,new Date()));
        list.add(new User("Sakuta","Sakuta",18,new Date()));
        list.add(new User("Mai","Mai",19,new Date()));
        list.add(new User("Tomoe","Tomoe",17,new Date()));
        list.add(new User("Rio","Rio",16,new Date()));

        request.setAttribute("user",user);
        request.setAttribute("list",list);

        return "redirect:/pages/success.jsp";

        //重定向请求
//        return "redirect:/user/login5";
    }
    private static final Logger logger = LogManager.getLogger(UserController.class);
    private final HttpSession session;

    public UserController(HttpSession session) {
        this.session = session;
    }
//    @RequestMapping("/User")

    @RequestMapping("/login4")
    public String login4(Model Mai, HttpServletRequest request){
        logger.info("Entering login4 method"); // 记录信息日志
        System.out.println("---------login4-----------");
        //调用service层，操作数据，获取查询结果
        User user=new User("Mai","Mai",19,new Date());
        List<User> list=new ArrayList<>();
        list.add(new User("Aiden","Aiden",20,new Date()));
        list.add(new User("Nico","Nico",20,new Date()));
        list.add(new User("Sakuta","Sakuta",18,new Date()));
        list.add(new User("Mai","Mai",19,new Date()));
        list.add(new User("Tomoe","Tomoe",17,new Date()));
        list.add(new User("Rio","Rio",16,new Date()));

        //将数据保存到Model中
//        Mai.addAttribute("user",user);
//        Mai.addAttribute("list",list);

        //将数据保存到request域中
        request.setAttribute("user",user);
        request.setAttribute("list",list);

        //将数据保存到session域中
//        session.setAttribute("user",user);
//        session.setAttribute("list",list);

        //获取ServletContext对象
//        ServletContext context = request.getSession().getServletContext();
//        ServletContext context = session.getServletContext();
//        context.setAttribute("user",user);
//        context.setAttribute("list",list);

        //默认转发
//        return "success";
        //扩展转发
//        return "forward:/pages/success.jsp";
        //扩展转发请求
        return "forward:/user/login5";
    }

    @RequestMapping("/login5")
    public String login5(HttpServletRequest request){
        System.out.println("---------login5-----------");

        List<User> list=(List<User>) request.getAttribute("list");
        for (User user:list){
            System.out.println(user);
        }

        return "success";
    }

    @RequestMapping("/login")
    public String login(String name, String password, Integer age) {
        System.out.print("----login----");
        System.out.println("name:"+name);
        System.out.println("password:"+password);
        System.out.println("age:"+age);

        //Call Service, Access data, implement function.

        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "Aiden");
        //Let the view know the path of the page.
        mv.setViewName("success");
        return "redirect:/pages/success.jsp";
    }

    //处理对象入参
    @RequestMapping("/login2")
    public String login2(User user){//返回逻辑视图
        System.out.println("---------login----------");
        System.out.println("user:"+user);
        return "success";
    }
    @RequestMapping("/login3")
    public String login3(Integer[] ids){
        System.out.println("-------------login------------------");
        for (Integer id:ids){
            System.out.println("id:"+id);
        }
        return "success";
    }
}
