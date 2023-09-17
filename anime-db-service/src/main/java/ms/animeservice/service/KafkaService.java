package ms.animeservice.service;

import ms.animeservice.payload.AnimeSearchRequest;
import ms.animeservice.model.dto.AnimeDto;
import ms.animeservice.model.dto.PartialAnimeDto;
import java.util.List;

public interface KafkaService {
    void sendSearchRequest(AnimeSearchRequest data);

    void sendFoundAnimeList(List<PartialAnimeDto> data);

    void sendFullSingleAnime(AnimeDto data);

    void sendUserAnimeList(List<PartialAnimeDto> data);
}
