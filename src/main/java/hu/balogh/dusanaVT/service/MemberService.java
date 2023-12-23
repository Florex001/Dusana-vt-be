package hu.balogh.dusanaVT.service;

import hu.balogh.dusanaVT.controller.dto.MembersDto;
import hu.balogh.dusanaVT.controller.dto.MembersPostDto;

import java.util.List;

public interface MemberService {

    public void createMember(MembersPostDto membersPostDto);
    public List<MembersDto> getAllMembers();
    public void deleteMembers(int id);

}
