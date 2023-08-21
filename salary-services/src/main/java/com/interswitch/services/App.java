package com.interswitch.services;

import com.interswitch.services.model.Salary;
import com.interswitch.services.repository.SalaryRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info =
@Info(title = "Salary API", version = "1.0", description = "Documentation Salary API v1.0")
)
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Bean
    SalaryRepository repository() {
        SalaryRepository repository = new SalaryRepository();
        repository.add(new Salary(1L, 2000D, LocalDate.of(2023, 8, 15), null));
        repository.add(new Salary(1L, 4000D, LocalDate.of(2023, 8, 14), null));
        repository.add(new Salary(2L, 3000D, LocalDate.of(2023, 8, 13), null));
        return repository;
    }
}
