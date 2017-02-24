/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.app;

/**
 *
 * @author Joakim
 */
public class User {
    private String password;
    private String username;
    
    public void User (String u, String p){
        password=p;
        username=u;
    }
    
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }
    public void setPw(String p){
        password=p;
    }
    public void setUsername(String u){
        username=u;
    }
}
