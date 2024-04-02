/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;
import java.sql.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static tp_poo.MainFrmApplication.connectBD;

/**
 *
 * @author Don Varnel
 */
public class Etudiant extends Contact {
    private ArrayList<String>  cycle = new ArrayList(Arrays.asList("Licence", "Ingénieur"));
    Contact co;
    int level;
    String c;

    public Etudiant() {
        this.co = co;
        this.level = 1;
        this.c = " ";
    }

    public Etudiant(Contact co, int level, String c) {
        this.co = co;
        this.level = level;
        this.c = c;
    }
    
    

    public String getC() {
        if (cycle.contains(c)){
            this.c = c;
        }
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    
    

    public ArrayList<String> getCycle() {
        return cycle;
    }
    
    

    public void setCycle(ArrayList<String> cycle) {
        this.cycle = cycle;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
            result = "INSERT INTO Etudiant VALUES (" +this.code+ "," +this.nom+ "," +this.dateNaiss+ "," +this.address+ "," +this.email+ "," +this.tel+ "," +this.cycle+ "," +this.level +")"; 
            st.executeUpdate(result);
            String msg = JOptionPane.showInputDialog("Donnes inserees dans la table Etudiant...");
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
