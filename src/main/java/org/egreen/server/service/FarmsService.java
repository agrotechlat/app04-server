package org.egreen.server.service;

import org.egreen.server.dto.TraySeedReqDto;
import org.egreen.server.dto.TraySeedRespDto;
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

}
