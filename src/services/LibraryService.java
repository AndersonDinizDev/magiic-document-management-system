package service;

import model.Document;
import model.Loan;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<User> users = new ArrayList<>();
    private List<Document> documents = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void addDocument(Document document) {
        documents.add(document);
        System.out.println("Document added: " + document);
    }

    public void loanDocument(User user, Document document) {
        if (document.isAvailable()) {
            document.setAvailable(false);
            Loan loan = new Loan(user, document);
            loans.add(loan);
            System.out.println("Document loaned: " + loan);
        } else {
            System.out.println("Document is not available for loan.");
        }
    }

    public void returnDocument(Document document) {
        document.setAvailable(true);
        loans.removeIf(loan -> loan.getDocument().equals(document));
        System.out.println("Document returned: " + document);
    }

    public void viewAllLoans() {
        System.out.println("Current Loans:");
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}
