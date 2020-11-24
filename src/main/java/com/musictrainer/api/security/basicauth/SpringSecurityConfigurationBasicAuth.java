//package com.musictrainer.api.security.basicauth;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///******
// * This Class is used to control security for requests coming from front end
// */
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter {
//
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        logger.info("SpringSecurityConfigurationBasicAuth");
//        System.out.println("In configure basic auth");
//
//        ((HttpSecurity)((HttpSecurity)((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)
//                http
//                        .cors()
//                        .and()
//                        .csrf().disable()
//                        .authorizeRequests()
//                            .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
//                            .anyRequest()
//        )
//                            .authenticated()
//                        .and()
//        )
//                //.formLogin().and()
//        )
//                            .httpBasic();
//    }
//}
//
