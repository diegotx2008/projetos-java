package br.com.dtafinancialub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.dtafinancialub.services.LoginService;



@Controller
public class CoreController {


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
        String urlDest = "login";                     
        /*
            Isolar a validação em uma Service(validação) que usa uma classe model(consulta) que conecta no banco para
            setar os valores ou pegar os valores do objeto repository (campos do usuario)                        
        */ 
        
        LoginService LoginService = new LoginService();
        
        urlDest = LoginService.validaLogin(username, password);
        
        if(urlDest.equals("home")){
            return "redirect:/home";
        }else{
            model.addAttribute("errorMessage","Dados de login inválidos!");
            return "login";
        }
        
    }

    @GetMapping("/home")  
    public String home(Model model){

        return "home";
    }
    
}