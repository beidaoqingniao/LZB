package cn.smbms.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.User;

public interface UserMapper {
	/**
	 * 查询用户表记录数
	 * @return
	 */
	public int count();
	/**
	 * 查询用户列表
	 * @return
	 */
	//public List<User> getUserList();
	public List<User> getUserList(User user);
	
	public List<User> Listrole(@Param("userRole")Integer roleid);
	
	public List<User> Listroleaddress(@Param("id")Integer id);
	public User IdgetUser(@Param("id")Integer id);
}
