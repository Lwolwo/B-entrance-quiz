package com.thoughtworks.capability.gtb.entrancequiz.api;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.thoughtworks.capability.gtb.entrancequiz.service.*;

@CrossOrigin("http://localhost:1234")
@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("/memberList")
    public ResponseEntity getMemberList(){
        return ResponseEntity.ok(memberService.getMemberList());
    }

    @GetMapping("/sortList")
    public ResponseEntity getSortMemberList(){
        return ResponseEntity.ok(memberService.getSortMemberList());
    }
}
