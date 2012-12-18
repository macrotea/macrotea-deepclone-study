package com.mtea.deepclone.demo.shallow2;


/**
 * @author macrotea@qq.com
 * @date 2012-12-18 下午11:47:55
 * @version 1.0
 * @note
 */
public class ShallowTest2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Group g1 = new Group(101, "java小组");
		
		User u1 = new User(1, "zhangsan",g1);

		User u2 = (User) u1.clone();

		u2.setId(2);

		u2.setName("李四");
		
		//切换User类的clone()的注释,可以辨别深浅克隆
		u2.getGroup().setGroupName("c小组");

		System.out.println("u1.toString(): " + u1.toString());
		System.out.println("u2.toString(): " + u2.toString());

	}

}
