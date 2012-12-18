package com.mtea.deepclone.demo.deep;

import java.io.IOException;
import java.io.OptionalDataException;


public class DeepTest {

	public static void main(String[] args) throws CloneNotSupportedException, OptionalDataException, IOException, ClassNotFoundException {
		
		Dept d1 = new Dept(101, "研发部");
		
		Employee e1 = new Employee(1, "zhangsan",d1);

		//深拷贝,在e2中连d1也拷贝一份,不与e1共用d1
		Employee e2 = (Employee) e1.deepClone();
		
		//设置部门
		e2.getDept().setName("人事部");
		

		System.out.println("u1.toString(): " + e1.toString());
		System.out.println("u2.toString(): " + e2.toString());

	}

}