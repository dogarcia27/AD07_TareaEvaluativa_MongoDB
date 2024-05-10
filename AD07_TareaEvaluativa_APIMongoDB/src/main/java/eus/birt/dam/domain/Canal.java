package eus.birt.dam.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"name"
	})

@Data
@NoArgsConstructor
public class Canal {

	@JsonProperty("id")
	public String idCanal;
	@JsonProperty("name")
	public String nombreCanal;
	
}