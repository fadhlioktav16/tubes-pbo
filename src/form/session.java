package form;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class session {
    private static int u_id;
    private static String u_name, u_uname, u_pass, u_hp;
    
    public static int getU_id(){
        return u_id;
    }
    
    public static void setU_id(int u_id){
        session.u_id = u_id;
    }
    
    public static String getU_name(){
        return u_name;
    }
    
    public static void setU_name(String u_name){
        session.u_name = u_name;
    }
    
    public static String getU_uname(){
        return u_uname;
    }
    
    public static void setU_uname(String u_uname){
        session.u_uname = u_uname;
    }
    
    public static String getU_pass(){
        return u_pass;
    }
    
    public static void setU_pass(String u_pass){
        session.u_pass = u_pass;
    }
    
    public static String getU_hp(){
        return u_hp;
    }
    
    public static void setU_hp(String u_hp){
        session.u_hp = u_hp;
    }

}
