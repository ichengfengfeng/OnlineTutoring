package com.icff.tutoring.dto;

public class Page {
	private int pageRowCount = 10;//每页行数
	private int currentpage ;//当前页
	private int maxCount;  //从数据库中查出的记录数
	private int pageCount;//页数
	private int start; //开始行数
	private int end;
	private int lpage; //起点页
	private int rpage; // 结束页
	private int next;//下一页
	private int previous;//上一页
	
	
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public int getPrevious() {
		return previous;
	}
	public void setPrevious(int previous) {
		this.previous = previous;
	}
	public int getLpage() {
		return lpage;
	}
	public void setLpage(int lpage) {
		this.lpage = lpage;
	}
	public int getRpage() {
		return rpage;
	}
	public void setRpage(int rpage) {
		this.rpage = rpage;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getPageRowCount() {
		return pageRowCount;
	}
	public void setPageRowCount(int pageRowCount) {
		this.pageRowCount = pageRowCount;
	}
	
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public void setCurrentpage(int currrentpage,int pageRowCount,int maxCount) {
		this.pageCount = maxCount%pageRowCount==0? maxCount/pageRowCount : (maxCount/pageRowCount) +1;
		if(currrentpage > this.pageCount)
			this.currentpage = this.pageCount;
		else
			this.currentpage = currrentpage;
		
		if (currrentpage <=0)
			this.currentpage = 1;
		
		this.start = (this.currentpage-1)*this.pageRowCount;
		this.end = this.start + this.pageRowCount;
	}
	
	public Page() {
		
	}
	public Page(int currrentpage,int pageRowCount,int maxCount) {
		this.pageCount = pageRowCount;
		this.maxCount = maxCount;
		setCurrentpage(currrentpage, pageRowCount, maxCount);
		int leftcount =5,rightcount =4;   //需要向上一页执行多少次
		this.lpage = this.currentpage - leftcount;
		this.rpage = this.currentpage + rightcount;
		 //页差=总页数和结束页的差
        int topdiv = this.pageCount-rpage;
        this.lpage = topdiv < 0? this.lpage + topdiv :this.lpage;
        this.rpage = this.lpage <=0 ? this.rpage + (this.lpage* -1) + 1 :this.rpage;
        this.lpage = this.lpage <=0? 1:this.lpage;
        this.rpage = this.rpage > this.pageCount? this.pageCount :this.rpage;
        this.next = this.currentpage >this.pageCount? this.pageCount:this.currentpage + 1;
        this.previous = this.currentpage<=1? 1:this.currentpage-1;
	}

}
