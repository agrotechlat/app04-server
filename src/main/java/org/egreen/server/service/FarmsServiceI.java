package org.egreen.server.service;

import org.egreen.server.dto.FarmCultureDeleteReqDto;
import org.egreen.server.dto.FarmCultureDeleteRespDto;
import org.egreen.server.dto.FarmCultureDetailReqDto;
import org.egreen.server.dto.FarmCultureDetailRespDto;
import org.egreen.server.dto.FarmCultureNewReqDto;
import org.egreen.server.dto.FarmCultureNewRespDto;
import org.egreen.server.dto.FarmCultureUpdateRespDto;
import org.egreen.server.dto.FarmReqDto;
import org.egreen.server.dto.FarmRespDto;
import org.egreen.server.dto.TraySeedReqDto;
import org.egreen.server.dto.TraySeedRespDto;

/**
 * Interface for the farm service component.
 * 
 * @author Sergio
 *
 */
public interface FarmsServiceI {

	/**
	 * Change the seed of a tray.
	 * 
	 * @param traySeedReqDto Data to execute a change of seed
	 * @return Change seed result.
	 */
	public TraySeedRespDto changeSeed(TraySeedReqDto traySeedReqDto);
	
	public FarmRespDto getWaterTrayStatus(FarmReqDto farmReqDto);

	public FarmCultureDetailRespDto getTrayStatus(FarmCultureDetailReqDto req);

	public FarmCultureNewRespDto newCultureTray(FarmCultureNewReqDto req);

	public FarmCultureUpdateRespDto updateCulture(FarmCultureNewReqDto req);

	public FarmCultureDeleteRespDto deleteCultureTray(FarmCultureDeleteReqDto req);

}
