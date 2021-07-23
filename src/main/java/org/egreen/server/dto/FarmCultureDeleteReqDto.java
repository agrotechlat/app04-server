package org.egreen.server.dto;

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
public class FarmCultureDeleteReqDto {
	private Integer idFarm;
	private Integer idCulture;
	private Integer idTray;
}
