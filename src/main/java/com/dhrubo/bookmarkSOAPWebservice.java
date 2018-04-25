package com.dhrubo;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication
public class bookmarkSOAPWebservice{

  public static void main(String[] args) {
    SpringApplication.run(bookmarkSOAPWebservice.class, args);
  }
}