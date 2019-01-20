/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackages;


/**
 *
 * @author Astro
 */
class User {
    
    private int D_id,Contact;
    private String Name,Area;
    
    public User(int D_id, String Name, String Area, int Contact){
        
        this.D_id=D_id;
        this.Name=Name;
        this.Area=Area;
        this.Contact=Contact;
    }
    
    public int getD_id()
    {
        return D_id;
      
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getArea()
    {
        return Area;
    }
    
     public int getContact()
    {
        return Contact;
      
    }
    
    
    
}
