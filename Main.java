import model.Document;
import model.User;
import service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();

        // Adicionando Usuários
        User user1 = new User("U1", "Alice");
        User user2 = new User("U2", "Bob");
        libraryService.addUser(user1);
        libraryService.addUser(user2);

        // Adicionando Documentos
        Document doc1 = new Document("D1", "Java Programming");
        Document doc2 = new Document("D2", "Data Structures");
        libraryService.addDocument(doc1);
        libraryService.addDocument(doc2);

        // Empréstimo de Documento
        libraryService.loanDocument(user1, doc1);

        // Tentativa de Empréstimo de Documento não disponível
        libraryService.loanDocument(user2, doc1);

        // Devolução de Documento
        libraryService.returnDocument(doc1);

        // Visualização de todos os Empréstimos
        libraryService.viewAllLoans();
    }
}
