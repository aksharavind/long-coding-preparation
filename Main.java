import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Admin  obj=new Admin();
         Scanner in=new Scanner(System.in);

         boolean exit=false;
         while(!exit) {
            System.out.println("********************");
            System.out.println("Welocme to me library");
            System.out.println("**********************");
            System.out.println("1.Librarian can add books");
            System.out.println("2.Librarian can remove books ");
            System.out.println("3.To display the available books to the readers");
            System.out.println("4.Readers can seleced their needed book");
            System.out.println("5.Readers can return the book back to the library");
            System.out.println("6.exit");
            System.out.println("enter the choice");
            int ch=in.nextInt();
            switch (ch) {
                case 1:
                    obj.addBooks();
                    break;
                case 2:
                    obj.removebooks();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                   obj.usertoLendbook();
                   break;
                case 5:
                 obj.returnBook();
                 break;
                
                case 6:
                    exit=true;
                    break;
                default:
                System.out.println("enter the valid choice");
                break;
            }
         }

    }
}
