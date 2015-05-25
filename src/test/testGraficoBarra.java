package test;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class testGraficoBarra extends JFrame  {


 private static final long serialVersionUID = 1L;

 public testGraficoBarra(String applicationTitle, String chartTitle) {
   
  super(applicationTitle);

  // Creamos el conjunto de datos, luego cuando instaciamos esto traeriamos los datos.
  DefaultCategoryDataset dataset = createDataset();

  JFreeChart chart = createChart(dataset, chartTitle);
  // Ponemos el gráfico en un panel
  ChartPanel chartPanel = new ChartPanel(chart);
  // Dejamos el tamaño por defecto, se puedo agrandar
  chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
  // Lo añadimos a nuestra aplicación (pie con descripcion de las categorias)
  setContentPane(chartPanel);

 }

 private DefaultCategoryDataset createDataset() {
  
  DefaultCategoryDataset result = new DefaultCategoryDataset();
 
  result.setValue(154, "riña callejera", "2013");
  result.setValue(169, "accidente vial", "2013");
  result.setValue(75, "intoxicacion", "2013");
  result.setValue(45, "descompensacion", "2013");
  result.setValue(32, "herida arma blanca", "2013");
  result.setValue(78, "herida bala", "2013");
 

  result.setValue(120, "riña callejera", "2014");
  result.setValue(145, "accidente vial", "2014");
  result.setValue(58, "intoxicacion", "2014");
  result.setValue(95, "descompensacion", "2014");
  result.setValue(42, "herida arma blanca", "2014");
  result.setValue(28, "herida bala", "2014");
 
  
  result.setValue(78, "riña callejera", "2015");
  result.setValue(126, "accidente vial", "2015");
  result.setValue(48, "intoxicacion", "2015");
  result.setValue(125, "descompensacion", "2015");
  result.setValue(33, "herida arma blanca", "2015");
  result.setValue(22, "herida bala", "2015");

  return result;

 }

 private JFreeChart createChart(DefaultCategoryDataset dataset, String title) {

  JFreeChart chart = ChartFactory.createBarChart3D(title, "causa",
    "cant. de casos", dataset, 
    PlotOrientation.VERTICAL, true,
    true, false);
  CategoryPlot plot = (CategoryPlot) chart.getPlot();
  CategoryAxis xAxis = (CategoryAxis) plot.getDomainAxis();
  xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45); 
  plot.setBackgroundAlpha(0.5f);
  return chart;

 }

 public static void main(String[] args) {
  testGraficoBarra demo = new testGraficoBarra("Estadistica: Causas de ingreso al hospital","Estadistica: Causas de ingreso al hospital");
  demo.pack();
  demo.setVisible(true);
 }


}

