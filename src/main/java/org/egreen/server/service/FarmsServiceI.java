package org.egreen.server.service;

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

}
