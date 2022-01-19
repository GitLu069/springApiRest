package com.payrollproject.payroll;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
class LoadDataBase {
    private static final Logger log= LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){

        return args -> {
            log.info("Prechargement"+ repository.save(new Employee("Lucas Vincent","bijoutier")));
            log.info("Prechargement"+ repository.save(new Employee("Clement Vincent","commercial")));
            log.info("Prechargement"+ repository.save(new Employee("Didjan Shanoun","dev")));
            log.info("Prechargement"+ repository.save(new Employee("Andrea Puerto","leadtech")));
        };
    }
}
