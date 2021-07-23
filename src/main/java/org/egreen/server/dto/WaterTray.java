package org.egreen.server.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * 
 * @author Sergio
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class WaterTray {
	
	private Integer id;
	private SeedDto seed;
	private List<CultureTray> trays;
}
