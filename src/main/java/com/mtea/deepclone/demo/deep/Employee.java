package com.mtea.deepclone.demo.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 * @author macrotea@qq.com
 * @date 2012-12-18 下午11:50:51
 * @version 1.0
 * @note
 */
public class Employee implements Cloneable,Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private Dept dept;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	/**
	 * 深拷贝
	 * @author macrotea@qq.com
	 * @date 2012-12-19 上午12:09:49
	 * @return
	 */
	public Object deepClone() throws IOException,OptionalDataException, ClassNotFoundException
	{
		// 将对象写到流里
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		// 从流里读出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (oi.readObject());
	}
}
