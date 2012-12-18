package com.mtea.deepclone.demo.shallow;

/**
 * @author macrotea@qq.com
 * @date 2012-12-18 下午11:47:55
 * @version 1.0
 * @note
 */
public class ShallowTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(1, "zhangsan");

		Student s2 = (Student) s1.clone();

		s2.setId(2);

		s2.setName("李四");

		//这个例子还不能证明clone是浅拷贝,毕竟Student类的属性都是基本数据类型,请参考ShallowTest2
		System.out.println("s1.toString(): " + s1.toString());
		System.out.println("s2.toString(): " + s2.toString());

	}

}
