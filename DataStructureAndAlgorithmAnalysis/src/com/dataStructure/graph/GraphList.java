package com.dataStructure.graph;

import com.dataStructure.liststackqueue.LList;
import com.dataStructure.liststackqueue.Link;

public class GraphList extends LList {
	public Link currLink() {
		return curr;
	}
	public void setCurr(Link who) {
		curr = who;
	}

}
