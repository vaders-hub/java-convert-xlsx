package vader.lab.demo.domain;

import vader.lab.demo.constants.NoticeCode;
import lombok.Data;

@Data
public class ResultModel {

    private String resultCode;
    private String resultMessage;
    private Object data;

    public ResultModel() {
        this.resultCode = NoticeCode.SUCCESS.getCode();
        this.resultMessage = NoticeCode.SUCCESS.getMessage();
        this.data = 0;
    }

    public ResultModel(NoticeCode noticeCode) {
        this.resultCode = noticeCode.getCode();
        this.resultMessage = noticeCode.getMessage();
    }

}
