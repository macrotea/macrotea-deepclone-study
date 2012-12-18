package com.mtea.deepclone.demo.shallow;

/**
 * @author macrotea@qq.com
 * @date 2012-12-18 下午11:45:31
 * @version 1.0
 * @note
 */
public class Student implements Cloneable{

	private int id;

	private String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
