package com.example.demodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeployApplicationTests {

    @Test
    void contextLoads() {
        // 단위 테스트
        // 에러 강제 발생 시켜서 중단여부 체크
        // 테스트 실패 시 반영 X -> 깃은 반영되지만 배포 및 운영 측에서 반영이 X
//        int a = 1/0;
//        throw new RuntimeException("오류발생");

        // MVC 테스트 -> 목업 통해 가상 처리 가능
        // RestAPI 테스트 가능
        // 메세지가 보이지는 않지만 차후 코드로 확인
        //System.out.println("단위 테스트 호출!! echo");


    }

}
