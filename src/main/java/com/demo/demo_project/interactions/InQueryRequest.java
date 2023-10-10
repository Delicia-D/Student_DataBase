package com.demo.demo_project.interactions;

import java.util.List;

public class InQueryRequest {
@Override
	public String toString() {
		return "InQueryRequest [names=" + names + "]";
	}

private List<String>names;
//private List<String>surnames;
//private List<String>emails;
//private List<Integer>ages;

public InQueryRequest(List<String> names) {
	super();
	this.names = names;
}

public List<String> getNames() {
	return names;
}

public void setNames(List<String> names) {
	this.names = names;
}

public InQueryRequest() {
	super();
	// TODO Auto-generated constructor stub
}


}
