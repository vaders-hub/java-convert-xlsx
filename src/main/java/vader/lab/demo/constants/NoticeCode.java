package vader.lab.demo.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum NoticeCode {

    // N00000 정상 처리 되었습니다.
    SUCCESS("N00000", "정상 처리 되었습니다."),

    // N00001 정상 조회 되었습니다.
    INQUIRY("N00001", "정상 조회 되었습니다."),

    // N00002 등록 되었습니다.
    ADD("N00002", "등록 되었습니다."),

    // N00003 수정 되었습니다.
    MODIFY("N00003", "수정 되었습니다."),

    // N00004 변경 되었습니다.
    CHANGE("N00004", "변경 되었습니다."),

    // N00005 저장 되었습니다.
    SAVE("N00005", "저장 되었습니다."),

    // N00006 삭제 되었습니다.
    DELETE("N00006", "삭제 되었습니다."),

    // N00007 요청 결과가 없습니다.
    NO_DATA("N00007", "요청 결과가 없습니다."),

    // N00008 이미 존재합니다.
    EXISTS("N00008", "이미 존재합니다."),

    // N00009 담당자 전화번호 정보가 없습니다.
    NO_DATA_MEBR_CP_NO("N00009", "담당자 전화번호 정보가 없습니다."),

    // N00010 고객 전화번호 정보가 없습니다.
    NO_DATA_CUST_CP_NO("N00010", "고객 전화번호 정보가 없습니다."),

    // N00011 유효하지 않은 전화번호입니다.
    INVALID_CP_NO("N00011", "유효하지 않은 전화번호입니다."),

    // N00012 정상 처리 되었으나 알림톡 발송은 실패하였습니다.
    SUCCESS_NTTK_FAIL("N00012", "정상 처리 되었으나 알림톡 발송은 실패하였습니다."),

    // N00013 정상 처리 되었습니다.[알림톡수신거부]
    SUCCESS_NTTK_REJECTION("N00013", "정상 처리 되었습니다. 알림톡 수신대상이 아니므로 알림톡은 발송되지 않습니다."),

    // N00014 정상 처리 되었습니다.[휴대전화번호미등록]
    SUCCESS_CP_NO_NOT_REGIST("N00014", "정상 처리 되었습니다. 휴대전화번호 미등록이므로 알림톡은 발송되지 않습니다.");

    private final String code;
    private final String message;

}
