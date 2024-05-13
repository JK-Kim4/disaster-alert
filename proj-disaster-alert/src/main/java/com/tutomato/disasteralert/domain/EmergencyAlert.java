package com.tutomato.disasteralert.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 긴급재난문자 응답 Entity
 * /V2/api/DSSP-IF-00247
 *
 * */
@Getter @Setter
@NoArgsConstructor
public class EmergencyAlert {

    private Long                SN;        // 일련 번호
    private LocalDateTime       CRT_DT;    // 생성 일시
    private String              MSG_CN;    // 메세지 내용
    private String              MSG_SE_CD;  // 메세지 구분 코드
    private String              RCPTN_RGN_ID;   // 수신 지역 아이디
    private String              RCPTN_RGN_NM;   // 수신 지역명
    private Integer             EMRG_STEP_ID;   // 긴급 단계 아이디
    private String              EMRG_STEP_NM;   // 긴급 단계명
    private Integer             DST_SE_ID;      // 재해 구분 아이디
    private String              DST_SE_NM;      // 재해 구분명
    private LocalDate           REG_YMD;        // 등록 일자
    private String              RGTR_ID;        // 등록자 아이디
    private LocalDate           MDFCN_YMD;      // 수정 일자
    private String              MDFR_ID;        // 수정자 아이디
    private char                DEL_YN;         // 삭제 여부

}
