package dev4fun.api;

import dev4fun.service.RuleService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import javax.validation.Valid;

@Controller("/rule")
public class RuleController {

    @Inject
    private RuleService ruleService;

    @Post("/")
    public HttpResponse<RuleVO> createRole(@Body @Valid RuleVO ruleVo) {

        ruleService.publisRule(ruleVo);

        return HttpResponse.status(HttpStatus.CREATED)
                .body(ruleVo);
    }
}
