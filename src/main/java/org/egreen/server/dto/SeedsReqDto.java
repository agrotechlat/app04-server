package org.egreen.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Request DTO for query the list of available seeds that can be cultivated
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
public class SeedsReqDto {
	/**
	 * Seed name to search.
	 */
	private String name;
}
