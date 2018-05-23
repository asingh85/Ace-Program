package com.bitboffin.java8.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.bitboffin.java8.stream.StreamSamples.Gender;
import com.bitboffin.java8.stream.StreamSamples.Person;

/**
 * 
 * @author Singh, Amandeep
 *
 */
public class StreamFilteringExample {
	public static void main(String[] args) {
		List<String> names = DataStub.getNames();
		names.stream().filter((name) -> names.equals("Gaurav")).findFirst()
		    .ifPresent(System.out::println);

		Collection<Person> persons = StreamSamples.getPersons();
		List<Person> allMales = persons.stream().filter(p -> p.getGender() == Gender.MALE)
		    .collect(Collectors.toList());
		System.out.println(allMales);
	}
}
