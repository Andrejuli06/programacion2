package books;

public class Book {

    String title;
    String gender;
    String author;
    int id;
    int quanty;
    String loanDate;
    String returnDante;
    String user;
    boolean available;
    boolean lend;

    public Book(String title, String gender, String author, int id, int quanty, String loanDate, String returnDante, String user, boolean available, boolean lend) {
        this.title = title;
        this.gender = gender;
        this.author = author;
        this.id = id;
        this.quanty = quanty;
        this.loanDate = loanDate;
        this.returnDante = returnDante;
        this.user = user;
        this.available = available;
        this.lend = lend;
    }
    

    public Book(String title, boolean lend) {
        this.title = title;
        this.lend = lend;
    }

    public String getTitle() {
        return title;
    }

    public boolean isLend() {
        return lend;
    }

   

    public void LendBook() {
        this.available = false;
    }

    public void returnbook() {
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

}
