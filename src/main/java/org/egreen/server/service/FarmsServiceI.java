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
	 * Get current status of a water tray.
	 * 
	 * @param farmReqDto Parameters required to perform the query.
	 * @return The data of a water tray.
	 */
	public FarmRespDto getWaterTrayStatus(FarmReqDto farmReqDto);
	
	/**
	 * Change the seed of a water tray.
	 * 
	 * @param traySeedReqDto Data to execute a change of seed
	 * @return Change seed result.
	 */
	public TraySeedRespDto changeSeed(TraySeedReqDto traySeedReqDto);

	/**
	 * Get current culture tray status.
	 * 
	 * @param req Parameters required to perform the query.
	 * @return The data of a culture tray.
	 */
	public FarmCultureDetailRespDto getTrayStatus(FarmCultureDetailReqDto req);

	/**
	 * New culture in a culture tray.
	 * 
	 * @param req Parameters required to create a culture in a tray.
	 * @return Create confirmation data.
	 */
	public FarmCultureNewRespDto newCultureTray(FarmCultureNewReqDto req);

	/**
	 * Update the culture data of a culture tray.
	 * 
	 * @param req Parameters required to update the data.
	 * @return Update confirmation data
	 */
	public FarmCultureUpdateRespDto updateCulture(FarmCultureNewReqDto req);

	/**
	 * Delete an culture tray.
	 * 
	 * @param req Parameters required to delete a culture in a tray.
	 * @return Delete confirmation data.
	 */
	public FarmCultureDeleteRespDto deleteCultureTray(FarmCultureDeleteReqDto req);

}
