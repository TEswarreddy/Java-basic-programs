public class BookAndAuthor {
     public static void main(String[] args) {
        Author author1 = new Author("Joshua Bloch", "joshua@email.com", 'M');
        Book book1 = new Book("Effcetive Java", author1, 45, 15);
        book1.displayAuthorDetails();
    }
}

class Author {
    private String name;
    private String emailId;
    private char gender;

    public Author(String name, String emailId, char gender){
        this.name = name;
        this.emailId = emailId;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }
    public String getEmailId() {
        return this.emailId;
    }
    public char getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
}


class Book {
    //Implement your code here
    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayAuthorDetails(){
        System.out.println("Displaying author details");
        System.out.println("Author name: " + this.author.getName());
        System.out.println("Author email: " + this.author.getEmailId());
        System.out.println("Author gender: " + this.author.getGender());
    }
}
