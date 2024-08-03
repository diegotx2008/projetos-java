package br.com.dtafinancialub.services;

import org.springframework.stereotype.Service;


@Service
public class LoginService {

    public boolean validateUser(String username,String password){
        
        //Criar uma validação para os dados de login e senha aqui
        return "usuario".equals(username) && "password".equals(password);
    }
    
}
