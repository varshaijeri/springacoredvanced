package com.varsha.spring.springcore.propertyfile;

public class WSClient {
private String url;
private String userName;
private String passwd;

public WSClient(String url, String userName, String passwd) {
	this.url = url;
	this.userName = userName;
	this.passwd = passwd;
}

@Override
public String toString() {
	return "WSClient [url=" + url + ", userName=" + userName + ", passwd=" + passwd + "]";
}

}
