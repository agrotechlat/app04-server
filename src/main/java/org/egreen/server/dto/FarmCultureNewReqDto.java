package org.egreen.server.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * New culture tray DTO response.
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class FarmCultureNewReqDto {
	private Integer idFarm;
	private Integer idCulture;
	private Integer idTray;
	
	private LocalDate startDate;
	private LocalTime startTime; 
}
