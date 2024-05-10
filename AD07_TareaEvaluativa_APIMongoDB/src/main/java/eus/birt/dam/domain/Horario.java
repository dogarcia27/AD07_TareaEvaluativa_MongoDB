package eus.birt.dam.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"time",
	"days"
})

@Data
@NoArgsConstructor
public class Horario {
	
	@JsonProperty("time")
	public String hora;
	@JsonProperty("days")
    public String dias;
	  
}
