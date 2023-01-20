package ch.wasuremono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class WasuremonoApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(WasuremonoApplication.class, args);
	}

	/*
	 * 사용자 언어 환경을 설정해주기 위한 bean 설정
	 */
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
//		slr.setDefaultLocale(Locale.KOREA);      // <---- 해당 값을 수정하여 언어 결정
		return slr;
	}

	@Bean  // 2 LocaleChangeInterceptor
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

	@Override // 3 addInterceptors: WebMvcConfigurer에 있는 것을 구현한 것
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}
}

