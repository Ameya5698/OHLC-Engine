package com.nt1.ohlc.configs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt1.ohlc.classes.Stock;

@Configuration
public class Beanhelper {

	@Bean
	public List<Stock> filledList()
	{
		
		ObjectMapper mapper=new ObjectMapper();
		List<Stock> temp=null;
		try {
			temp=mapper.readValue(new File("data/Stock List.json"),new TypeReference<List<Stock>>() {});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
		
		
	}
}
