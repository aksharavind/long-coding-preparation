import java.util.Date;


public class User {
      private int user_id;
      private String user_name;
      private int selected_book_id;
      private String selected_book_name;
      private Date returndate; 

      public User(int user_id,String user_name,int selected_book_id,String selected_book_name,Date returndate)
      {
        this.user_id=user_id;
        this.user_name=user_name;
        this.selected_book_id=selected_book_id;
        this.selected_book_name=selected_book_name;
        this.returndate=returndate;
      }

      public int getUserid()
      {
        return user_id;
      }
      public String getUsername()
      {
        return user_name;
      }
      public int getSelectedbookid()
      {
        return selected_book_id;
      }
      public String getSelectedbook()
      {
        return selected_book_name;
      }

      public Date getReturnDate()
      {
        return returndate;
      }

      public boolean isOverdue()
      {
        Date currentdate=new Date();
        return currentdate.after(returndate);
      }
}
