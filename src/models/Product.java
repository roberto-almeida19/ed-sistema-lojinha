package models;

public class Product {
	private int code;
	private String desc;
	private double value;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", desc=" + desc + ", value=" + value + "]";
	}
	
	
}
