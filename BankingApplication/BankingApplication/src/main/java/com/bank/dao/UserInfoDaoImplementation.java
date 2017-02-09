package com.bank.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bank.configuration.HibernateConfiguration;
import com.bank.model.UserInfo;

@Repository
public class UserInfoDaoImplementation implements UserInfoDao{
	Session session=HibernateConfiguration.getSession();
	Transaction tx=session.beginTransaction();
	@Override
	public void save(UserInfo Userinfo) {
		
		try{
		session.save(Userinfo);
		tx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}

	@Override
	public void retrive() {	
	}

	@Override
	public List<UserInfo> getUserData(){
		Session session=HibernateConfiguration.getSession();
		List<UserInfo> data=null;
		try{
			Criteria cr=session.createCriteria(UserInfo.class);
			data=cr.list();
			
		}catch(Exception e){
			e.printStackTrace();	
		}finally{
			session.close();
		}
		return data;
	}

	@Override
	public void checkUser(UserInfo UserInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserInfo findUserbyname(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
