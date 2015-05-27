package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


public class Funciones {
	
	
	private static List<GregorianCalendar> listaFeriados  = new ArrayList<GregorianCalendar>();
	
	// traer año
	
	public static int traerAnio (GregorianCalendar anio){
				
		return anio.get(Calendar.YEAR);
	}
			
	//traer mes
	
	public static int traerMes (GregorianCalendar mes){
		
		return (mes.get(Calendar.MONTH)+1);
	}
			
	//traer dia
			
	public static int traerDia (GregorianCalendar dia){
		
		return dia.get(Calendar.DAY_OF_MONTH);
	}
	
	
	
	//traer fechaCorta
	
	public static String traerFechaCorta(GregorianCalendar obj){
		int dia= obj.get(GregorianCalendar.DATE);
		int mes= obj.get(GregorianCalendar.MONTH);
		int anio= obj.get(GregorianCalendar.YEAR);
		mes=mes+1;
		String fecha="";		
		
		if(dia<10){
			fecha+="0"+dia+"/";}
		else{
			fecha=dia+"/";}
	
		if(mes<10){
			fecha+="0"+mes+"/";}
		else{
			fecha+=mes+"/";}
		fecha+=anio;
				
		return fecha;
	}
	
	public static String traerFechaCortaDao(GregorianCalendar obj){
		int dia= obj.get(GregorianCalendar.DATE);
		int mes= obj.get(GregorianCalendar.MONTH);
		int anio= obj.get(GregorianCalendar.YEAR);
		mes=mes+1;
		String fecha="";		
		
			fecha+=anio+"-";
			if(mes<10){
				fecha+="0"+mes+"-";}
			else{
				fecha+=mes+"-";}
			if(dia<10){
				fecha+="0"+dia;}
			else{
				fecha+=dia+"";}
				
		return fecha;
	}
	
	//validarDni
	
	public static boolean validarDni(long dni){
		boolean correcto=true;
		String documento=Long.toString(dni);
		if(documento.length()!= 8){
				correcto=false;}
		return correcto;	
		
	}

	//Traer fecha (parametros int, devuelve gregorian)
		
	public static GregorianCalendar traerFecha(int a, int m, int d){
			
			GregorianCalendar fecha=null;
			
			if (fechaValida(a,m,d)) fecha= new GregorianCalendar(a,m,d);
			
			return fecha;
		}
	
	//es fecha valida??
		
	public static boolean fechaValida(int a, int m, int d){
				
		GregorianCalendar fechaActual= new GregorianCalendar();
		int anioActual= fechaActual.get(GregorianCalendar.YEAR);
		boolean correcto= true;
				
		if(a <= 0 || a > anioActual){
				correcto=false;
		}
				
		if(m<0 || m>12){
				correcto=false;
		}
		
		if (m==2){
			if (esBisisesto(a)){
				if(d<1 || d>29 ){
					correcto=false;
				}
			}
			else {if(d<1 || d>28){correcto=false;}
			}
				
		}
		else{
			if(m==4 || m==5 || m==8 || m==10){
				if(d<0 || d>30){
					correcto=false;
			}
				else{
					if(d<1 || d>31){
						correcto=false;
					}
								
				}
			}
						
		}
				
	return correcto;
	}
			
	// es bisiesto??
			
	public static boolean esBisisesto (int a){
		return ((a%4 == 0 && a%100 !=0) || a%400 ==0);
	}
			
	
	//es dia habil
			
	public static boolean esDiaHabil(GregorianCalendar fecha) {
		
		int i=0;
		boolean resultado = true;
		int valorDia = fecha.get(GregorianCalendar.DAY_OF_WEEK);
		boolean encontrado=true;
		List<GregorianCalendar> listado=Funciones.getListaFeriados();
		//GregorianCalendar feriado =null;
		
		
		if( valorDia==1 || valorDia==7){
			
			resultado=false;
		}
		
		while(i<listado.size() && encontrado){
			
			if(listado.get(i).equals(fecha)){
				resultado =false;
				encontrado =false;
			}
		i+=1;
		}
		
		
	return resultado;
	}
	
	
	//primer dia habil
	
