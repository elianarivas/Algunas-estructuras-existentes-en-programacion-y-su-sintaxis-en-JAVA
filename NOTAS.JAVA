
package notaser;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ELIANA RIVAS
 */
public class NOTASER {

    /**
     * 
     */
    /**
     *
     * 
     */
   public static void main(String[] args) {
    
        // TODO code application logic here
       
       
     
	
Scanner lector = new Scanner(System.in);

int n=0;

System.out.print("Ingrese cantidad de estudiantes: ");

n=lector.nextInt();

String[][] notas=new String[n+2][9];


notas[0][0] = "No";
notas[0][1] = "Nombre";
notas[0][2] = "Eval1";
notas[0][3] = "Eval2";
notas[0][4] = "Eval3";
notas[0][5] = "Eval4";
notas[0][6] = "Eval5";
notas[0][7] = "Promedio";
notas[0][8] = "Estado";


float sumaNotas=0, sumaGral = 0;


for(int x=1;x<(n+1);x++)
{
notas[x][0] = String.valueOf(x);
System.out.print("Ingrese Nombre del Estudiante: ");
notas[x][1] = lector .next();




for(int y = 2; y<7;y++)
{
System.out.print("Ingrese Evaluacion "+(y-1)+": ");
notas[x][y] = lector.next();

sumaNotas += Float.parseFloat(notas[x][y]);
}
notas[x][7] = String.valueOf(sumaNotas/5);
sumaGral += (sumaNotas / 5);
if (sumaNotas/5 >=6.0)
notas[x][8] = "Aprobado";
else
notas[x][8] = "Reprobado";
sumaNotas=0;

}

notas[n+1][6] = "Promedio Gral.";
notas[n+1][7] = String.valueOf(sumaGral / n);
if (sumaGral/n >=6.0)
notas[n+1][8] = "Aprobado";
else
notas[n+1][8] ="Reprobado";




for(int x = 0; x<=n;x++ )
{
   
for(int y = 0; y<9;y++)
{
    
System.out.print("\t"+notas[x][y]);
}


System.out.println();

}
   



 String x="1";
 int z = Integer.parseInt(x);
     
        
String estacion = "", mes = "";

switch (z) {
  case 12:
    mes = "Diciembre";
  case 1:
    mes = "Enero";
  case 2:
    mes = "Febrero";
    estacion = "Invierno";
    break;
  case 3:
    mes = "Marzo";
  case 4:
    mes = "Abril";
  case 5:
    mes = "Mayo";
    estacion = "Primavera";
    break;
  case 6:
    mes = "Junio";
  case 7:
    mes = "Julio";
  case 8:
    mes = "Agosto";
    estacion = "Verano";
    break;
  case 9:
    mes = "Septiembre";
  case 10:
    mes = "Octubre";
  case 11:
    mes = "Noviembre";
    estacion = "Otoño";
    break;
}

System.out.println("Además, un dato interesante: estás en el mes de " + mes + " y en algunos países se "
        + "encuentran en la estación de " + estacion);






   }
}

