package org.egreen.server.controller;

import org.egreen.server.dto.FarmReqDto;
import org.egreen.server.dto.FarmRespDto;
import org.egreen.server.dto.TraySeedReqDto;
import org.egreen.server.dto.TraySeedRespDto;
import org.egreen.server.service.FarmsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for services related with the farms.
 * 
 * @author Sergio
 *
 */
@RestController
@RequestMapping("/api/v1")
public class FarmController {
	
	/**
	 * Service for farms operations.
	 */
	@Autowired
	FarmsServiceI farmsService;
	
	/**
	 * Update the Water tray seed that has assigned.
	 * 
	 * @param idFarm Unique identifier of the farm.
	 * @param traySeedReqDto Seed data that will be assigned as current seed.
	 * @return Response data after correctly update the current seed.
	 */
	@PutMapping("/farms/{idFarm}/seed")
	public @ResponseBody ResponseEntity<TraySeedRespDto> changeSeedTRay(@PathVariable Integer idFarm, @RequestBody TraySeedReqDto traySeedReqDto) {
		return new ResponseEntity<TraySeedRespDto>(farmsService.changeSeed(traySeedReqDto),HttpStatus.OK);
	}
	
	/**
	 * Get the complete status of a water tray.
	 * 
	 * @param idFarm Unique identifier of the farm.
	 * @param idWaterTray Unique identifier of a Water tray.
	 * @return CUrren status of a specific water tray.
	 */
	@GetMapping("/farms/{idFarm}")
	public @ResponseBody ResponseEntity<FarmRespDto> waterTrayStatus(@PathVariable Integer idFarm, @RequestParam Integer idWaterTray) {
		FarmReqDto req = new FarmReqDto(idFarm, idWaterTray);
		return new ResponseEntity<FarmRespDto>(farmsService.getWaterTrayStatus(req), HttpStatus.OK);
	}
}
