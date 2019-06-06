/**
 * 
 */
package com.spring.boot.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.service.SubscriptionService;

/**
 * @author Abhijit Baokar
 *
 */
@RestController
public class SubscriptionController {

	@Autowired
	SubscriptionService subscriptionService;

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		return "Hello World!! Greetings from " + name + "!";
	}

	@RequestMapping(value = "/subscribe")
	public String subscribe(HttpServletRequest request) {
		String orderDetails = subscriptionService.getOrderDetails(request);
		String truncatedLog = subscriptionService.truncate(orderDetails, 25);
		System.out.println("Truncated log file: " + truncatedLog);
		return truncatedLog;
	}
}
