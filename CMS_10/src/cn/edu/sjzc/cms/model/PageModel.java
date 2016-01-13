package cn.edu.sjzc.cms.model;

public class PageModel {
	private int pageNo;
	private int pageSize;
	private int totalPage;
	private int allRecond;
	private int StartIndex;
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		this.totalPage=(allRecond%pageSize==0)?allRecond/pageSize:allRecond/pageSize+1;
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getAllRecond() {
		return allRecond;
	}
	public void setAllRecond(int allRecond) {
		this.allRecond = allRecond;
	}
	public int getStartIndex() {
		return (pageNo-1)*pageSize;
	}
}
