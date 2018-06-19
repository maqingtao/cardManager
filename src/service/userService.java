package service;

import dao.StudentDAOImpl;
import dao.UserDAOImpl;
import vo.*;

import java.util.List;


/**
 * Created by think on 2017/12/4.
 */
public class userService {
    private UserDAOImpl userDAO;
    private StudentDAOImpl studentDAO;
    public userService()
    {
        userDAO=new UserDAOImpl();
        studentDAO=new StudentDAOImpl();
    }
    public boolean log(User user)
    {
             return  userDAO.login(user);
    }
    public List<Cardmanager> queryAll() {return userDAO.queryAll();}
    public List<BookManager> queryBook() {return userDAO.queryBook();}
    public List<DoorManager> queryDoor() {return userDAO.queryDoor();}
    public List<Saler> querySpent() {return userDAO.querySpent();}
    public List<Teacher> querySign() {return userDAO.querySign();}
    public List<Student> queryCard(String id) {return studentDAO.queryCard(id);}
    public List<Student> queryBooks(String id) {return studentDAO.queryBook(id);}
    public List<Student> querySpent(String id) {return studentDAO.querySpent(id);}
    public List<Student> querySign(String id) {return studentDAO.querySign(id);}
    public Student queryDoorS(String id) {return studentDAO.queryDoorS(id);}
    public boolean createCard(Cardmanager cardmanager){return studentDAO.createCard(cardmanager);}
    public boolean delCard(String id){return studentDAO.delcard(id);}
    public boolean delbook(String id){return studentDAO.delbook(id);}
    public boolean doorstate(String id,String state){return studentDAO.door(id,state);}
    public boolean sign(String id,int oldNumber){return studentDAO.sign(id,oldNumber);}
    public boolean createSpent(Saler saler){return studentDAO.createSpent(saler);}
    public boolean cardState(String id,String oldState){return studentDAO.cardState(id,oldState);}
    public boolean storeMoney(String id,int oldmoney,int store){return studentDAO.storeMoney(id,oldmoney,store);}
    public boolean spentMoney(String id,int spentmoney){return studentDAO.spentMoney(id,spentmoney);}
}
