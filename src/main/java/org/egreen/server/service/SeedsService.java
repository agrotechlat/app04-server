package org.egreen.server.service;

import java.util.ArrayList;
import java.util.List;

import org.egreen.server.dto.SeedDto;
import org.egreen.server.dto.SeedsReqDto;
import org.egreen.server.dto.SeedsRespDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Seeds service component for seeds related queries.
 * 
 * @author Sergio
 *
 */
@Service
public class SeedsService implements SeedsServiceI {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public SeedsRespDto getSeeds(SeedsReqDto req) {
		List<SeedDto> seedsList = new ArrayList<>();		
		seedsList.add(new SeedDto(1, "Lentils"));
		seedsList.add(new SeedDto(2, "Chia"));
		seedsList.add(new SeedDto(3, "Weat"));
		seedsList.add(new SeedDto(4, "Flax"));
		SeedsRespDto resp = new SeedsRespDto(seedsList);		
		return resp;
	}

}
