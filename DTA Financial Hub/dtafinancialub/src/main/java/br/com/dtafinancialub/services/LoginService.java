package br.com.dtafinancialub.services;

import org.springframework.stereotype.Service;


@Service
public class LoginService {


    public String validaLogin(String username,String password) {
                                
        /*
            Isolar a validação em uma Service(validação) que usa uma classe model(consulta) que conecta no banco para
            setar os valores ou pegar os valores do objeto repository (campos do usuario)                        
        */ 
        
        if("diego".equals(username)&&"123456".equals(password)){
            return "home";
        }else{
            return "login";
        }
        
    }
}
