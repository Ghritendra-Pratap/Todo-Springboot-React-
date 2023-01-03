package com.example.demo.Security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;



import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Springsecurity {
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
       
        return new InMemoryUserDetailsManager(
        		User.withUsername("user")
        		.password("{noop}password")
                .roles("USER")
                .build()
                );
    }
	
	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	       return http
	    		   .csrf(csrf -> csrf.disable())
	    		   
	            .authorizeRequests(auth -> {
	            	auth.antMatchers("/").permitAll();
	            	auth.antMatchers("/formtasks").hasRole("USER");
	            })
	            
	            .httpBasic(Customizer.withDefaults())
	            .build();
	       		
	    }
}


