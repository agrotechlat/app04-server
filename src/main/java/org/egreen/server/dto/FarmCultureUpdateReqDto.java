package org.egreen.server.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Delete culture tray DTO request.
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class FarmCultureUpdateReqDto {
	private Integer idTray;
	private LocalDate startDate;
	private LocalTime startTime; 
	private Integer idSeed;
}
