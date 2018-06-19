package vo;

/**
 * Created by think on 2017/12/4.
 */
public class Cardmanager {
    String userId;
    String username;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    String state;
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(String moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    String createDate;
    String moneyBalance;
}
