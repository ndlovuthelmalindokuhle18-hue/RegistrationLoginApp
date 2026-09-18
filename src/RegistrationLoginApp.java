/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import java.util.Scanner;
    

/**
 *
 * @author Student
 */
public class RegistrationLoginApp {

    /**
     * @param args the command line arguments
     */
          
        // TODO code application logic here
          
        public boolean checkUserName(String username){
            if (username.contains("_")&& username.length() <=5){
            return true; 
        } else {
            return false;
                }
        }
        public boolean checkPasswordComplexity(String password){
            boolean length = password.length() >=8;
            boolean hasUpper = password.matches(".*[A-Z].*");
            boolean hasDigit = password.matches(".*[0-9].*");
            boolean hasSpecial = password.chars().anyMatch(c->!Character.isLetterOrDigit(c));
        return length && hasUpper && hasDigit && hasSpecial;
}
          public boolean checkCellPhoneNumber(String phonenumber){
            String regex = "^\\+27[0-9]{9}$";
            return phonenumber.matches(regex);
          }
          public String registerUser(String firstName,String lastName,String username,String password,String cellphonenumber){
              if (!checkUserName(username)){
                  return "incorrect username, must contain an underscore and not more than 5 characters";
              }
              if (!checkPasswordComplexity(password)){
                  return"password is incorrect or does not have internastional code";
              }         
              if (!checkCellPhoneNumber(cellphonenumber)){
                  return "incorrect cellphonenumber";
              }
              return "You are now registerd";
          }
          public boolean loginUser(String enteredUsername,String storedUsername,String enteredPassword, String storedPassword){  
              return enteredUsername.equals(storedUsername)&& enteredPassword.equals(storedPassword);
          }    
         
          public String returnLoginStatus(boolean LoginSuccessful,String lastName, String firstName){
            if (LoginSuccessful){
                return"Welcome"+ firstName + "" + lastName;
            } else{
                return "Usename or Password is incorrect, please try again";
            }
          
}
            public static void main(String[] args) {
             
                  Scanner hey = new Scanner(System.in);
                  RegistrationLoginApp system = new RegistrationLoginApp();
                  
                  System.out.println("Creating an account");
                  System.out.print("Enter your First Name");
                  String firstName = hey.nextLine();
                  
                  System.out.print("Enter your Last Name");
                  String lastName = hey.nextLine();

                  System.out.print("Enter your Username(maximum 5 chars and have underscore)");
                  String username = hey.nextLine();
                  
                  System.out.print("Enter your Password(minimum 8 chars,1 caps,1 number and 1 special)");
                  String password = hey.nextLine();
                  
                  System.out.print("Enter your Cell Phone Number(SA International code[0-9])");
                  String cellPhoneNumber = hey.nextLine();
                  
                  String registrationResults = system.registerUser(firstName, lastName, username, password, cellPhoneNumber);
                  System.out.println("System Response"+ registrationResults);
                  
                  if (registrationResults.contains("successfully captured")){
                  
                  System.out.println("SYSTEM LOGIN");
                  System.out.print("Enter Username");
                  String loginUsername = hey.nextLine();
                  
                  System.out.print("Enter Password");
                  String loginPassword = hey.nextLine();
                  
                  boolean isSuccess = system.loginUser(loginUsername,username, loginPassword, password);
                  System.out.println(system.returnLoginStatus(isSuccess,firstName,lastName));
                  } else {
                     System.out.println("Incorrect, try again");         
}       
             }
                  



                  
                              
                             


                  
   
                  
                      
                      
                      



                  


                  
            
         

    

        
        
    
         
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
           
            
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        }
    }
    
}
