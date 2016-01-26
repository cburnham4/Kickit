package letshangllc.kickit.PostItems;

/**
 * Created by cvburnha on 1/25/2016.
 */
public class Message {
    private String message;
    private String timeCreated;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
