package cn.smbms.dao.bill;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Bill;
import cn.smbms.pojo.Provider;

public interface BillMapper {
	public List<Bill> sele_like(
			@Param("productName")String productName,
			@Param("providerId")String providerId,
			@Param("isPayment")String isPayment,
			@Param("from")Integer yms,@Param("pageSize")Integer yts);
	public List<Bill> getBill(Integer[] provid);
	public List<Bill> getBilll(List<Integer> provlist);
	public List<Bill> getBillMap(Map<String, Object> mapp);
	
}
