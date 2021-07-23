package org.egreen.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Request DTO to change the configured seed of a determined culture tray.
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class TraySeedReqDto {
	
	/**
	 * Unique identifier of the farm.
	 */
	private Integer idFarm;
	
	/**
	 * The new seed that we want set as actual seed.
	 */
	private SeedDto seed;
}
