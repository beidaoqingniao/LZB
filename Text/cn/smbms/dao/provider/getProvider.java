package cn.smbms.dao.provider;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.smbms.pojo.Bill;
import cn.smbms.pojo.Provider;
import cn.smbms.pojo.User;
import cn.smbms.utils.MyBatisUtil;

public class getProvider {
	private Logger logger = Logger.getLogger(getProvider.class);
	@Test
	public void test() {
		
		SqlSession sqlSession = null;
		List<Provider> list=new ArrayList<Provider>();
		/*Provider pr=new Provider();
		pr.setId(3);
		pr.setProName("真好吃");*/
		int a=0;
		
		
		/*测试chose方法*/
		
		/*Provider addpr=new Provider();
		addpr.setProCode("1008");
		addpr.setProName("武汉传媒公司");
		addpr.setProDesc("付出最多，收获最少");*/
		List<Provider> listbill=new ArrayList<Provider>();
		
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			/*查询所有的测试*/
			//list=sqlSession.getMapper(ProviderMapper.class).selePro();
			
			/*测试修改*/
			//a=sqlSession.getMapper(ProviderMapper.class).upPro(pr);
			
			/*测试chose方法*/
			Date dat=new SimpleDateFormat("yyyy-MM-dd").parse("2017-05-02");
			list=sqlSession.getMapper(ProviderMapper.class).selechose(null, null, null, dat);
			 //sqlSession.commit();
			
			/*测试删除方法*/
			/*a=sqlSession.getMapper(ProviderMapper.class).delePro(10);
			sqlSession.commit();*/
			
			/*测试添加方法*/
			/*a=sqlSession.getMapper(ProviderMapper.class).addPro(addpr);
			sqlSession.commit();*/
			
			
			/*根据供应商id查询出订单集合*/
			
			//listbill=sqlSession.getMapper(ProviderMapper.class).getBilllist(1);
		} catch (Exception e) {
			
			e.printStackTrace();
			//sqlSession.rollback();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		for (Provider provider : list) {
			System.out.println("供应商的id："+provider.getId()+"=======供应商的名称："+provider.getProName());
		}
		
		
		/*供应商对应的订单集合*/
		/*for (Provider provider : listbill) {
			System.out.println("供应商id:"+provider.getId()+"====供应商编码:"+provider.getProCode()+"====供应商名称:"+provider.getProName()+"====供应商联系人:"+provider.getProContact()+"====供应商电话:"+provider.getProPhone());
			for (Bill billist : provider.getBilllist()) {
				System.out.println("订单编码："+billist.getBillCode()+"######商品名称："+billist.getProductName()+"######订单金额："+billist.getProductCount()+"######是否付款："+billist.getIsPayment());
			}
			
		}*/
	}

}
