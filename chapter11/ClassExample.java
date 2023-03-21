package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

import chapter10.Member;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class<Member> clazz = Member.class;
		Class clazz1 = Class.forName("chapter10.Member");
	
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		System.out.println(clazz.getDeclaredFields());
		
		
		Constructor[] constructor =clazz.getConstructors();
		Member member = null;
		
		
		Field[] fields =  clazz.getDeclaredFields();
		
		
		
		for(Field field : fields) {
			System.out.println("필드명: "+ field.getName());
			System.out.println("필드 타입: "+ field.getType());
		}
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("메소드 명: "+ method.getName());
			System.out.println("메소드 타입: "+ method.getReturnType());			
		}
		

	}

}
