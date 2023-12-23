package hu.balogh.dusanaVT.mapper;

import hu.balogh.dusanaVT.controller.dto.NewsDto;
import hu.balogh.dusanaVT.controller.dto.NewsPostDTO;
import hu.balogh.dusanaVT.repository.entity.NewsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NewsMapper {

    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "temacim", target = "temacim")
    @Mapping(source = "temadatum", target = "temadatum")
    @Mapping(source = "temaleiras", target = "temaleiras")
    List<NewsDto> toDtoList(List<NewsEntity> newsEntity);

    @Mapping(source = "temacim", target = "temacim")
    @Mapping(source = "temadatum", target = "temadatum")
    @Mapping(source = "temaleiras", target = "temaleiras")
    NewsEntity toEntityPost(NewsPostDTO newsPostDTO);


}
