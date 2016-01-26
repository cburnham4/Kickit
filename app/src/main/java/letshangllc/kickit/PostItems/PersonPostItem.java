package letshangllc.kickit.PostItems;

import letshangllc.kickit.Person;

/**
 * Created by cvburnha on 1/25/2016.
 */
public class PersonPostItem {
    private int id;
    private Person person;
    private Category category;
    private Message message;
    private String elapsedTime;

    public PersonPostItem(int id, Person person, Category category, Message message, String elapsedTime) {
        this.id = id;
        this.person = person;
        this.category = category;
        this.message = message;
        this.elapsedTime = elapsedTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
