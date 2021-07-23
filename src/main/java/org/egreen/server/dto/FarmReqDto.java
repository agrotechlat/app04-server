package org.egreen.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Farm status DTO request.
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class FarmReqDto {
	private Integer idFarm;
	private Integer idWaterTray;
}
