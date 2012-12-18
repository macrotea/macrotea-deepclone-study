package com.mtea.deepclone.demo.deep;

import java.io.Serializable;

/**
 * @author macrotea@qq.com
 * @date 2012-12-19 上午12:06:50
 * @version 1.0
 * @note
 */
public class Dept implements Cloneable,Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	public Dept() {
		super();
	}

	public Dept(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
	}

}
