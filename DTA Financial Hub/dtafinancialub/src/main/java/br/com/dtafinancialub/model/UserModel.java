package br.com.dtafinancialub.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="dta_tb_tsiusuario")
public class UserModel {
    
    @Column (name = "cod_user")
    private Long    codUser;
    @Column (name = "name_user")
    private String  nameUser;
    @Column (name = "email_user")
    private String  emailUser;
    @Column (name = "cell_phone")
    private String  cellPhone;
    public Long getCodUser() {
        return codUser;
    }
    public void setCodUser(Long codUser) {
        this.codUser = codUser;
    }
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
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



}
