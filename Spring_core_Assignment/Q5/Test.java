package com.spring.ResAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.ResAnno2.Employee;
import com.spring.ResAnno2.Person;
import com.spring.ResAnno2.StuHolder;
import com.spring.ResAnno2.Account;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee employee = context.getBean("employee", Employee.class);
		
		System.out.println("1)Employee Id: "+employee.getEmployeeId()+"\t"+"2)Employee name: "+employee.getEmployeeName());
		
		System.out.println("------------------------");
		
		Account account = employee.getAccount();
		if(account != null)
		System.out.println("1)Employee name: "+account.getAccHolderName()+"\t"+"2)account number: "+account.getAccNo());
		else
			System.out.println("Account info is not available...");
		((AbstractApplicationContext) context).close();
		
        System.out.println("-----------------------------");

		ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
		StuHolder studentHolder = (StuHolder) context1.getBean("studentHolder");
        studentHolder.displayStudentDetails();
        
        System.out.println("-----------------------------");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
        
        Person person1 = (Person) context2.getBean("person");
        System.out.println("Name of a person : " + person1.getName() );
        System.out.println("Age of a person : " + person1.getAge() );
     }
	}


