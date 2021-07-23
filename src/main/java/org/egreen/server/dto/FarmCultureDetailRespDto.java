package org.egreen.server.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Status of a culture tray DTO response.
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class FarmCultureDetailRespDto {
	/**
	 * ID of the tray of culture that we want to know details.
	 */
	private Integer idTray;
	
	/**
	 * Date and time of when the culture started.
	 */
	private LocalDateTime startDate;
	
	/**
	 * Seed details.
	 */
	private SeedDto seed;
}
