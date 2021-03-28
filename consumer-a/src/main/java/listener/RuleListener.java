package listener;

import dev4fun.rule.RuleCreated;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.messaging.annotation.Body;
import listener.metric.RuleMetric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@KafkaListener(offsetReset = OffsetReset.EARLIEST, groupId = "consumer-a")
public class RuleListener {

    public static final Logger log = LoggerFactory.getLogger(RuleListener.class);

    @Inject
    private RuleMetric ruleMetric;

    @Topic("rule-created")
    public void receive(@Body RuleCreated ruleCreated) {
        log.info("recive: event={}", ruleCreated);

        final RuleVO ruleVO = new RuleVO();

        ruleVO.setDescription(ruleCreated.getDescription().toString());
        ruleVO.setName(ruleCreated.getRuleName().toString());
        ruleVO.setRule(ruleCreated.getRule().toString());

        ruleMetric.increment(ruleVO);

        log.info("recive: rule={}", ruleVO);
    }

}