	public static GregorianCalendar primerDiaHabil(GregorianCalendar fecha){
		
		int dia=Funciones.traerDia(fecha);
		int mes=Funciones.traerMes(fecha);
		int anio=Funciones.traerAnio(fecha);
		GregorianCalendar diaH = null;
		boolean encontrado=true;
		int diasEnMes;
		
		while(encontrado){
				
				diaH=Funciones.traerFecha(anio, mes-1, dia);
				
				if(Funciones.esDiaHabil(diaH)){
					encontrado=false;
				}
				dia=dia+1;
				
				diasEnMes=diaH.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
				
				if(dia>diasEnMes){
					mes=mes+1;
					dia=1;
				}
				
				if(mes>12){
					anio=anio+1;
					mes=1;
				}
		}
	return diaH;	
	}
		
		
	//traer fecha (parametro Stringr, devuelve calendar)
		
	public static GregorianCalendar traerFecha(String fecha){
		String anio,mes,dia;
		GregorianCalendar date;
			
		dia=fecha.substring(0,2);
		mes=fecha.substring(3,5);
		anio=fecha.substring(6);
			
		if(fechaValida(Integer.parseInt(anio),Integer.parseInt(mes)-1,Integer.parseInt(dia))){
			date= new GregorianCalendar(Integer.parseInt(anio),(Integer.parseInt(mes)-1),Integer.parseInt(dia));
		}
		else{	
			System.out.println("La fecha es invalida. se usara la fecha actual");
					date = new GregorianCalendar();}
			
	return date;
	}

		
	// fecha corta(sobrecargado)
		
	public static String traerFechaCorta(){
		
		return (traerFechaCorta(new GregorianCalendar()));
	}
		
		
	//traer lista de feriados
	
		public static void setListaFeriados(){
			
			//ArrayList<GregorianCalendar> lista  = new ArrayList<GregorianCalendar>();
			
			try {
		        File dirBase = new File("src/modelo/feriados.xml");
		     
		        String ruta = dirBase.getAbsolutePath();
		        
		        BufferedReader br = new BufferedReader(new FileReader(ruta));
		        
		        String entrada;
		        String cadena = "";
		        
		        while ((entrada = br.readLine()) != null)
		            cadena += entrada;
		        
		        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		        DocumentBuilder db = dbf.newDocumentBuilder();
		        
		        InputSource archivo = new InputSource();
		        archivo.setCharacterStream(new StringReader(cadena));
		        
		        Document documento = db.parse(archivo);
		        documento.getDocumentElement().normalize();
		 
		        NodeList nodeLista = documento.getElementsByTagName("feriado");
		        
		        String[] tags = {"anio","mes","dia"};
		        
		        for (int s = 0; s < nodeLista.getLength(); s++) {
		        	
		        	Node nodo = nodeLista.item(s);
		            String[] valores = new String[tags.length];            
		            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
		                Element elemento = (Element) nodo;
		                for (int i = 0; i < tags.length; i++) {
		                	NodeList nombreElementoLista = elemento.getElementsByTagName(tags[i]);
		                    Element nombreElemento = (Element) nombreElementoLista.item(0);
		                    NodeList nombre = nombreElemento.getChildNodes();
		                    valores[i] = ((Node) nombre.item(0)).getNodeValue().toString();
		                 }
		                
		              int anio= Integer.parseInt(valores[0]);
		              int mes=Integer.parseInt (valores[1]);
		              int dia=Integer.parseInt(valores[2]);
		                
		              GregorianCalendar f= (Funciones.traerFecha(anio, mes, dia)); 
		              
		              listaFeriados.add(f);
		              /*lista.add(anio);
		                lista.add(mes);
		                lista.add(dia);*/
		                
		            }
		        }
		        br.close();
		    } catch (Exception e) {
		        System.out.println(e.getMessage());
		    }
	}
	
	public static List<GregorianCalendar> getListaFeriados() {
		return listaFeriados;
	}
	
}

