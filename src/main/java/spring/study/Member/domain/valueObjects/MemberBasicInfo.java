package spring.study.Member.domain.valueObjects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spring.study.Member.controller.validations.NameValidation;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberBasicInfo {
    private String password; //패스워드
    private String name; //이름
    @Column(name = "MOBILENUM")
    private String mobileNum; //전화번호
    private String gender; //성별
    private String birth; //생년월일
}
