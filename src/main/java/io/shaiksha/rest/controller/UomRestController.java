package io.shaiksha.rest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import io.shaiksha.Uom;
import io.shaiksha.UomFeignClient;
@RestController
public class UomRestController {
	
	   @Autowired
	   private UomFeignClient feign;
	
	   @SuppressWarnings("unchecked")
	   @GetMapping("/getAllUoms")
	   public List<Uom> getAllUoms(){
		   return feign.getAllUoms();
	   }
	   
	/*   
	   @PostMapping("/saveUom")
	   public String saveUom(@RequestBody Uom uom) {
		   return template.postForObject("http://UOM-SERVICE/api/uoms", uom, String.class);
	   }*/
}
