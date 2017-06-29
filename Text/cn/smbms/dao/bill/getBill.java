package cn.smbms.dao.bill;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.smbms.pojo.Bill;
import cn.smbms.pojo.User;
import cn.smbms.utils.MyBatisUtil;

public class getBill {
	private Logger logger = Logger.getLogger(getBill.class);
	@Test
	public void test() {
		
		SqlSession sqlSession = null;
		List<Bill> userList = new ArrayList<Bill>();
		//Integer [] providerId={1,2};
		Bill bill=new Bill();
		List<Integer> providerlist=new ArrayList<Integer>();
		providerlist.add(1);
		providerlist.add(2);
		//bill.setProductName("孝感");
		//bill.setProviderId(1);
		Map<String ,Object> mapp=new HashMap<String ,Object>();
		mapp.put("isPayment", 1);
		mapp.put("suiban", providerlist);
		List<Bill> blist=new ArrayList<Bill>();
		//bill.setIsPayment(1);
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			
			
			userList=sqlSession.getMapper(BillMapper.class).sele_like(null,null,null,1,3);
			//blist=sqlSession.getMapper(BillMapper.class).getBill(providerId);
			//blist=sqlSession.getMapper(BillMapper.class).getBilll(providerlist);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		for (Bill bi : userList) {
			System.out.println("订单编号："+bi.getBillCode()+"====商品名称："+bi.getProductName()+
					
					
					"====订单金额："+bi.getProductCount()+"====是否付款："+bi.getIsPayment());
			
		}
	}

}
