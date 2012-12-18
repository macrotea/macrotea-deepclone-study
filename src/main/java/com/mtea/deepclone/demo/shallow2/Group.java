package com.mtea.deepclone.demo.shallow2;

/**
 * @author macrotea@qq.com
 * @date 2012-12-18 下午11:51:34
 * @version 1.0
 * @note
 */
public class Group implements Cloneable{
	
	private int id;
	
	private String groupName;

	public Group() {
		super();
	}

	public Group(int id, String groupName) {
		super();
		this.id = id;
		this.groupName = groupName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", groupName=" + groupName + "]";
	}
	

}
