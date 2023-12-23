package hu.balogh.dusanaVT.mapper;

import hu.balogh.dusanaVT.controller.dto.MembersDto;
import hu.balogh.dusanaVT.controller.dto.MembersPostDto;

import hu.balogh.dusanaVT.repository.entity.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "position", target = "position")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    MemberEntity toEntityPost(MembersPostDto membersPostDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "position", target = "position")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    List<MembersDto> toDtoList(List<MemberEntity> membersEntity);



}
