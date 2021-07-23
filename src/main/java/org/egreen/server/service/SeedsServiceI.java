package org.egreen.server.service;

import org.egreen.server.dto.SeedsReqDto;
import org.egreen.server.dto.SeedsRespDto;

/**
 * Interface for the seeds service component.
 * 
 * @author Sergio
 *
 */
public interface SeedsServiceI {
	
	/**
	 * Query a list of seeds.
	 * 
	 * @param req Request parameters.
	 * @return Response object.
	 */
	public SeedsRespDto getSeeds(SeedsReqDto req);
}
