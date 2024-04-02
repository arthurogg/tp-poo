/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.sql.*;
import java.util.Date;


/**
 *
 * @author Don Varnel
 */
public abstract class Contact {
    String code; 
    String nom; 
    Date dateNaiss; 
    String address; 
    String email; 
    String tel; 

    public Contact() {
    }

    public Contact(String code, String nom, Date dateNaiss, String address, String email, String tel) {
        this.code = code;
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.address = address;
        this.email = email;
        this.tel = tel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public abstract void insererContact(Connection con);
    
    public void afficherContact(){
        //return (c.getCode() + "\t" +c.getNom() + "\t"+ c.getDateNaiss() + "\t" + c.getAddress() + "\t"+ c.getEmail() + "\t" + c.getTel());
        System.out.println(this.code + "\t" + this.nom + "\t" + this.dateNaiss + "\t" + this.address + "\t" + this.email + "\t" + this.tel);
    }
}
