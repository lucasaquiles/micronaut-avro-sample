package producer;

import dev4fun.rule.RuleCreated;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.messaging.annotation.Body;

@KafkaClient(
        id="rule-producer"
)
public interface RuleProducer {

    @Topic("rule-created")
    void publishrule(@Body  RuleCreated ruleCreated);
}