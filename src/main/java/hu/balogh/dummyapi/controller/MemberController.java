package hu.balogh.dummyapi.controller;

import hu.balogh.dummyapi.controller.dto.MembersDto;
import hu.balogh.dummyapi.controller.dto.MembersPostDto;
import hu.balogh.dummyapi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
@CrossOrigin(origins = {"https://kossuth-vt-xgjc.vercel.app", "https://kossuth-vt-8zfc.vercel.app", "http://localhost:3000"},
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE},
        allowedHeaders = "*", allowCredentials = "true")
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
