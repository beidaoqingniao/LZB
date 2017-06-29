package cn.smbms.dao.user;



import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.smbms.pojo.User;
import cn.smbms.utils.MyBatisUtil;

public class getUser {
	private Logger logger = Logger.getLogger(getUser.class);
	@Test
	public void test() {
		
		SqlSession sqlSession = null;
		//List<User> userList = new ArrayList<User>();
		User user=new User();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			
			//第一种方式:调用selectList方法执行查询操作
			//userList = sqlSession.selectList("cn.smbms.dao.user.UserMapper.getUserList");
			
			//第二种方式:调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
			/*User user=new User();
			user.setUserName("鲁");
			user.setUserRole(2);
			userList = sqlSession.getMapper(UserMapper.class).getUserList(user);
			*/
			//userList = sqlSession.getMapper(UserMapper.class).Listrole(1);
			user=sqlSession.getMapper(UserMapper.class).IdgetUser(1);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		System.out.println("user的名字是："+user.getUserName());
	}

}
