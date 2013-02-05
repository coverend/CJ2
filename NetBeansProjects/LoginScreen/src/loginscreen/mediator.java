/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;
 
/**
 *
 * @author ChrisO
 */
class Mediator {
    Diction dict;
    
   public Mediator(){}
        
        
    public String getPassword(String value){
            Student s = dict.get(value);
            return s.getPassword();
        }
    
    public Boolean verifyLogin(String un, String pw){
        return (pw.equals(getPassword(un)));
    }
    
}
