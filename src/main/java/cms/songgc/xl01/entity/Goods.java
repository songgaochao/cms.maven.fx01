package cms.songgc.xl01.entity;

public class Goods {
private Integer id;
private String name;
private Double price;
private String dates;
private Status status;//枚举类型

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

public String getDates() {
	return dates;
}
public void setDates(String dates) {
	this.dates = dates;
}
public Status getStatus() {
	return status;
}
public void setStatus(Status status) {
	this.status = status;
}



}
