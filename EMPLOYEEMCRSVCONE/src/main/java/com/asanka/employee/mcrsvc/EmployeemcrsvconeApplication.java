package com.asanka.employee.mcrsvc;

import java.lang.reflect.Field;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jdk.internal.misc.Unsafe;

@SpringBootApplication
public class EmployeemcrsvconeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemcrsvconeApplication.class, args);
	}
	
	public static void disableWarning() {
	    try {
	        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
	        theUnsafe.setAccessible(true);
	        Unsafe u = (Unsafe) theUnsafe.get(null);

	        Class cls = Class.forName("jdk.internal.module.IllegalAccessLogger");
	        Field logger = cls.getDeclaredField("logger");
	        u.putObjectVolatile(cls, u.staticFieldOffset(logger), null);
	    } catch (Exception e) {
	        // ignore
	    }
	}
}