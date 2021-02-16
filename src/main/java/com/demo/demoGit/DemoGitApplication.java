package com.demo.demoGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGitApplication.class, args);
		DemoGit demoGit = new DemoGit();
		//trying to create a conflict again
		DemoGit demoGit2 = new DemoGit();
		DemoGit demoGit4 = new DemoGit();
		DemoGit demoGit1 = new DemoGit();
		//i am trying to create a merge conflict
		System.out.println("Hello there!");
	}
}
