package excel;


/*
* ====================================================================
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements. See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* ====================================================================
*
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
        import org.apache.poi.ss.usermodel.Row;
        import org.apache.poi.ss.util.CellRangeAddress;
        import org.apache.poi.xddf.usermodel.chart.AxisCrosses;
        import org.apache.poi.xddf.usermodel.chart.AxisPosition;
        import org.apache.poi.xddf.usermodel.chart.ChartTypes;
        import org.apache.poi.xddf.usermodel.chart.LegendPosition;
        import org.apache.poi.xddf.usermodel.chart.XDDFChartData;
        import org.apache.poi.xddf.usermodel.chart.XDDFChartLegend;
        import org.apache.poi.xddf.usermodel.chart.XDDFDataSource;
        import org.apache.poi.xddf.usermodel.chart.XDDFDataSourcesFactory;
        import org.apache.poi.xddf.usermodel.chart.XDDFNumericalDataSource;
        import org.apache.poi.xddf.usermodel.chart.XDDFValueAxis;
        import org.apache.poi.xssf.usermodel.XSSFChart;
        import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
        import org.apache.poi.xssf.usermodel.XSSFDrawing;
        import org.apache.poi.xssf.usermodel.XSSFSheet;
        import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/
public class POI_Chart {
/*
    public static void main(String[] args) throws IOException {
        try (XSSFWorkbook wb = new XSSFWorkbook()) {
            XSSFSheet sheet = wb.createSheet("Sheet 1");
            final int NUM_OF_ROWS = 3;
            final int NUM_OF_COLUMNS = 10;
// Create a row and put some cells in it. Rows are 0 based.
            Row row;
            Cell cell;
            for (int rowIndex = 0; rowIndex < NUM_OF_ROWS; rowIndex++) {
                row = sheet.createRow((short) rowIndex);
                for (int colIndex = 0; colIndex < NUM_OF_COLUMNS; colIndex++) {
                    cell = row.createCell((short) colIndex);
                    cell.setCellValue(colIndex * (rowIndex + 1));
                }
            }
            XSSFDrawing drawing = sheet.createDrawingPatriarch();
            XSSFClientAnchor anchor = drawing.createAnchor(0, 0, 0, 0, 0, 5, 10, 15);
            XSSFChart chart = drawing.createChart(anchor);
            XDDFChartLegend legend = chart.getOrAddLegend();
            legend.setPosition(LegendPosition.TOP_RIGHT);
            XDDFValueAxis bottomAxis = chart.createValueAxis(AxisPosition.BOTTOM);
            XDDFValueAxis leftAxis = chart.createValueAxis(AxisPosition.LEFT);
            leftAxis.setCrosses(AxisCrosses.AUTO_ZERO);
            XDDFDataSource<Double> xs = XDDFDataSourcesFactory.fromNumericCellRange(sheet, new CellRangeAddress(0, 0, 0, NUM_OF_COLUMNS - 1));
            XDDFNumericalDataSource<Double> ys1 = XDDFDataSourcesFactory.fromNumericCellRange(sheet, new CellRangeAddress(1, 1, 0,
                    NUM_OF_COLUMNS - 1));
            XDDFNumericalDataSource<Double> ys2 = XDDFDataSourcesFactory.fromNumericCellRange(sheet, new CellRangeAddress(2, 2, 0,
                    NUM_OF_COLUMNS - 1));
            XDDFChartData data = chart.createData(ChartTypes.SCATTER, bottomAxis, leftAxis);
            data.addSeries(xs, ys1);
            data.addSeries(xs, ys2);
            chart.plot(data);
// Write the output to a file
            try (FileOutputStream fileOut = new FileOutputStream("ooxml-scatter-chart.xlsx")) {
                wb.write(fileOut);
            }
        }
    }
*/
}

