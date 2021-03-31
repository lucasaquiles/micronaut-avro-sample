package dev4fun.consumerb;

import dev4fun.consumerb.service.RuleService;
import dev4fun.consumerb.service.RuleVO;
import dev4fun.rule.RuleCreated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class ConsumerBApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConsumerBApplication.class, args);
	}

	// input, output
	@Bean
	public Function<RuleCreated, RuleVO> ruleAnalizer(RuleService ruleService) {

		return ruleService::proccess;
	}
}
