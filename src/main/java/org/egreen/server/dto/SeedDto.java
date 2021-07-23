/**
 * 
 */
package org.egreen.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO that represent a seed.
 * 
 * @author inku
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SeedDto {
	
	/** Unique ID of the seed */
	private  Integer idSeed;
	
	/** Seed name **/
	private String seedName;
}
