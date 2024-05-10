package eus.birt.dam.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import lombok.AllArgsConstructor;
import lombok.Data;


//Solo se incluirán en el JSON las propiedades que no sean nulas
@JsonInclude(JsonInclude.Include.NON_NULL) 
//Especifica el orden en el que las propiedades del objeto deben aparecer en el JSON
@JsonPropertyOrder({
    "_id",
    "id",
    "url",
    "name",
    "type",
    "language",
    "genres",
    //"status",
    "runtime",
    "premiered",
    "officialSite",
    "schedule",
    "rating",
    //"weight",
    "network",
    //"webChannel",
    //"externals",
    //"image",
    "summary",
    //"updated",
    //"_links"
})

@Data
@AllArgsConstructor
@Document(collection="movies")

public class Movie {
		
	@JsonProperty("id")
	private String id;
	@JsonProperty("url")
	private String url;
	@JsonProperty("name")
	private String name;
	@JsonProperty("type")
	private String type;
	@JsonProperty("language")
	private String language;
	@JsonProperty("genres")
	private List<String> genres;
	/*
	 * @JsonProperty("status")
	 * private String status;
	 */
	@JsonProperty("runtime")
	private Integer runtime;
	@JsonProperty("premiered")
	private String premiered;
	@JsonProperty("officialSite")
	private String officialSite;
	@JsonProperty("schedule")
	private Horario horario;
	@JsonProperty("rating")
	private String rating;
	/*
	 * @JsonProperty("weight")
	 * private Integer weight;
	 */
	@JsonProperty("network")
	private Canal canal;
	/*
	 * @JsonProperty("webChannel")
	 * private Object webChannel;
	 * @JsonProperty("externals")
	 * private Externals externals;
	 *
	 * @JsonProperty("image.medium")
	 * private String imagen;
	 * @JsonProperty("summary")
	 * private String argumento;
	 *
	 * @JsonProperty("updated")
	 * private Integer updated;
	 * @JsonProperty("_links")
	 * private Links links;
	 */
}
