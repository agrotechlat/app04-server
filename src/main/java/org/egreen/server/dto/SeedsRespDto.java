package org.egreen.server.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Response DTO for query the list of available seeds that can be cultivated
 * and have a recipe.
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class SeedsRespDto {
	
	/**
	 * LIst of available seeds.
	 */
	private List<SeedDto> seeds;
}
