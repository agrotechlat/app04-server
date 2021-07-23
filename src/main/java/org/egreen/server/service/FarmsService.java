package org.egreen.server.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.egreen.server.dto.CultureTray;
import org.egreen.server.dto.FarmCultureDeleteReqDto;
import org.egreen.server.dto.FarmCultureDeleteRespDto;
import org.egreen.server.dto.FarmCultureDetailReqDto;
import org.egreen.server.dto.FarmCultureDetailRespDto;
import org.egreen.server.dto.FarmCultureNewReqDto;
import org.egreen.server.dto.FarmCultureNewRespDto;
import org.egreen.server.dto.FarmCultureUpdateRespDto;
import org.egreen.server.dto.FarmReqDto;
import org.egreen.server.dto.FarmRespDto;
import org.egreen.server.dto.SeedDto;
import org.egreen.server.dto.TraySeedReqDto;
import org.egreen.server.dto.TraySeedRespDto;
import org.egreen.server.dto.WaterTray;
import org.springframework.stereotype.Service;

/**
 * 
 * The farm service component.
 * 
 * @author Sergio
 *
 */
@Service
public class FarmsService implements FarmsServiceI {

	@Override
	public TraySeedRespDto changeSeed(TraySeedReqDto traySeedReqDto) {
		
		// Input and logic validations here.
		
		// update code to DB here.
		
		String msg = "";
		
		msg = "Seed has been updated";
		TraySeedRespDto resp = new TraySeedRespDto(msg);
		return resp;
	}

	@Override
	public FarmRespDto getWaterTrayStatus(FarmReqDto farmReqDto) {
		FarmRespDto resp = new FarmRespDto();
		
		// validate inputs and business rules
		
		// Database operations
		
		SeedDto seed = new SeedDto(1, "Lentils");
		List<CultureTray> trays = new ArrayList<CultureTray>(4);
		trays.add(new CultureTray(1, LocalDateTime.now(), 20, "seed"));
		trays.add(new CultureTray(2, LocalDateTime.now(), 40, "Sprout"));
		trays.add(new CultureTray(3, LocalDateTime.now(), 80, "Microgreen"));
		trays.add(new CultureTray(4, LocalDateTime.now(), 20, "Seed"));
		
		WaterTray waterTray = new WaterTray(farmReqDto.getIdWaterTray(), seed, trays);
		
		resp.setFarmId(farmReqDto.getIdFarm());
		resp.setTray(waterTray);
		
		return resp;
	}

	@Override
	public FarmCultureDetailRespDto getTrayStatus(FarmCultureDetailReqDto req) {
		
		// validate inputs and business rules
		
		// Database operations
		
		SeedDto seed = new SeedDto(1, "Lentils");
		
		FarmCultureDetailRespDto resp = new FarmCultureDetailRespDto(req.getIdTray(), LocalDateTime.now(), seed);
		return resp;
	}

	@Override
	public FarmCultureNewRespDto newCultureTray(FarmCultureNewReqDto req) {
		// validate inputs and business rules
		
		// Database operations
		
		FarmCultureNewRespDto resp = new FarmCultureNewRespDto(req.getIdTray());
		
		return resp;
	}

	@Override
	public FarmCultureUpdateRespDto updateCulture(FarmCultureNewReqDto req) {
		// validate inputs and business rules
		
		// Database operations
		
		FarmCultureUpdateRespDto resp = new FarmCultureUpdateRespDto(req.getIdTray());
		return resp;
	}

	@Override
	public FarmCultureDeleteRespDto deleteCultureTray(FarmCultureDeleteReqDto req) {
		// validate inputs and business rules
		
		// Database operations
		
		
		FarmCultureDeleteRespDto resp = new FarmCultureDeleteRespDto(req.getIdTray());
		return resp;
	}

}
