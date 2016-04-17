package pl.sparkmedia.springbootstarter.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Maciej Lesniak / Spark Media
 * @version 16.04.2016
 */
@RestController
@RequestMapping("/")
public class Hello {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ApplicationContext applicationContext;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<?> index() {
		log.debug("log log DEBUG");
		log.error("log log ERROR");
		log.info("log log INFO");
		log.warn("log log WARN");
		log.trace("log log TRACE");
		ArrayList<String> components = new ArrayList<>(Arrays.asList(applicationContext.getBeanDefinitionNames()));
		return new ResponseEntity<>(components, HttpStatus.OK);
	}

}
