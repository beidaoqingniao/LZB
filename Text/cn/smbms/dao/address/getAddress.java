package cn.smbms.dao.address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.smbms.pojo.Address;
import cn.smbms.pojo.Bill;
import cn.smbms.pojo.User;
import cn.smbms.utils.MyBatisUtil;

public class getAddress {
	private Logger logger = Logger.getLogger(getAddress.class);

	/*@Test
	public void test() {
		Address address = new Address();
		// address.setContact("刘");
		address.setUserId(1);
		address.setAddressDesc("北京");
		SqlSession sqlSession = null;
		List<Address> listaddress = new ArrayList<Address>();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			listaddress = sqlSession.getMapper(AddressMapper.class).sele_like3(
					address);

		} catch (Exception e) {

		} finally {
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		for (Address addre : listaddress) {
			System.out.println("地址id：" + addre.getId() + "====联系人："
					+ addre.getContact() +

					"====地址描述：" + addre.getAddressDesc() + "====联系人电话："
					+ addre.getTel() + "====用户id：" + addre.getUserId());
		}
	}

	@Test
	public void updateAddress() {
		Address address = new Address();
		// address.setContact("杨磊");
		address.setUserId(2);
		address.setAddressDesc("孝感黄陂路");
		address.setId(2);
		SqlSession sqlSession = null;
		boolean a;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			a = sqlSession.getMapper(AddressMapper.class)
					.updateAdrress(address);
			sqlSession.commit();
			System.out.println("修改是否成功:" + a);

		} catch (Exception e) {
			sqlSession.rollback();
		} finally {
			MyBatisUtil.closeSqlSession(sqlSession);
		}

	}
*/
	@Test
	public void seleforeach() {
		Map<String, Object> mapp = new HashMap<String, Object>();
		List<Integer> userlist = new ArrayList<Integer>();
		userlist.add(1);
		userlist.add(2);
		//mapp.put("suiban", userlist);
		List<Address> listaddress = new ArrayList<Address>();
		SqlSession sqlSession = null;
		
		try {
			
			sqlSession = MyBatisUtil.createSqlSession();
			listaddress = sqlSession.getMapper(AddressMapper.class)
					.getaddressMap(userlist);
			System.out.println("进了这个方法没有");
			// sqlSession.commit();

		} catch (Exception e) {

		} finally {
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		for (Address address : listaddress) {
			System.out.println("地址id:" + address.getId() + "====联系人："
					+ address.getContact() + "====地址："
					+ address.getAddressDesc() + "====用户id："
					+ address.getUserId());

		}

	}
	
	
	@Test
	public void selechose() {
		
		List<Address> listaddress = new ArrayList<Address>();
		SqlSession sqlSession = null;
		Address address1=new Address();
		address1.setContact("杨");
		address1.setAddressDesc("孝感");
		
		try {
			
			sqlSession = MyBatisUtil.createSqlSession();
			listaddress = sqlSession.getMapper(AddressMapper.class)
					.selechose(address1);
			System.out.println("进了这个方法没有");
			// sqlSession.commit();

		} catch (Exception e) {

		} finally {
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		for (Address address : listaddress) {
			System.out.println("地址id:" + address.getId() + "====联系人："
					+ address.getContact() + "====地址："
					+ address.getAddressDesc() + "====用户id："
					+ address.getUserId());

		}

	}
}
