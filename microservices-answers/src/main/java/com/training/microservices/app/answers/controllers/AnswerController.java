package com.training.microservices.app.answers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.microservices.app.answers.models.entity.Answer;
import com.training.microservices.app.answers.services.AnswerService;

@RestController
public class AnswerController {

	@Autowired
	private AnswerService answerService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Iterable<Answer> answers){
		return ResponseEntity.status(HttpStatus.CREATED).body(answerService.saveAll(answers));
	}
	
	@GetMapping("/student/{studentId}/test/{testId}")
	public ResponseEntity<?> getResponseByStudentByTest(@PathVariable Long studentId, @PathVariable Long testId){
		return ResponseEntity.ok(answerService.findAnswerByStudentByTest(studentId, testId));
	}
	
	@GetMapping("/student/{studentId}/tests-answered")
	public ResponseEntity<?> getTestsIdsWithAnswersByStudent(@PathVariable Long studentId){
		return ResponseEntity.ok(answerService.findTestsIdsWithAnswersByStudent(studentId));
	}
}