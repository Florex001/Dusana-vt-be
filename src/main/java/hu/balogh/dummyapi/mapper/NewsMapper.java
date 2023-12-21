package hu.balogh.dummyapi.mapper;

import hu.balogh.dummyapi.controller.dto.NewsDto;
import hu.balogh.dummyapi.repository.entity.NewsEntity;
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
    NewsEntity toEntity(NewsDto newsDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "temacim", target = "temacim")
    @Mapping(source = "temadatum", target = "temadatum")
    @Mapping(source = "temaleiras", target = "temaleiras")
    List<NewsDto> toDtoList(List<NewsEntity> newsEntity);


}
