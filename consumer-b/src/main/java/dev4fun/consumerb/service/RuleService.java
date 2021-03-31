package dev4fun.consumerb.service;

import dev4fun.rule.RuleCreated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RuleService {

    Logger log = LoggerFactory.getLogger(RuleService.class);

    public RuleVO proccess(final RuleCreated ruleCreated) {

        log.info("ruleAnalizer, ruleCreated={}", ruleCreated);

        final RuleVO ruleVO = new RuleVO();

        ruleVO.setDescription(ruleCreated.getDescription().toString());
        ruleVO.setRule(ruleCreated.getRule().toString());
        ruleVO.setRuleName(ruleCreated.getRuleName().toString());

        return ruleVO;
    }
}
