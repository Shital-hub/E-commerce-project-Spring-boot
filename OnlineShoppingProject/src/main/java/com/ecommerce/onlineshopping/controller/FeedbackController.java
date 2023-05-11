package com.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Feedback;
import com.ecommerce.onlineshopping.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/save")
	public ResponseEntity<Feedback> addFeddbackMessage(@RequestBody Feedback feedback) {
		Feedback addFeedback = feedbackService.addFeddbackMessage(feedback);
	
		return ResponseEntity.status(HttpStatus.CREATED).body(addFeedback);
		
		}

}
