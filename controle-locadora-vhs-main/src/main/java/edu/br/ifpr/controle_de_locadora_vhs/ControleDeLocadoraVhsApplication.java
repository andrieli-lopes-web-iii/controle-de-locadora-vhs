package edu.br.ifpr.controle_de_locadora_vhs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ControleDeLocadoraVhsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDeLocadoraVhsApplication.class, args);
	}
	 @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();

	}
}
