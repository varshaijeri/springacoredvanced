package com.varsha.spring.springcore.propertyplaceholder;

public class MyDAO {
private String dbServer;

public MyDAO(String dbServer) {
	this.dbServer = dbServer;
}

@Override
public String toString() {
	return "MyDAO [dbServer=" + dbServer + "]";
}

}
