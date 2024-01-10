package hu.balogh.patakparlat_BE.controller;

import hu.balogh.patakparlat_BE.controller.dto.MembersDto;
import hu.balogh.patakparlat_BE.controller.dto.MembersPostDto;
import hu.balogh.patakparlat_BE.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/getAllMembers")
    public ResponseEntity<List<MembersDto>> getAllMembers(){
        List<MembersDto> membersDtos = memberService.getAllMembers();
        return ResponseEntity.status(HttpStatus.OK).body(membersDtos);
    }

    @PostMapping()
    public ResponseEntity createMembers(@RequestBody MembersPostDto membersPostDto){
        memberService.createMember(membersPostDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMember(@PathVariable int id){
        memberService.deleteMembers(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }


}
