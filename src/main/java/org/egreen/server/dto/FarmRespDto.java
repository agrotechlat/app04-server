package org.egreen.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Farm status DTO response.
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class FarmRespDto {
	private Integer farmId;
	private WaterTray tray;
}
