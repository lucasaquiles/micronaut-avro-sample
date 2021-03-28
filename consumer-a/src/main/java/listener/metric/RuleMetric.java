package listener.metric;

import io.micrometer.core.instrument.Counter;
import io.micrometer.newrelic.NewRelicMeterRegistry;
import listener.RuleVO;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RuleMetric {

    @Inject
    private NewRelicMeterRegistry newRelicMeterRegistry;

    public void increment(RuleVO ruleVO) {

        Counter.builder("rule.counter")
                .tag("type", "rule")
                .tag("ruleName", ruleVO.getName())
                .tag("rule", ruleVO.getRule())
                .description("Rules criadas")
                .register(newRelicMeterRegistry).increment();

    }
}
