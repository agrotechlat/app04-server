package org.egreen.server.controller;

import org.egreen.server.dto.SeedsReqDto;
import org.egreen.server.dto.SeedsRespDto;
import org.egreen.server.service.SeedsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * REST Controller for services related with the seeds.
 * 
 * @author Sergio
 *
 */
@RestController
@RequestMapping("/api/v1")
public class SeedController {
	
	/**
	 * Service for seeds operations.
	 */
	@Autowired
	SeedsServiceI seedsService;

	/**
	 * Query a list of seeds.
	 * 
	 * @param name Pattern name to search.
	 * @return A list of seeds whose name matches the search pattern.
	 */
	@GetMapping("/seeds")
	public @ResponseBody ResponseEntity<SeedsRespDto> seeds(@RequestParam(required = false) String name) {
		SeedsReqDto req = new SeedsReqDto(name);
		return new ResponseEntity<SeedsRespDto>(seedsService.getSeeds(req), HttpStatus.OK);
	}
}
