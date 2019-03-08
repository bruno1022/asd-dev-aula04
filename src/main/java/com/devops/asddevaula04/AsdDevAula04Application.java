package com.devops.asddevaula04;

import java.util.TreeMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author bruno / felipe
 * Programa que converte um número entre 1 e 3.000 para o formato romano.
 *
 */
@SpringBootApplication
public class AsdDevAula04Application {
	
	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	
	static {

        map.put(1000, "M");
        //map.put(900, "CM");
        map.put(500, "D");
        //map.put(400, "CD");
        map.put(100, "C");
        //map.put(90, "XC");
        map.put(50, "L");
        //map.put(40, "XL");
        map.put(10, "X");
        //map.put(9, "IX");
        map.put(5, "V");
        //map.put(4, "IV");
        map.put(1, "I");

    }
	
	public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

	public static void main(String[] args) {
		
		SpringApplication.run(AsdDevAula04Application.class, args);
		
		System.out.println(3000+"\t =\t "+AsdDevAula04Application.toRoman(3000));   
	    
	}

}
