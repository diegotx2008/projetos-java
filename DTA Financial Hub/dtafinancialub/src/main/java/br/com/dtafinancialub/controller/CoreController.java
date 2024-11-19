package br.com.dtafinancialub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.dtafinancialub.model.UserModel;
import br.com.dtafinancialub.services.LoginService;

@Controller
public class CoreController {


    @Autowired
    private LoginService loginService;

    @GetMapping("/")   
    public String login(Model model){
        return "/login"; // nome do arquivo HTML dentro de templates (sem a extensão .html)
    }

    @PostMapping("/sendDataLogin")
    public String sendDataLogin(
                                  @RequestParam("username") String username
                                , @RequestParam("password") String password
                                , Model model
                              ) {
        String urlDest = loginService.validaLogin(username, password);
        
        UserModel UserTeste = new UserModel();


        if(urlDest.equals("home")){
            return "redirect:/home";
        }else{
            model.addAttribute("errorMessage","Dados de login inválidos!"+UserTeste.getPassword());
            return "login";
        }
        
    }

    @GetMapping("/home")  
    public String home(Model model){

        return "home";
    }

    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }
    
    
}