/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendencesystem;

/**
 *
 * @author BRACU\16121132
 */
import java.util.*;
import model.RegistrationLogIn;


public class AttendenceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        List<RegistrationLogIn> listModel= new ArrayList<RegistrationLogIn>();
        
        for(int i =1 ; i<2 ; i++ ){
        System.out.println("enter id");
        String id = key.nextLine();
        System.out.println("enter password");
        String password = key.nextLine();
        System.out.println("enter name");
        String name = key.nextLine();
        System.out.println("enter contact");
        String contact = key.nextLine();
        
        RegistrationLogIn reg = new RegistrationLogIn(id , password , name , contact);
        
        //System.out.println("US Id "+ reg.getUserId());
        //System.out.println("Password "+ reg.getPassword());
        //System.out.println("name "+ reg.getName());
        //System.out.println("contact "+ reg.getContact());
              
        listModel.add(reg);
       // reg = new RegistrationLogIn();
       // reg.setName("AMi");
       // listModel.add(reg);
        }
        
        
        for(RegistrationLogIn r : listModel){
            System.out.println("printing from the list");
            System.out.println("Id :"+ r.getUserId()+" Name "+ r.getName() + " Contact "+ r.getContact() );
            
        }
        
    }

}
