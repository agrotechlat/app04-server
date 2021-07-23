package org.egreen.server.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.egreen.server.dto.SeedDto;
import org.egreen.server.dto.SeedsReqDto;
import org.egreen.server.dto.SeedsRespDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * Test for seed service component.
 * 
 * @author Sergio
 *
 */
@SpringBootTest
class SeedsServiceTest {
	
	/**
	 * Autowire in the service we want to test.
	 */
	@Autowired
	private SeedsService seedsService;
	
	// @MockBean
	// private DataRepository repository;

	@Test
	@DisplayName("Test getSeeds Success")
	void testGetSeeds() {
		String seedName = "";
		SeedsReqDto req = new SeedsReqDto(seedName);
		
		
		List<SeedDto> seedsList = new ArrayList<>();		
		seedsList.add(new SeedDto(1, "Lentils"));
		seedsList.add(new SeedDto(2, "Chia"));
		seedsList.add(new SeedDto(3, "Weat"));
		seedsList.add(new SeedDto(4, "Flax"));
		SeedsRespDto resp = new SeedsRespDto(seedsList);
		
		
		
		// Execute the service call
		SeedsRespDto returnedSeedList = seedsService.getSeeds(req);
		
		
	}

}
