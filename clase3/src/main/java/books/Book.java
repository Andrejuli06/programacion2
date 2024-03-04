
package books;

public class Book {
  String title;
  String gender;
  int id;
  int quanty;
  String loanDate;
  String returnDante; 
  boolean available;

    public Book(String title, String gender, int id, int quanty) {
        this.title = title;
        this.gender = gender;
        this.id = id;
        this.quanty = quanty;
       this.available=true;
    }
  
  public void LendBook(){
      this.available=false;
  }
  void returnbook(){
      this.available=true;
  }

    public boolean isAvailable() {
        return available;
    }

}
