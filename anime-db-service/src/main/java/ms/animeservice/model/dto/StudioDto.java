package ms.animeservice.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudioDto {
    @JsonProperty("mal_id")
    private Integer malId;
    private String type;
    private String name;
    private String url;

}
