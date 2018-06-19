package vo;

/**
 * Created by think on 2017/12/4.
 */
public class Saler {
    String userId;
    String userName;

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

    String spentType;
    String spentMoney;
}
