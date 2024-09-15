package model;

public class Loan {
    private User user;
    private Document document;

    public Loan(User user, Document document) {
        this.user = user;
        this.document = document;
    }

    public User getUser() {
        return user;
    }

    public Document getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return "Loan{" + "user=" + user + ", document=" + document + '}';
    }
}
