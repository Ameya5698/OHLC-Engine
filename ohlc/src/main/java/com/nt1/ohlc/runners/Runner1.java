package com.nt1.ohlc.runners;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt1.ohlc.classes.Stock;

public class Runner1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper=new ObjectMapper();
		
		List<Stock> temp=mapper.readValue(new File("data/Stock List.json"),new TypeReference<List<Stock>>() {});
		
		Stock checker=temp.get(0);
		System.out.println(checker);
		

	}

}
