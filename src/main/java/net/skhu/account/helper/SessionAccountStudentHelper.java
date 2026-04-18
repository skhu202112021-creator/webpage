package net.skhu.account.helper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.skhu.account.dto.AccountJoinRequest;
import net.skhu.account.dto.AccountLoginRequest;
import net.skhu.account.etc.AccountConstants;
import net.skhu.common.util.HttpUtils;
import net.skhu.member.entity.Student;
import net.skhu.member.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component // ①
@RequiredArgsConstructor // ②
public class SessionAccountStudentHelper implements AccountHelper {

    private final StudentService StudentService; // ③

    // 회원가입
    @Override
    public void join(AccountJoinRequest joinReq) { // ④
        StudentService.save(joinReq.getName(), joinReq.getDepartment(), joinReq.getLoginId(), joinReq.getLoginPw());
    }

    // 로그인
    @Override
    public String login(AccountLoginRequest loginReq, HttpServletRequest req, HttpServletResponse res) { // ④
        Student Student = StudentService.find(loginReq.getLoginId(), loginReq.getLoginPw());

        // 회원 데이터가 없으면
        if (Student == null) {
            return null;
        }

        HttpUtils.setSession(req, AccountConstants.MEMBER_ID_NAME, Student.getId());
        return Student.getLoginId();
    }

    // 회원 아이디 조회
    @Override
    public Integer getMemberId(HttpServletRequest req) { // ④
        Object StudentId = HttpUtils.getSessionValue(req, AccountConstants.MEMBER_ID_NAME);

        if (StudentId != null) {
            return (int) StudentId;
        }

        return null;
    }

    // 로그인 여부 확인
    @Override
    public boolean isLoggedIn(HttpServletRequest req) { // ④
        return getMemberId(req) != null;
    }

    // 로그아웃
    @Override
    public void logout(HttpServletRequest req, HttpServletResponse res) { // ④
        HttpUtils.removeSession(req, AccountConstants.MEMBER_ID_NAME);
    }
}