package org.company;

public class CompanyInfo {

	public void companyName() {
		System.out.println("CompanyName:ABC");

	}
	public void companyId() {
		System.out.println("Company ID:1000");

	}
	public void companyAddress() {
		System.out.println("Company Addresse:ABC,123,Tambaram,chennai-60");

	}
	public static void main(String[] args) {
		CompanyInfo e=new CompanyInfo();
		e.companyName();
		e.companyId();
		e.companyAddress();
	}
}
