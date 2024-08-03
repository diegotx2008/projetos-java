package br.com.dtafinancialub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.dtafinancialub.services.LoginService;


@Controller
public class CoreController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/")   
    public String home(Model model){
        return "login"; // nome do arquivo HTML dentro de templates (sem a extensão .html)
    }

    @PostMapping("/Validalogin")
    public String Validalogin(@RequestParam String username, @RequestParam String password, Model model){
        
        ModelAndView modelAndView = new ModelAndView();
        Boolean isValidUser = loginService.validateUser(username,password);

        if(isValidUser){
            model.addAttribute("username",username);
            return "home";
        }
        else{

            modelAndView.setViewName("error");
            modelAndView.addObject("username", username);
            model.addAttribute("error", "Credenciais inválidas");
            return "error";
        }
        
    }

}