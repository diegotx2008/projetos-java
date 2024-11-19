package br.com.dtafinancialub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dtafinancialub.model.UserModel;
import br.com.dtafinancialub.repository.UserRepository;

@Service
public class LoginService {
    
    @Autowired
    private UserRepository userRepository;

    public String validaLogin(String username,String password){
        UserModel user = userRepository.findByUsername(username);
        UserModel pass = userRepository.findByPassword(password);

        if (user != null && pass.getPassword().equals(password)) {
            return "home";
        }else{
            return "login";
        }
        


    }

}
