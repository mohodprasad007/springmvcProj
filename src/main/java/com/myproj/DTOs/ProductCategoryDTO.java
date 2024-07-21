package com.myproj.DTOs;

import java.util.Date;

public class ProductCategoryDTO  {
	
	private Long pid;
	private String ProdCat;
	private String name;
	private Date crt_dt;
	private String prodDtls;
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getProdCat() {
		return ProdCat;
	}
	public void setProdCat(String prodCat) {
		ProdCat = prodCat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCrt_dt() {
		return crt_dt;
	}
	public void setCrt_dt(Date crt_dt) {
		this.crt_dt = crt_dt;
	}
	public String getProdDtls() {
		return prodDtls;
	}
	public void setProdDtls(String prodDtls) {
		this.prodDtls = prodDtls;
	}
	
	
public void showDtls() {
	System.out.println("dto daata test for  configuration ");
}
}
