/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

/**
 *
 * @author ChrisO
 */
class Student
{
    private String name, password;

    public Student(String name, String pw)
    {
        this.name = name;
        this.password = pw;
    }

    public String getName()
    {
        return name;
    }
    
    public String getPassword(){
        return password;
    }
    //-----------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "Name: " + name + "\n";

        result += String.format("Password: %.1f%n", password);

        return result;
    }

    public boolean equals(Object s)
    {
       return (this.name.equals(((Student) s).getName())) && (this.password == (((Student) s).getPassword()));
        
    }

    
   // public int compareTo (Object s){
    //if (this.gpa < (((Student) s).getGPA())){
     //   return -1;}
      //  else if(this.gpa == (((Student) s).getGPA())){
       //     return 0;}
        //    else return 1;}
   // public abstract int compareTo (Object s){}
}
