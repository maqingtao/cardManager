package vo;

/**
 * Created by think on 2017/12/4.
 */
public class Student {
    //��������Ϣ,���Ž�״̬
    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(String moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public String getDoorState() {
        return doorState;
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    public String getSpentType() {
        return spentType;
    }

    public void setSpentType(String spentType) {
        this.spentType = spentType;
    }

    public String getSpentMoney() {
        return spentMoney;
    }

    public void setSpentMoney(String spentMoney) {
        this.spentMoney = spentMoney;
    }

    public String getSignData() {
        return signData;
    }

    public void setSignData(String signData) {
        this.signData = signData;
    }

    public String getSignNumber() {
        return signNumber;
    }

    public void setSignNumber(String signNumber) {
        this.signNumber = signNumber;
    }

    String userName;
    String moneyBalance;
    String doorState;

    //ͼ����Ļ�����Ϣ
    String bookId;
    String bookName;
    String borrowData;
    String returnData;

    //���ѻ�����Ϣ
    String spentType;
    String spentMoney;

    //ǩ����Ϣ
    String signData;
    String signNumber;

}
