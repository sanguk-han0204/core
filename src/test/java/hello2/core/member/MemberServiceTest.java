package hello2.core.member;

import hello2.core.AppConfig;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

MemberService memberService;
@BeforeEach //테스트를 실행하기 전에 무조건 실행한다
public void beforeEach(){
    AppConfig appConfig = new AppConfig();
    memberService = appConfig.memberService();
}

@Test
    void join(){
    //given
    Member member = new Member(1L, "memberA", Grade.VIP);

    //when

    memberService.join(member);
    Member findMember = memberService.findMember(1L);

    //then
    Assertions.assertThat(member).isEqualTo(findMember);

}

}
