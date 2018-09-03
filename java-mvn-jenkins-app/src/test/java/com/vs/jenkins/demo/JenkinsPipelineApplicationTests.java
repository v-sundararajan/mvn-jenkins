package com.vs.jenkins.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vs.jenkins.demo.controller.AppController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsPipelineApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void sampleJunit() {
		AppController appController = new AppController();
		assertThat(appController.forJunitOnly()).isEqualToIgnoringNewLines("hello-world");
	}
}
