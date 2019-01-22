package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.HibernateConfig;
import dao.ExpertDao;
import model.Expert;
import model.Question;
import model.Users;

public class ExpertService  implements ExpertInterface{
	
	@Autowired
	static ExpertDao expertDao;

	public int addExpert(Expert Expert) {
	
		return expertDao.addExpert(Expert);
	}

	public int removeExpert(String s) {
		// TODO Auto-generated method stub
		return expertDao.removeExpert(s);
	}

	public int updateExpert(Expert Expert ) {
		// TODO Auto-generated method stub
		return expertDao.updateExpert(Expert);
	}

	public List showAllExpert() {
		// TODO Auto-generated method stub
		return expertDao.showAllExpert();
	}

	public Expert showSingleExpert(String s) {
		// TODO Auto-generated method stub
		return expertDao.showSingleExpert(s);
	}

public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 expertDao=contex.getBean(ExpertDao.class);
		 expertDao.f1();
		 
		//ADD EXPERT
		
		Expert e=new Expert();
		e.setEmailid("expert5@123");
		e.setPhonenumber(512365);
		e.setStandard(121);
		e.setExpertIn("Engineering");
		e.setPassword("abcd123");
		e.setUsername("ujjwal"+" "+"jesani");
		e.setExpertSalary(5000.0f);
		e.setTypeOfUser("Expert");
		//int a=expertDao.addExpert(e);
		
		//DELETE EXPERT
		
		//int a1=expertDao.removeExpert("expert@123");
		//System.out.println(a1);
		
		
		
		//UPDATE EXPERT
		Expert e1=new Expert() ;
		e1.setEmailid("expert2@123");
		e1.setPhonenumber(512365);
		e1.setPassword("abcd12");
		e1.setExpertSalary(5000.0f);
		
		//int a2=expertDao.updateExpert(e1);
		
		
		//SHOW EXPERT
		
		/*List l1=expertDao.showAllExpert();
		
		for(Object q:l1) {
			System.out.print(((Expert) q).getEmailid());
			 System.out.println(((Expert) q).getUsername());
			
		}*/
		
		//SHOW SINGLE EXPERT
		/*Expert e2=expertDao.showSingleExpert("expert2@123");
		System.out.println(e2.getPassword());
	*/
}
}




/*package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.BranchDaoImpl;
import dao.UserDaoImpl;
import model.Branch;
import model.Users;

@Service
public class UserServiceImpl implements UserInterFace 
{

	@Autowired
	static UserDaoImpl userDaoImpl;

	
	
	public boolean checkConfiguration() {
		// TODO Auto-generated method stub
		return userDaoImpl.checkConfiguration();
	}

	public int registerUser(Users user) {
		
		return userDaoImpl.registerUser(user);
	}

	public int loginUser(Users user)
	{
		return userDaoImpl.loginUser(user);
	}
	
	
	public int updateUser(Users user) {
		return userDaoImpl.updateUser(user);
	}

	public int deleteUser(Users user) {
		return userDaoImpl.deleteUser(user);
	}

	public Users searchUserByEmail(String emailid) {
		return userDaoImpl.searchUserByEmail(emailid);

	}
	
	public List<Users> getUserList() {
		
		return userDaoImpl.getUserList();
	}
	
	
	public static void main(String[] args)
	{
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 userDaoImpl=contex.getBean(UserDaoImpl.class);
		System.out.println(userDaoImpl.checkConfiguration());
		
	
		
//FOR UPDATE
//		Users user=new Users();
//	user.setEmailid("abca@gmail.com");
//	user.setPhonenumber(123);
//	user.setUsername("abc");
//		user.setStandard(12);
//		int i=userDaoImpl.updateUser(user);
//		System.out.println(i);
//		if(i==1)
//			System.out.println("updated");
		
		
//FOR DELETE		
//		Users user=new Users();
//		user.setEmailid("def@gmail.com");
//		
//			user.setStandard(12);
//			int i=userDaoImpl.deleteUser(user);
//			System.out.println(i);
//			if(i==1)
//				System.out.println("deleted");
		
//FOR REGISTRATION		
//		Users user=new Users();
//		user.setEmailid("abca@gmail.com");
//		user.setPhonenumber(12345);
//		user.setUsername("abc");
//		user.setStandard(10);
//		user.setPassword("abc123");
//		int i=userDaoImpl.registerUser(user);
//		System.out.println(i);
//		if(i==1)
//			System.out.println("Registered");
//		else
//			System.out.println("alredy registered");

		
		
		
////output 1 for successfull registration....2 already egistered.....0 internal error
		
		
		
//		Users user3=new Users();
//		user3.setEmailid("hij@gmail.com");
//		user3.setPhonenumber(1234567);
//		user3.setUsername("hij");
//		user3.setStandard(12);
//		user3.setPassword("hij123");
//		int l=userDaoImpl.registerUser(user);
//		
//		
//		Users user2=new Users();
//		user2.setEmailid("def@gmail.com");
//		user2.setPhonenumber(123456);
//		user2.setUsername("def");
//		user2.setStandard(12);
//		user2.setPassword("def123");
//	int j=userDaoImpl.registerUser(user2);
//		System.out.println(j);

		
//TO SEE USERS
//		List<Users> ls=userDaoImpl.getUserList();
//		
//		for (Users object : ls) {
//			System.out.println(object);
//		}
//		
//		
		
		
//LOGIN
//		Users user1=new Users();
//		user1.setEmailid("abca@gmail.com");
//		user1.setPassword("abc123");
//		int k=userDaoImpl.loginUser(user1);
//		System.out.println(k);
//		if(k==2)
//			System.out.println("logged in");
//		
//		
//		
		
	}

	
	
	
}*/
