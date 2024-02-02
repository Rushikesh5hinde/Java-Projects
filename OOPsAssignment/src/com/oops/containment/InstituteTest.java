package com.oops.containment;

import java.util.Scanner;

public class InstituteTest {
	Scanner sc=new Scanner(System.in);
	public void enterInstituteDetails(Institute i) {
		System.out.println("Enter institute id");
		i.setInstId(sc.nextInt());
		System.out.println("Enter institute name");
		i.setInstName(sc.next());
		
		Branch b=new Branch();
		System.out.println("Enter branch id");
		b.setBid(sc.nextInt());
		System.out.println("Enter branch name");
		b.setBname(sc.next());
		
		Subject s1=new Subject();
		System.out.println("Enter subject id:");
		s1.setSid(sc.nextInt());
		System.out.println("Enter subject name");
		s1.setSname(sc.next());
		
		Topic t1=new Topic();
		System.out.println("Enter topic id");
		t1.setTopicid(sc.nextInt());
		System.out.println("Enter topic name");
		t1.setTopicname(sc.next());
		
		SubTopic st=new SubTopic();
		System.out.println("Enter subtopic id");
		st.setSubid(sc.nextInt());
		System.out.println("Enter subtopic name");
		st.setSubname(sc.next());
		
		Question q=new Question();
		System.out.println("Enter question id:");
		q.setQid(sc.nextInt());
		System.out.println("Enter question name");
		q.setQname(sc.next());
		
		st.setQuestion(q);
		t1.setSubTopic(st);
		s1.setTopic(t1);
		b.setSubject(s1);
		i.setBranch(b);
	}
	public static void main(String[] args) {
		InstituteTest obj=new InstituteTest();
		Institute i=new Institute();
		obj.enterInstituteDetails(i);
		System.out.println(i);
	}
}
