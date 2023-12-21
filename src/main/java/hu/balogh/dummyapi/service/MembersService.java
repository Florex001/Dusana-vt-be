package hu.balogh.dummyapi.service;

import hu.balogh.dummyapi.controller.dto.MembersDto;

import java.util.List;

public interface MembersService {

    public void createMember();
    public List<MembersDto> getAllMembers();
    public void deleteMembers(String id);

}
