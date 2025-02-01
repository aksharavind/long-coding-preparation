public class Book {

    private int book_id;
    private String bookname;
    private int price;
    private String  author;
    

    public Book(int book_id,String bookname, int price,String author)
    {
        this.book_id=book_id;
        this.bookname=bookname;
        this.price=price;
        this.author=author;
    }

    public int getBookid()
    {
        return book_id;
    }
    public String getBookname()
    {
        return bookname;
    }

    public int getPrice()
    {
        return price;
    }

    public String getAuthor()
    {
        return author;
    }

    


}