package com.example.demo.dto;

import java.util.List;


import com.example.demo.model.PropertyInfo;
import com.example.demo.model.VestingDeedInfo;

public class PVRequest {
	
	
	private PropertyInfo propertyinfo;
	private List<VestingDeedInfo> vestingdeedinfo;
	
	
	public PropertyInfo getPropertyinfo() {
		return propertyinfo;		
	}
	public void setPropertyinfo(PropertyInfo propertyinfo) {
		this.propertyinfo = propertyinfo;
	}
	public List<VestingDeedInfo> getVestingdeedinfo() {
		return vestingdeedinfo;
	}
	public void setVestingdeedinfo(List<VestingDeedInfo> vestingdeedinfo) {
		this.vestingdeedinfo = vestingdeedinfo;
	}
	
	
	

	


}
