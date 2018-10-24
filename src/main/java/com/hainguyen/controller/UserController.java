package com.hainguyen.controller;

import com.hainguyen.com.codegym.dao.UserDao;
import com.hainguyen.model.Login;
import com.hainguyen.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class UserController {
    @GetMapping("/login")
    public ModelAndView home() {
        System.out.println("Hello");
        ModelAndView modelAndView = new ModelAndView("home", "login1", new Login());
        return modelAndView;
    }

    @PostMapping("/home")
    public ModelAndView login(@ModelAttribute("login1") Login login) {
        System.out.println("Login success");
        User user = UserDao.checkLogin(login);
        ModelAndView modelAndView;
        if (user == null) {
            modelAndView = new ModelAndView("error");
        } else {
            modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }
}
