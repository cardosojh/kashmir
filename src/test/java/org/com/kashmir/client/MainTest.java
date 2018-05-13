package org.com.kashmir.client;

public class MainTest {

	public static void main(String[] args) {
		
		RestfulClient restfulClient = new RestfulClient();

		/*
		 * POST ENTITY
		 */
		restfulClient.postEntity();

		/*
		 * GET ENTITY
		 */
		restfulClient.getEntity();

		/*
		 * PUT ENTITY
		 */
		restfulClient.putEntity();

		/*
		 * DELETE ENTITY
		 */
		restfulClient.deleteEntity();
	}

}