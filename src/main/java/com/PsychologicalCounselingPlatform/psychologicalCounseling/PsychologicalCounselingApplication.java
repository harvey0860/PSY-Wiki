package com.PsychologicalCounselingPlatform.psychologicalCounseling;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.PsychologicalCounselingPlatform.PsychologicalCounseling.mapper")
public class PsychologicalCounselingApplication {

	private static final Logger LOG = LoggerFactory.getLogger(PsychologicalCounselingApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(PsychologicalCounselingApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("App started！！");
		LOG.info("Address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}
}

