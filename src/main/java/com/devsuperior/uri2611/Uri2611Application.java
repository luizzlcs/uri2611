package com.devsuperior.uri2611;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2611.dto.MovieDTO;
import com.devsuperior.uri2611.projection.MovieProjectionMin;
import com.devsuperior.uri2611.repositories.MovieRepository;

@SpringBootApplication
public class Uri2611Application implements CommandLineRunner {

	@Autowired
	MovieRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Uri2611Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		List<MovieProjectionMin> list= repository.seach1("Action");
		List<MovieDTO> list1 = list.stream().map(x -> new MovieDTO(x)).collect(Collectors.toList());

		System.out.println("\n RESULTADO SQL RAÍZ");	
		for (MovieDTO obj : list1) {
			// System.out.print(obj);
			System.out.print(obj.getId());
			System.out.println(" - "+ obj.getName());
		}


			
		List<MovieDTO> list2= repository.seach2("Action");
		
		System.out.println("\n RESULTADO JPQL");
		for (MovieDTO obj : list2) {
			// System.out.print(obj);
			System.out.print(obj.getId());
			System.out.println(" - "+ obj.getName());
		}

	}
}
