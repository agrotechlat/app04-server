package org.egreen.server.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CultureTray {
	private Integer idTray;
	private LocalDateTime startDate;
	private Integer progress;
	private String stage;
}
