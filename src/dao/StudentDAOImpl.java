package dao;

import db.DB;

import vo.Cardmanager;
import vo.Saler;
import vo.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by think on 2017/12/5.
 */
public class StudentDAOImpl {
    private Connection conn;
    public StudentDAOImpl(){
        conn= DB.getConnection();
    }
    public List<Student> queryCard(String id){//卡信息
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        List<Student> list=new ArrayList<Student>();
        try{
            pstmt=conn.prepareStatement("select * from card_user where user_id=?");
            pstmt.setString(1,id);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Student student=new Student();
                student=new Student();
                student.setUserId(rs.getString("USER_ID"));
                student.setUserName(rs.getString("USER_NAME"));
                student.setMoneyBalance(rs.getString("MONEY_BALANCE"));
                list.add(student);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;

    }
    public List<Student> queryBook(String id){//借书信息
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        List<Student> list=new ArrayList<Student>();
        try{
            pstmt=conn.prepareStatement("select * from user_books where user_id=?");
            pstmt.setString(1,id);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Student student1=new Student();
                student1.setBookId(rs.getString("BOOK_ID"));
                student1.setBookName(rs.getString("BOOK_NAME"));
                student1.setBorrowData(rs.getString("BORROW_DATE"));
                student1.setReturnData(rs.getString("RETURN_DATE"));
                list.add(student1);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;

    }

    public List<Student> querySpent(String id){//消费信息
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        List<Student> list=new ArrayList<Student>();
        try{
            pstmt=conn.prepareStatement("select * from money_spent where user_id=?");
            pstmt.setString(1,id);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Student student=new Student();
               student.setSpentType(rs.getString("SPENT_TYPE"));
               student.setSpentMoney(rs.getString("SPENT_MONEY"));
                list.add(student);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;

    }

    public List<Student> querySign(String id){//签到信息
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        List<Student> list=new ArrayList<Student>();
        try{
            pstmt=conn.prepareStatement("select * from sign_number where user_id=?");
            pstmt.setString(1,id);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Student student=new Student();
                student.setSignNumber(rs.getString("SIGN_IN_NUMBER"));
                student.setSignData(rs.getString("SIGN_DATE"));
                list.add(student);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;

    }

    public Student queryDoorS(String id){//门禁
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        Student student=null;
        try{
            pstmt=conn.prepareStatement("select * from door_state where user_id=?");
            pstmt.setString(1,id);
            rs=pstmt.executeQuery();
            if (rs.next()){
                student=new Student();
                student.setDoorState(rs.getString("DOOR_STATE"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return student;

    }

    public boolean createCard(Cardmanager cardmanager){
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            pstmt=conn.prepareStatement("insert into card_user(user_id,user_name,money_balance,create_date,state) values(?,?,?,?,?)");
            pstmt.setString(1,cardmanager.getUserId());
            pstmt.setString(2,cardmanager.getUsername());
            pstmt.setInt(3,0);
            pstmt.setDate(4,new java.sql.Date(new Date().getTime()));
            pstmt.setString(5,"On");
            flag=pstmt.executeUpdate()>0;

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return flag;

        }
    }

    public boolean storeMoney(String id,int oldmoney,int store){
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            pstmt=conn.prepareStatement("UPDATE card_user set money_balance=? where user_id=?");
            pstmt.setInt(1,oldmoney+store);
            pstmt.setString(2,id);
            flag=pstmt.executeUpdate()>0;

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return flag;

        }
    }

    public boolean spentMoney(String id,int spentmoney){
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            pstmt=conn.prepareStatement("UPDATE card_user set money_balance=(SELECT money_balance FROM card_user where user_id=?)-?");
            pstmt.setString(1,id);
            pstmt.setInt(2,spentmoney);

            flag=pstmt.executeUpdate()>0;

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return flag;

        }
    }

    public boolean createSpent(Saler saler){
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            pstmt=conn.prepareStatement("insert into money_spent(user_id,user_name,spent_type,spent_money) values(?,?,?,?)");
            pstmt.setString(1,saler.getUserId());
            pstmt.setString(2,saler.getUserName());
            pstmt.setString(3,saler.getSpentType());
            pstmt.setInt(4,Integer.parseInt(saler.getSpentMoney()));
            flag=pstmt.executeUpdate()>0;

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return flag;

        }
    }
    public boolean delcard(String id){//销户
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            pstmt=conn.prepareStatement("delete from card_user where user_id=?");
            pstmt.setString(1,id);
            flag=pstmt.executeUpdate()>0;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;

    }
    public boolean delbook(String id){//删除借阅记录
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            pstmt=conn.prepareStatement("delete from user_books where user_id=?");
            pstmt.setString(1,id);
            flag=pstmt.executeUpdate()>0;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;

    }
    public boolean door(String id,String state){//门禁
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            pstmt=conn.prepareStatement("UPDATE door_state set door_state=? where user_id=?");
            if (state.equals("On"))
            {
                pstmt.setString(1,"On");
            }
            if (state.equals("Off"))
            {
                pstmt.setString(1,"Off");
            }
            pstmt.setString(2,id);
            flag=pstmt.executeUpdate()>0;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;

    }
    public boolean sign(String id,int oldNumber){//学生签到
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            int number=oldNumber+1;
            pstmt=conn.prepareStatement("UPDATE sign_number set sign_in_number=? where user_id=?");
            pstmt.setInt(1,number);
            pstmt.setString(2,id);
            flag=pstmt.executeUpdate()>0;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;

    }
    public boolean cardState(String id,String oldState){//学生卡挂失
        PreparedStatement pstmt=null;
        boolean flag=false;
        try{
            pstmt=conn.prepareStatement("UPDATE card_user set state=? where user_id=?");
            if (oldState.equals("On"))
            {
                pstmt.setString(1,"On");
            }
            if (oldState.equals("Off"))
            {
                pstmt.setString(1,"Off");
            }
            pstmt.setString(2,id);
            flag=pstmt.executeUpdate()>0;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;

    }
}
