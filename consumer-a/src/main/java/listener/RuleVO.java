package listener;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class RuleVO {

    private String name;
    private String rule;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RuleVO{" +
                "name='" + name + '\'' +
                ", rule='" + rule + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
