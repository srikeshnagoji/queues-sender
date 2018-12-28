package com.nt.activemq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.activemq.jms.producer.JmsProducer;


@SpringBootApplication
public class SpringBootActiveMqApplication implements CommandLineRunner {//{//here
	//here
	@Autowired
	JmsProducer producer;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootActiveMqApplication.class, args);
	}
	//run method added for hash map here
	@Override
	public void run(String... args) throws Exception {
		
		 HashMap<String,Object> hm=new HashMap<String,Object>();
		 hm.put("tin",5555);    
	     hm.put("ecn_1",789);    
	     hm.put("dob_1","12-Jan-54");
	     hm.put("name_1","akarsha");
	     hm.put("ecn_2",7867);
	     hm.put("dob_2","11-Feb-98");
	      
	      
		List hmlist = new ArrayList(Arrays.asList(hm));
		
		
		// send message to ActiveMQ
		producer.send(hmlist);
        
        
	}
}
