package com.qa.visa.model;

public class OrderDetails {
	
	private int return_reason_cd;
	private String shipping_return_flag;
	private String last_updated_ts;
	
	public OrderDetails() {
		
	}
	
	public OrderDetails(int return_reason_cd, String shipping_return_flag, String last_updated_ts) {
		this.return_reason_cd = return_reason_cd;
		this.shipping_return_flag = shipping_return_flag;
		this.last_updated_ts = last_updated_ts;
	}

	public int getReturn_reason_cd() {
		return return_reason_cd;
	}

	public void setReturn_reason_cd(int return_reason_cd) {
		this.return_reason_cd = return_reason_cd;
	}

	public String getShipping_return_flag() {
		return shipping_return_flag;
	}

	public void setShipping_return_flag(String shipping_return_flag) {
		this.shipping_return_flag = shipping_return_flag;
	}

	public String getLast_updated_ts() {
		return last_updated_ts;
	}

	public void setLast_updated_ts(String last_updated_ts) {
		this.last_updated_ts = last_updated_ts;
	}

	
	
}
