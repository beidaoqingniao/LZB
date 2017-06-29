package cn.smbms.dao.provider;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Bill;
import cn.smbms.pojo.Provider;

public interface ProviderMapper {
	public List<Provider> selePro();
	public int upPro(Provider provider);
	public int delePro(@Param("id")Integer id);
	public int addPro(Provider provider);
	public List<Provider> getBilllist(@Param("id")Integer id);
	
	
	public List<Provider> selechose(@Param("proCode")String proCode,
									@Param("proName")String proName,
									@Param("proAddress")String proAddress,
									@Param("creationDate")Date creationDate
									);	


}
