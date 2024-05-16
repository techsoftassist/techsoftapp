package com.example.demo.model;


import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "propertyinfo")
public class PropertyInfo {
	
    
    
    @Id
	private String orderNumber;	
	private String referenceNumber;
	private Date searchDate;
	private Date effectiveDate;
	private String propertyAddress;	
	private String state;	
	private String county;
	private String borrowerName;
	private String lotUnit;	
	private String block;	
	private String subdivision;	
	private String parcelNumber;
	private String propertyType;
	
	


	@OneToMany(targetEntity = VestingDeedInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name="orderNumber", referencedColumnName="orderNumber")
	private List<VestingDeedInfo> vestingdeedinfo;
	
	@OneToMany(targetEntity = OpenMortgageDeddInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "orderNumber", referencedColumnName = "orderNumber")
	private List<OpenMortgageDeddInfo> OpenMortgageDeddInfo;
	
	
	public PropertyInfo() {
		super();
	}

	public PropertyInfo(String orderNumber, String referenceNumber, Date searchDate, Date effectiveDate,
			String propertyAddress, String state, String county, String borrowerName, String lotUnit, String block,
			String subdivision, String parcelNumber, String propertyType, List<VestingDeedInfo> vestingdeedinfo,List<OpenMortgageDeddInfo> OpenMortgageDeddInfo) {
		//List<OpenMortgageDeddInfo> OpenMortgageDeddInfo
		super();
		this.orderNumber = orderNumber;
		this.referenceNumber = referenceNumber;
		this.searchDate = searchDate;
		this.effectiveDate = effectiveDate;
		this.propertyAddress = propertyAddress;
		this.state = state;
		this.county = county;
		this.borrowerName = borrowerName;
		this.lotUnit = lotUnit;
		this.block = block;
		this.subdivision = subdivision;
		this.parcelNumber = parcelNumber;
		this.propertyType = propertyType;
		this.vestingdeedinfo = vestingdeedinfo;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Date getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public String getLotUnit() {
		return lotUnit;
	}

	public void setLotUnit(String lotUnit) {
		this.lotUnit = lotUnit;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}

	public String getParcelNumber() {
		return parcelNumber;
	}

	public void setParcelNumber(String parcelNumber) {
		this.parcelNumber = parcelNumber;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public List<VestingDeedInfo> getVestingdeedinfo() {
		return vestingdeedinfo;
	}

	public void setVestingdeedinfo(List<VestingDeedInfo> vestingdeedinfo) {
		this.vestingdeedinfo = vestingdeedinfo;
	}

	public List<OpenMortgageDeddInfo> getOpenMortgageDeddInfo() {
		return OpenMortgageDeddInfo;
	}

	public void setOpenMortgageDeddInfo(List<OpenMortgageDeddInfo> openMortgageDeddInfo) {
		OpenMortgageDeddInfo = openMortgageDeddInfo;
	}

//	public List<ChainOfTitle> getChainOfTitles() {
//		return chainOfTitles;
//	}
//
//	public void setChainOfTitles(List<ChainOfTitle> chainOfTitles) {
//		this.chainOfTitles = chainOfTitles;
//	}
//	
	
	
	
	
//	@OneToMany(targetEntity = ChainOfTitle.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="orderNumber", referencedColumnName="orderNumber")
//	private List<ChainOfTitle> chainoftitle;
	
	
	
	

	
} 
