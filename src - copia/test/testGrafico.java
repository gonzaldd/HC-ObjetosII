package test;

import java.util.GregorianCalendar;
import java.util.List;


import javax.swing.JFrame;

import negocio.CategoriaDeConsultaABM;
import negocio.ConsultaABM;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import datos.Funciones;
import datos.categoriaDeConsulta;

public class testGrafico extends JFrame  {


 private static final long serialVersionUID = 1L;

 public testGrafico(String applicationTitle, String chartTitle) {
   
  super(applicationTitle);

  DefaultCategoryDataset dataset = createDataset();

  JFreeChart chart = createChart(dataset, chartTitle);
 
  ChartPanel chartPanel = new ChartPanel(chart);

  chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));

  setContentPane(chartPanel);

 }

 private DefaultCategoryDataset createDataset() {
	  DefaultCategoryDataset result = new DefaultCategoryDataset();
	 
	  	CategoriaDeConsultaABM categoriaabm=new CategoriaDeConsultaABM();
	  	ConsultaABM consulta = new ConsultaABM();
		List<categoriaDeConsulta> lista = categoriaabm.traerCategoria();
		
		int i=0;
		GregorianCalendar anio=new GregorianCalendar();
		String fecha=Funciones.traerFechaCorta(anio);
		
		for(categoriaDeConsulta categoria:lista){
		result.setValue(consulta.traerCantConsulta(categoria.getIdCategoriaDeConsulta()),(categoria.getNombreCategoriaDeConsulta()),fecha);
			i++;
		}
	 
	  return result;

	 }

 

 private JFreeChart createChart(DefaultCategoryDataset dataset, String title) {

  JFreeChart chart = ChartFactory.createBarChart3D(title, "Categoria de Consulta",
    "% cantidad", dataset, 
    PlotOrientation.VERTICAL, true, 
    true, false);
  CategoryPlot plot = (CategoryPlot) chart.getPlot();
  CategoryAxis xAxis = (CategoryAxis) plot.getDomainAxis();
  xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
  plot.setBackgroundAlpha(0.5f);
  return chart;

 }

 public static void main(String[] args) {
  testGrafico demo = new testGrafico("Estadisticas",
    "Estadisticas");
  demo.pack();
  demo.setVisible(true);
 }


}