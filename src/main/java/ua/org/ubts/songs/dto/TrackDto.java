package ua.org.ubts.songs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TrackDto extends BaseDto {

    private Long id;

    private String artist;

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sampleAudioUrl;

}
