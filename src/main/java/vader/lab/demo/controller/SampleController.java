package vader.lab.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import vader.lab.demo.domain.ResultModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SampleController {

    @GetMapping("/test")
    public ResponseEntity<ResultModel> SampleResponse(@RequestParam String user) {
        ResultModel resultModel = new ResultModel();

        Integer intValue = 777;
        int[] intArray = new int[]{2, 3, 5, 7, 11, 13};
        Map<String, Object> rawMap = new HashMap<>();
        rawMap.put("E1 (IntArray)", intArray);

        resultModel.setData(rawMap);

        log.info("test info log: "+ user);

        return ResponseEntity.ok().body(resultModel);
    }

    @PostMapping("/auth/healthCheck")
    public ResponseEntity<Map<String, Object>> HealthCheckResponse() {
        ResultModel resultModel = new ResultModel();

        Map<String, Object> resultData = new HashMap<>();
        resultData.put("checked-date", "1111");
        resultData.put("session", false);
        resultData.put("status", "UP");
        resultData.put("uno", "admin1");
        resultData.put("userName", "Admin1");

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("resultCd", "0000");
        resultMap.put("resultData", resultData);

        log.info("test info log: "+ resultMap);

        return ResponseEntity.ok().body(resultMap);
    }

    @GetMapping("/converting")
    public void SampleResponse() {

        String excelFileName = "/temp/upload/tableExport.xls";
        String outFn = "/temp/upload/converted-tableExport.xlsx";

        String sheetName = "Sheet1";//name of sheet

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet(sheetName) ;

        //iterating r number of rows
        for (int r=0;r < 5; r++ )
        {
            HSSFRow row = sheet.createRow(r);

            //iterating c number of columns
            for (int c=0;c < 5; c++ )
            {
                HSSFCell cell = row.createCell(c);

                cell.setCellValue("Cell "+r+" "+c);
            }
        }

        try {
            FileOutputStream fileOut = new FileOutputStream(excelFileName);

            //write this workbook to an Outputstream.
            wb.write(fileOut);
            fileOut.flush();
            fileOut.close();
        }
        catch(Exception e) {
            e.getStackTrace();
            log.error("converted" + e);
        }

        log.info("converted");
    }
}
