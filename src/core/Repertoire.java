/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;
import java.util.*;
/**
 *
 * @author Don Varnel
 */
public class Repertoire {
    private ArrayList<Contact> repertoire = new ArrayList();

    public void ajouterContact(Contact contact){
        repertoire.add(contact);
    }
    
    public void suppContact(Contact contact){
        repertoire.remove(contact);
    }
    
    public void modifierContact(Contact contact){
        ListIterator li = repertoire.listIterator();
        while (li.hasNext()){
            if (li.next().equals(contact)){
                li.set(contact);
            }
        }
    }
    
    public int rechContact(Contact contact){
        int i = 0;
        if (repertoire.contains(contact)){
            ListIterator li = repertoire.listIterator();
            while(li.hasNext()){
                if (li.next().equals(contact)){
                    break;
                }
                i++;
            }
        }
        return i;
    }
    
    public void afficher(){
        for (int i =0; i<repertoire.size(); i++){
            repertoire.get(i).afficherContact();
        }
    }
}
