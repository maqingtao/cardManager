package dao;

import db.DB;
import vo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by think on 2017/12/4.
 */
public class UserDAOImpl {
    private Connection conn;
    public UserDAOImpl(){
       conn= DB.getConnection();
    }
    public boolean login(User user)
    {
        PreparedStatement pstm=null;
        ResultSet resultSet=null;
        boolean flag=false;
         try {
             pstm=conn.prepareStatement("select * from users where username=? and passwords=? and characters=?");
            pstm.setString(1,user.getUsername());
            pstm.setString(2,user.getPassword());
            pstm.setString(3,user.getCharacter());
             resultSet=pstm.executeQuery();
             if (resultSet.next())
             {
                 flag=true;
             }
         }catch (Exception e){
             e.printStackTrace();
         }finally {

                if (resultSet!=null)
                {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

             if (pstm!=null)
             {
                 try {
                     pstm.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
         }
         return flag;
    }
    public List<Cardmanager> queryAll()
    {
        PreparedStatement pstm=null;
        ResultSet resultSet=null;
        List<Cardmanager> list=new ArrayList<Cardmanager>();
        try {
            pstm=conn.prepareStatement("select * from card_user");
            resultSet=pstm.executeQuery();
            while(resultSet.next()){
               Cardmanager cm=new Cardmanager();
                cm.setUserId(resultSet.getString("USER_ID"));
               cm.setUsername(resultSet.getString("USER_NAME"));
                cm.setCreateDate(resultSet.getString("CREATE_DATE"));
                cm.setMoneyBalance(resultSet.getString("MONEY_BALANCE"));
                cm.setState(resultSet.getString("STATE"));
                list.add(cm);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if (resultSet!=null)
            {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstm!=null)
            {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
       return list;
    }
    public List<BookManager> queryBook()
    {
        PreparedStatement pstm=null;
        ResultSet resultSet=null;
        List<BookManager> list=new ArrayList<BookManager>();
        try {
            pstm=conn.prepareStatement("select * from user_books");
            resultSet=pstm.executeQuery();
            while(resultSet.next()){
                BookManager bm=new BookManager();
                bm.setUserid(resultSet.getString("USER_ID"));
                bm.setUsername(resultSet.getString("USER_NAME"));
                bm.setBookid(resultSet.getString("BOOK_ID"));
                bm.setBookname(resultSet.getString("BOOK_NAME"));
                bm.setBorrowData(resultSet.getString("BORROW_DATE"));
                bm.setReturnData(resultSet.getString("RETURN_DATE"));
                list.add(bm);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if (resultSet!=null)
            {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstm!=null)
            {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    public List<DoorManager> queryDoor()
    {
        PreparedStatement pstm=null;
        ResultSet resultSet=null;
        List<DoorManager> list=new ArrayList<DoorManager>();
        try {
            pstm=conn.prepareStatement("select * from door_state");
            resultSet=pstm.executeQuery();
            while(resultSet.next()){
                DoorManager dm=new DoorManager();
               dm.setUserId(resultSet.getString("USER_ID"));
               dm.setUserName(resultSet.getString("USER_NAME"));
               dm.setDoorState(resultSet.getString("DOOR_STATE"));
               list.add(dm);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if (resultSet!=null)
            {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstm!=null)
            {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    public List<Saler> querySpent()
    {
        PreparedStatement pstm=null;
        ResultSet resultSet=null;
        List<Saler> list=new ArrayList<Saler>();
        try {
            pstm=conn.prepareStatement("select * from money_spent");
            resultSet=pstm.executeQuery();
            while(resultSet.next()){
               Saler saler=new Saler();
                saler.setUserId(resultSet.getString("USER_ID"));
                saler.setUserName(resultSet.getString("USER_NAME"));
               saler.setSpentType(resultSet.getString("SPENT_TYPE"));
               saler.setSpentMoney(resultSet.getString("SPENT_MONEY"));
                list.add(saler);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if (resultSet!=null)
            {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstm!=null)
            {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    public List<Teacher> querySign()
    {
        PreparedStatement pstm=null;
        ResultSet resultSet=null;
        List<Teacher> list=new ArrayList<Teacher>();
        try {
            pstm=conn.prepareStatement("select * from sign_number");
            resultSet=pstm.executeQuery();
            while(resultSet.next()){
                Teacher teacher=new Teacher();
                teacher.setUserId(resultSet.getString("USER_ID"));
               teacher.setUserName(resultSet.getString("USER_NAME"));
                teacher.setSignNumber(resultSet.getString("SIGN_IN_NUMBER"));
                teacher.setSignDate(resultSet.getString("SIGN_DATE"));
                list.add(teacher);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if (resultSet!=null)
            {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstm!=null)
            {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

}
