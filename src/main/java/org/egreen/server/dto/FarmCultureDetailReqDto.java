package org.egreen.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Status of a culture tray DTO request.
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class FarmCultureDetailReqDto {
	/**
	 * ID of the farm.
	 */
	private Integer idFarm;
	
	/**
	 * ID of the water tray of culture that we want to know details.
	 */
	private Integer idCulture;
	
	/**
	 * ID of the tray of culture that we want to know details.
	 */
	private Integer idTray;
}
