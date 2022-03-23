package soalno3;

/**
 *
 * @author Ahzka
 */
public class stdMessenger implements Messenger {
    boolean isSuccess = true;
    
    @Override
    public boolean sendMessage(String receiver, String subject, String messege){
        System.out.println("Sent");
        return isSuccess = true;
    }
}
