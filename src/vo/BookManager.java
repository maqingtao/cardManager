package vo;

/**
 * Created by think on 2017/12/4.
 */
public class BookManager
{
    String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBorrowData() {
        return borrowData;
    }

    public void setBorrowData(String borrowData) {
        this.borrowData = borrowData;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    String username;
    String bookid;
    String bookname;
    String borrowData;
    String returnData;
}
