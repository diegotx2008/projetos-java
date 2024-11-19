package br.com.dtafinancialub.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="dta_tb_tsiusuario")
public class UserModel {
    
    @Id
    @Column (name = "cod_user")
    private Long    codUser;
    @Column (name = "user_name")
    private String  username;
    @Column (name = "email_user")
    private String  emailUser;
    @Column (name = "cell_phone")
    private String  cellPhone;
    @Column (name = "password")
    private String  password;


    public Long getCodUser() {
        return codUser;
    }
    public void setCodUser(Long codUser) {
        this.codUser = codUser;
    }    

    public String getUsername() {
        return username;
    }
    public void setUsername(String UserName) {
        this.username = UserName;
    }

    public String getEmailUser() {
        return emailUser;
    }
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getCellPhone() {
        return cellPhone;
    }    
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
