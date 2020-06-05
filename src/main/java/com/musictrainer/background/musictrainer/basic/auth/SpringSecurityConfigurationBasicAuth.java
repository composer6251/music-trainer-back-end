package com.musictrainer.background.musictrainer.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.web.bind.annotation.CrossOrigin;

/******
 * This Class is used to control security for requests coming from front end
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        System.out.println("Configure");
        http.cors();

//        //((HttpSecurity)((HttpSecurity)((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)
//                http
//                        .csrf().disable()
//                        .authorizeRequests()
//                        .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
//                                .anyRequest()//)
//                                .authenticated()
//                                .and()//)
//                //.formLogin().and()
//      //  )
//                            .httpBasic();
    }
}
