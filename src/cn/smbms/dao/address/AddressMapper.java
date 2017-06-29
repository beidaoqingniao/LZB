package cn.smbms.dao.address;

import java.util.List;
import java.util.Map;

import cn.smbms.pojo.Address;
import cn.smbms.pojo.Bill;
import cn.smbms.pojo.User;

public interface AddressMapper {
	public List<Address> sele_like3(Address Address);
	public boolean updateAdrress(Address Address);
//	public List<Address> getAddressMap(Map<String, Object> mapp);
	public List<Address> getaddressMap(List<Integer> mapp);
	public List<Address> selechose(Address address);
}
