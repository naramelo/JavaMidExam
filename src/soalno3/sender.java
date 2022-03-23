package soalno3;

/**
 *
 * @author Ahzka
 */
public class sender {

    public static void main(String[] args) {
        stdMessenger chat = new stdMessenger();
        MailMessenger email = new MailMessenger();
        
       
        System.out.println("=Test Messenger=");
        System.out.println("Sending a Messege");
        chat.sendMessage("Nara", "Nara imut", "Nara lagi apa?:");
        System.out.println("=Finish Test= \n");
        

        System.out.println("=Test Mail=");
        System.out.println("Sending a Messege"); 
        email.sendMessage("Nara", "Nara cans", "Nara udah tidur?");     
        email.disconnect();
        
        System.out.println("Connecting");
        email.connect();
        
        System.out.println("Resend a Messege");
        email.sendMessage("Nara", "Nara cans", "Nara udah tidur?");
        System.out.println("=Finish Test=");
    }
    
}
