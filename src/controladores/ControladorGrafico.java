package controladores;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.CategoriaDeConsultaABM;
import negocio.ConsultaABM;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


import datos.Funciones;
import datos.categoriaDeConsulta;

public class ControladorGrafico extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("image/png");

		OutputStream outputStream = response.getOutputStream();

		JFreeChart chart = getChart();
		int width = 1280;
		int height = 768;
		ChartUtilities.writeChartAsPNG(outputStream, chart, width, height);

	}

	public JFreeChart getChart() {
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
	
		JFreeChart chart = ChartFactory.createBarChart3D("Estadisticas","Categoria de Consulta"," % Cantidad", result, PlotOrientation.VERTICAL, true, 
				    true, false);

		chart.setBorderPaint(Color.BLUE);
		chart.setBorderStroke(new BasicStroke(5.0f));
		chart.setBorderVisible(true);
		chart.setTitle("Grafico Estadistico");

		return chart;
	}

}