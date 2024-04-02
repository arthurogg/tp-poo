/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;
import static tp_poo.MainFrmApplication.connectBD;
/**
 *
 * @author arthuro gg
 */
public class Agent extends Contact {
    Contact co;
    int sal;
    int indSal;
    int cat;
    String occ;
    String h;

    public Agent(Contact co, int sal, int indSal, int cat, String h, String occ) {
        this.co = co;
        this.sal = sal;
        this.indSal = indSal;
        this.cat = cat;
         this.h = h;
        this.occ = occ;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getIndSal() {
        return indSal;
    }

    public void setIndSal(int indSal) {
        this.indSal = indSal;
    }

    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public Contact getCo() {
        return co;
    }

    public void setCo(Contact co) {
        this.co = co;
    }
    
    public  void insererContact(Connection con){
        Statement st ;
        String result;
        try {
            con = connectBD();
            st =  con.createStatement(); 
            result = "INSERT INTO Enseignant VALUES (" +this.code+ "," +this.nom+ "," +this.dateNaiss+ "," +this.address+ "," +this.email+ "," +this.tel+ "," +this.sal + "," +this.indSal+ "," +this.cat + "," +this.h + "," +this.occ +")"; 
            st.executeUpdate(result);
            String msg = JOptionPane.showInputDialog("Donnes inserees dans la table Agent...");
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
