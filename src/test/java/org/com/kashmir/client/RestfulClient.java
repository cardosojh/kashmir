package org.com.kashmir.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestfulClient {

	private RestTemplate restTemplate;
	
	private static final String URL_SERVICE = "http://localhost:8080/customer";
	
	public RestfulClient(){
		restTemplate = new RestTemplate();
	}
	
	/**
	 * post entity
	 */
	public void postEntity(){
		System.out.println("Begin /POST request!");
		String postUrl = URL_SERVICE + "/post";
		Customer customer = new Customer(123, "Jack", 23);
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, customer, String.class);
		System.out.println("Response for Post Request: " + postResponse.getBody());
	}
	
	
	/**
	 * get entity
	 */
	public void getEntity(){
		System.out.println("Begin /GET request!");
		String getUrl = URL_SERVICE + "/get?id=1&name='Mary'&age=20";
		ResponseEntity<Customer> getResponse = restTemplate.getForEntity(getUrl, Customer.class);
		if(getResponse.getBody() != null){
			System.out.println("Response for Get Request: " + getResponse.getBody().toString());	
		}else{
			System.out.println("Response for Get Request: NULL");
		}
	}
	
	/**
	 * put entity
	 */
	public void putEntity(){
		System.out.println("Begin /PUT request!");
		String putUrl = URL_SERVICE + "/put/2";
		Customer puttCustomer = new Customer("Bush", 23);
		restTemplate.put(putUrl, puttCustomer);
	}
	
	/**
	 * delete entity
	 */
	public void deleteEntity(){
		System.out.println("Begin /DELETE request!");
		String deleteUrl = URL_SERVICE + "/delete/1";
		restTemplate.delete(deleteUrl);
	}
}
