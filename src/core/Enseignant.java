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
 * @author Don Varnel
 */
public class Enseignant extends Contact{
    Contact co;
    public static final String A = "vacataire";
    public static final String B = "permanent";
    String statut = A ;

    public Enseignant() {
        this.co = co;
        this.statut = " ";
    }

    public Enseignant(Contact co, String statut) {
        this.co = co;
        this.statut = statut;
    }

    public Contact getCo() {
        return co;
    }

    public void setCo(Contact co) {
        this.co = co;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    

    public  void insererContact(Connection con){
        Statement st ;
        String result;
        try {
            con = connectBD();
            st =  con.createStatement(); 
            result = "INSERT INTO Enseignant VALUES (" +this.code+ "," +this.nom+ "," +this.dateNaiss+ "," +this.address+ "," +this.email+ "," +this.tel+ "," +this.statut+")"; 
            st.executeUpdate(result);
            String msg = JOptionPane.showInputDialog("Donnes inserees dans la table Enseignant...");
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
