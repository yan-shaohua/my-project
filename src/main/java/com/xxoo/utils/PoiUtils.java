package com.xxoo.utils;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.Test;


import java.io.FileOutputStream;

public class PoiUtils {


    @Test
    public void poiWrite03() throws Exception {

        // 创建一个工作簿
        Workbook workbook = new HSSFWorkbook();

        // 创建一个sheet
        Sheet sheet = workbook.createSheet("sheet名称");

        // 第一行
        Row row1 = sheet.createRow(0);
        // 第一列
        Cell cell01 = row1.createCell(0);
        // 往第一行第一列中写入数据
        cell01.setCellValue("第一行第一列");

        Cell cell02 = row1.createCell(1);
        cell02.setCellValue("第一行第二列");

        // 第二行
        Row row2 = sheet.createRow(1);

        // 第一列
        Cell cell21 = row2.createCell(0);
        // 往第二行第一列中写入数据
        cell21.setCellValue("第二行第一列");

        // 第二列
        Cell cell22 = row2.createCell(1);
        cell22.setCellValue("第二行第二列");

        String time = new DateTime().toString("yyyy-MM-dd");
        FileOutputStream fileOutputStream = new FileOutputStream(time + " v3.xls");

        workbook.write(fileOutputStream);

        // 关闭流
        fileOutputStream.close();

        System.out.println("Excel生成完毕！");
    }


    @Test
    public void poiWrite07() throws Exception {

        // 创建一个工作簿
        Workbook workbook = new XSSFWorkbook();

        // 创建一个sheet
        Sheet sheet = workbook.createSheet("sheet名称");

        // 第一行
        Row row1 = sheet.createRow(0);
        // 第一列
        Cell cell01 = row1.createCell(0);
        // 往第一行第一列中写入数据
        cell01.setCellValue("第一行第一列");

        Cell cell02 = row1.createCell(1);
        cell02.setCellValue("第一行第二列");

        // 第二行
        Row row2 = sheet.createRow(1);

        // 第一列
        Cell cell21 = row2.createCell(0);
        // 往第二行第一列中写入数据
        cell21.setCellValue("第二行第一列");

        // 第二列
        Cell cell22 = row2.createCell(1);
        cell22.setCellValue("第二行第二列");

        String time = new DateTime().toString("yyyy-MM-dd");
        FileOutputStream fileOutputStream = new FileOutputStream(time + " v7.xls");

        workbook.write(fileOutputStream);

        // 关闭流
        fileOutputStream.close();

        System.out.println("Excel生成完毕！");
    }


}
