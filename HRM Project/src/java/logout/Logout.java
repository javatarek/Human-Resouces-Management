/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logout;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Tarikul
 */
public class Logout implements SessionAware {
SessionMap<String,String> sessionmap; 
    private SessionMap sessionMap;
    
   public String logouta(){
    sessionMap.invalidate();
    System.out.println("session value after invalidate"+sessionMap.get("login"));
    return "success";
}


    @Override
     public void setSession(Map map){
    sessionMap =(SessionMap)map;
    sessionMap.put("login", "true");
    System.out.println("session value after set"+sessionMap.get("login"));
}

public SessionMap getSessionMap() {
    return sessionMap;
}


       public String logoutm(){ 
sessionMap.invalidate();
    System.out.println("session value after invalidate"+sessionMap.get("login"));
    return "success";
}    
       
       
       public String logoute(){ 
sessionMap.invalidate();
    System.out.println("session value after invalidate"+sessionMap.get("login"));
    return "success";
}    
    
}
