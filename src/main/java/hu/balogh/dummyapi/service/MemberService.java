package hu.balogh.dummyapi.service;

import hu.balogh.dummyapi.controller.dto.MembersDto;
import hu.balogh.dummyapi.controller.dto.MembersPostDto;

import java.util.List;

public interface MemberService {

    public void createMember(MembersPostDto membersPostDto);
    public List<MembersDto> getAllMembers();
    public void deleteMembers(int id);

}
