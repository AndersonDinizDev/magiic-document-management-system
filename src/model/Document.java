// src/model/Document.java
package model;

public class Document {
    private String id;
    private String title;
    private boolean isAvailable;

    public Document(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Document{" + "id='" + id + '\'' + ", title='" + title + '\'' + ", isAvailable=" + isAvailable + '}';
    }
}
