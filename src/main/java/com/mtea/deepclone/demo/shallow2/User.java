package com.mtea.deepclone.demo.shallow2;

/**
 * @author macrotea@qq.com
 * @date 2012-12-18 下午11:50:51
 * @version 1.0
 * @note
 */
public class User implements Cloneable {

	private int id;

	private String name;

	private Group group;

	public User() {
		super();
	}

	public User(int id, String name, Group group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	

	@Override
	public Object clone() throws CloneNotSupportedException {
		User newUser = (User) super.clone();
		//若取消注释则深克隆
		newUser.setGroup((Group)group.clone());
		return newUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", group=" + group + "]";
	}

}
