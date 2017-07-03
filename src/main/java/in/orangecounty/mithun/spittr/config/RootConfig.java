package in.orangecounty.mithun.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by mithun on 7/3/17.
 */
@Configuration
@ComponentScan(basePackages={"in.orangecounty.mithun.spittr"},
        excludeFilters={
                @Filter(type= FilterType.ANNOTATION, value=EnableWebMvc.class)
        })
public class RootConfig {
}
