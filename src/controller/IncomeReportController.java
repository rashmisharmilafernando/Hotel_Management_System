package controller;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;

public class IncomeReportController {
    public AnchorPane incomeAnchorPane;
    public LineChart monthlyLineChart;
    public CategoryAxis month;
    public NumberAxis income;
    public LineChart annuallinechart;
    public CategoryAxis years;
    public NumberAxis income2;
    public  void initialize(){
        XYChart.Series series=new XYChart.Series();
        series.getData().add(new XYChart.Data("1st",623000) );
        series.getData().add(new XYChart.Data("2nd",712780) );
        series.getData().add(new XYChart.Data("3rd",824000) );
        series.getData().add(new XYChart.Data("4th",157000) );
        series.getData().add(new XYChart.Data("5th",198000) );
        series.getData().add(new XYChart.Data("6tj",132000) );
        series.getData().add(new XYChart.Data("7th",123300) );
        series.getData().add(new XYChart.Data("8th",100000) );
        series.getData().add(new XYChart.Data("9th",1440000) );
        series.getData().add(new XYChart.Data("10th",150000) );
        series.getData().add(new XYChart.Data("11th",145000) );
        series.getData().add(new XYChart.Data("12th",156600) );

        monthlyLineChart.getData().add(series);

        XYChart.Series series1=new XYChart.Series();
        series1.getData().add(new XYChart.Data("Jan",55500000) );
        series1.getData().add(new XYChart.Data("Feb",25500000) );
        series1.getData().add(new XYChart.Data("March",35500000) );
        series1.getData().add(new XYChart.Data("April",51500000) );
        series1.getData().add(new XYChart.Data("May",69500000) );
        series1.getData().add(new XYChart.Data("Juny",35500000) );
        series1.getData().add(new XYChart.Data("July",14500000) );
        series1.getData().add(new XYChart.Data("August",67500000) );
        series1.getData().add(new XYChart.Data("Sep",95500000) );


        annuallinechart.getData().add(series1);

    }
}
