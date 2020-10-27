package com.thoughtworks.capability.gtb.entrancequiz.service;
import org.springframework.stereotype.*;
import java.util.*;
import com.thoughtworks.capability.gtb.entrancequiz.domain.*;

@Service
public class MemberService {
    ArrayList<Member> memberList;

    MemberService() {
        String[] list = {"成吉思汗", "鲁班七号", "太乙真人", "钟无艳", "花木兰", "雅典娜", "芈月", "白起", "刘禅", "庄周", "马超", "刘备", "哪吒", "大乔", "蔡文姬"};
        memberList = new ArrayList<>();
        for(int i = 0; i < list.length; i++) {
            Member member = new Member(list[i], i + 1);
            memberList.add(member);
        }
    }

    public List<Member> getMemberList() {
        return memberList;
    }
}
