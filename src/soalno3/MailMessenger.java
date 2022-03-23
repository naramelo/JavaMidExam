/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalno3;

/**
 *
 * @author Ahzka
 */
public class MailMessenger implements Messenger {
    boolean isSuccess = false;
    boolean isConnectedToServer = false;
    
    public void connect(){
        isConnectedToServer = true;
        System.out.println("Connected");
    }
    
    public void disconnect(){
        isConnectedToServer = false;
        System.out.println("Disconnected");
    }
    
    @Override
    public boolean sendMessage(String receiver, String subject, String messege){
        if(isConnectedToServer == true){
            System.out.println("Sent");
            return isSuccess = true;
        }else {
            System.out.println("Can't send the messege. Please connect to the server");
            return isSuccess = false;
        }
    }
}
