package br.com.dtafinancialub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dtafinancialub.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long>{
    
    // UserRepository FindByUsername(String username);

    public UserModel findByUsername(String username);
    public UserModel findByPassword(String password);

}
