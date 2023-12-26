package hu.balogh.patakparlat_BE.service;

import hu.balogh.patakparlat_BE.controller.dto.MembersDto;
import hu.balogh.patakparlat_BE.controller.dto.MembersPostDto;

import java.util.List;

public interface MemberService {

    public void createMember(MembersPostDto membersPostDto);
    public List<MembersDto> getAllMembers();
    public void deleteMembers(int id);

}
