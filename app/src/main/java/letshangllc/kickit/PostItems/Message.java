package letshangllc.kickit.PostItems;

/**
 * Created by cvburnha on 1/25/2016.
 */
public class Message {
    private String message;

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    private String timeCreated;

    public Message(String message, String timeCreated) {

        this.message = message;
        this.timeCreated = timeCreated;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
