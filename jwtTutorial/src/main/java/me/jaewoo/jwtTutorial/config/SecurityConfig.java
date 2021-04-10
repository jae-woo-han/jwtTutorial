package me.jaewoo.jwtTutorial.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity //기본적 웹보안 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {//추가 설정을 위해서는 WebSecurityConfigurer를 implement or WebSecurityConfigurerAdapter extends

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/api/hello").permitAll()
			.anyRequest().authenticated();
	}
}