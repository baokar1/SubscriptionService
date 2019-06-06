package com.spring.boot.service;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author Abhijit Baokar
 *
 */
public interface SubscriptionService {
	public String getOrderDetails(HttpServletRequest request);
	public String truncate(String orderDetails, int numberOfCharacters);
}
