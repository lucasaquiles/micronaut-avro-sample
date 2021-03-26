package dev4fun.service;


import dev4fun.api.RuleVO;
import dev4fun.rule.RuleCreated;
import producer.RuleProducer;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RuleServiceImpl implements RuleService{

    @Inject
    RuleProducer producer;

    @Override
    public RuleVO publisRule(RuleVO ruleVO) {

        final RuleCreated ruleCreatedEvent = RuleCreated.newBuilder()
                .setRuleName(ruleVO.getName())
                .setRule(ruleVO.getRule())
                .setDescription(ruleVO.getDescription())
                .build();

        producer.publishrule(ruleCreatedEvent);

        return ruleVO;
    }
}
