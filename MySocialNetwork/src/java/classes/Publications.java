
package classes;

public class Publications {
    protected User persone;
    protected String message;

    public Publications(User persone, String message) {
        this.persone = persone;
        this.message = message;
    }

    public User getPersone() {
        return persone;
    }

    public String getMessage() {
        return message;
    }

    public void setPersone(User persone) {
        this.persone = persone;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Publications{" + "persone=" + persone + ", message=" + message + '}';
    }
    
    
    
}
