package com.thoughtworks.capability.gtb.entrancequiz.api;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.thoughtworks.capability.gtb.entrancequiz.service.*;

//TODO GTB-完成度: * 只有查询学员和分组的实现，但设计不太正确

//TODO GTB-测试: * 没有测试

@CrossOrigin("http://localhost:1234")
@RestController
public class MemberController {
    //TODO GTB-知识点: - 推荐使用构造函数注入
    @Autowired
    MemberService memberService;

    @GetMapping("/memberList")
    //TODO GTB-知识点: - 了解一下 @ResponseStatus
    public ResponseEntity getMemberList(){
        return ResponseEntity.ok(memberService.getMemberList());
    }

    @GetMapping("/sortList")
    public ResponseEntity getSortMemberList(){
        return ResponseEntity.ok(memberService.getSortMemberList());
    }
}
