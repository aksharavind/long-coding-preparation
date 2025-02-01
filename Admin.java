import java.util.*;

public class Admin {
    
     private  List<Book> books=new ArrayList<>();
     private List<User> users=new ArrayList<>();
     Scanner in=new Scanner(System.in);
     public void addBooks()
     {
          System.out.println("enter the book id");
          int bookid=in.nextInt();
          in.nextLine();
          System.out.println("enter the book name");
          String bookname=in.nextLine();
          in.nextLine();

          System.out.println("enter the book price");
          int bookprice=in.nextInt();
          in.nextLine();
          System.out.println("enter the author of the book");
          String author=in.nextLine();
        
        Book b=new Book(bookid,bookname, bookprice, author);
        books.add(b);
        System.out.println("book added succesfully");

     }
     public void removebooks()
     {
         if(books.isEmpty())
         {
            System.out.println("No books to remove");
         }
         else
         {
          System.out.println("Enter the book id to remove ");
          int rem_id=in.nextInt();
          boolean remove=books.removeIf(book->book.getBookid()==rem_id);
          if (remove) {
             System.out.println("the book is removed");
          }
          else
          {
            System.out.println("Enter the valid book id");
          }
         }
     }

     public void display()
     {
        if(books.isEmpty())
        {
         System.out.println("No books available");
        }
        else{
        System.out.println("The available books are");
        int index=1;
        for(Book b:books)
        {
         System.out.println(index + ". Book id: " + b.getBookid() + ", Book name: " + b.getBookname() + ", Book Author: " + b.getAuthor());

         index++;
        }
      }
     }

     public void usertoLendbook()
     {
        System.out.println("enter the user id");
        int id=in.nextInt();

        in.nextLine();
        System.out.println("enter the user name ");
        String username=in.nextLine();
        System.out.println("enter the id of the selected book");
        int sel_id=in.nextInt();

        in.nextLine();
        System.out.println("enter the name of the selected book ");
        String sel_name=in.nextLine();

        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,30);
        Date returndate=calendar.getTime();
        User user=new User(id, username,sel_id,sel_name,returndate);
        users.add(user);

        boolean bookrem=false;
        Iterator<Book> iterator=books.iterator();
        while (iterator.hasNext()) {
           Book b=iterator.next();
           if(b.getBookid()==sel_id)
           {
            iterator.remove();
            bookrem=true;
            System.out.println("the book has lent successfuly");
            System.out.println("Return Date:" +" "+returndate);
            break;
           }
        }
        if(!bookrem)
        {
         System.out.println("the selected book not available");
        }

     }

     public void returnBook()
     {
        System.out.println("enter the user id to return books ");
        int user_id=in.nextInt();
        in.nextLine();
        for(User user:users)
        {
         if(user.getUserid()==user_id)
         {
            if(user.isOverdue())
            {
               System.out.println("The book is overdue. You need to pay a penalty.");
            }
            System.out.println("enter the book id you want to return back");
            int book_id=in.nextInt();
            in.nextLine();
            System.out.println("enter the name of the book");
            String book_name=in.nextLine();
            System.out.println("enter the author of the book");
            String book_author=in.nextLine();
            System.out.println("enter the price of the book");
            int book_price=in.nextInt();
            Book b=new Book(book_id,book_name,book_price,book_author);
            books.add(b);
         }

         else
         {
            System.out.println("you are not the registered user");

         }
        }
     }
}
