package cn.smbms.pojo;

import java.util.Date;

/**
 * ʵ����--->�˵���Ϣ��
 * @author Administrator
 *
 *//*账单实体类*/
public class Bill {
	private int id;/*账单id*/
	private String billCode; /*账单编码*/
	private String productName; /*商品名称*/
	private String productDesc; /*商品描述*/
	private String productUnit; /*商品单位*/
	private double productCount; /*商品数量*/
	private double totalPrice; /*商品总额*/
	private int isPayment; /*是否支付*/
	private int providerId; /*供应商id*/
	private Date creationDate; /*创建时间*/
	private int modifyBy; /*更新者*/
	private Date modifyDate; /*更新时间*/
	private int createdBy; /*创建者*/
	private Provider provider;
	
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public double getProductCount() {
		return productCount;
	}
	public void setProductCount(double productCount) {
		this.productCount = productCount;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getIsPayment() {
		return isPayment;
	}
	public void setIsPayment(int isPayment) {
		this.isPayment = isPayment;
	}
	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}


}
