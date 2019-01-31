package io.shaiksha;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="UOM-SERVICE")
public interface UomFeignClient {
	@GetMapping("/api/uoms")
	public List<Uom> getAllUoms();
}
