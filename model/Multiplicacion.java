
package model;

import java.util.ArrayList;
import java.util.List;

public class Multiplicacion {
    public static List<String> ObtenerDatosMultiplicacion (int Valor)
    {
        List<String> DatosMultiplicacion = new ArrayList<>();
        
        switch(Valor) {
            case 1:
                DatosMultiplicacion.add("2272");  // Opción 1
                DatosMultiplicacion.add("1152");  // Opción 2
                DatosMultiplicacion.add("100");  // Opción 3
                DatosMultiplicacion.add("/image/multiplicacion1.png");  // URL
                DatosMultiplicacion.add("2272");  // Acertado
             break;
            case 2:
                DatosMultiplicacion.add("4387");  // Opción 1
                DatosMultiplicacion.add("4720");  // Opción 2
                DatosMultiplicacion.add("3742");  // Opción 3
                DatosMultiplicacion.add("/image/multiplicacion2.png");  // URL
                DatosMultiplicacion.add("4720");  // Acertado
              break;
              case 3:
                DatosMultiplicacion.add("4385");  // Opción 1
                DatosMultiplicacion.add("2564");  // Opción 2
                DatosMultiplicacion.add("3132");  // Opción 3
                  DatosMultiplicacion.add("/image/multiplicacion3.png");  // URL
                DatosMultiplicacion.add("3132");  // Acertado
              break;
              case 4:
                DatosMultiplicacion.add("1618");  // Opción 1
                DatosMultiplicacion.add("2273");  // Opción 2
                DatosMultiplicacion.add("1617");  // Opción 3
                 DatosMultiplicacion.add("/image/multiplicacion4.png");  // URL
                DatosMultiplicacion.add("1617");  // Acertado
              break;
              case 5:
                DatosMultiplicacion.add("1159");  // Opción 1
                DatosMultiplicacion.add("1252");  // Opción 2
                DatosMultiplicacion.add("1174");  // Opción 3
                DatosMultiplicacion.add("/image/multiplicacion5.png");  // URL
                DatosMultiplicacion.add("1159");  // Acertado
              break;
             case 6:
                DatosMultiplicacion.add("4232");  // Opción 1
                DatosMultiplicacion.add("4212");  // Opción 2
                DatosMultiplicacion.add("4142");  // Opción 3
                DatosMultiplicacion.add("/image/multiplicacion6.png");  // URL
                DatosMultiplicacion.add("4212");  // Acertado
              break;
              case 7:
                DatosMultiplicacion.add("4461");  // Opción 1
                DatosMultiplicacion.add("4378");  // Opción 2
                DatosMultiplicacion.add("4464");  // Opción 3
                DatosMultiplicacion.add("/image/multiplicacion7.png");  // URL
                DatosMultiplicacion.add("4464");  // Acertado
              break;
              case 8:
                DatosMultiplicacion.add("352");  // Opción 1
                DatosMultiplicacion.add("320");  // Opción 2
                DatosMultiplicacion.add("300");  // Opción 3
                DatosMultiplicacion.add("/image/multiplicacion8.png");  // URL
                DatosMultiplicacion.add("352");  // Acertado
              break;
              case 9:
                DatosMultiplicacion.add("7041");  // Opción 1
                DatosMultiplicacion.add("7050");  // Opción 2
                DatosMultiplicacion.add("7083");  // Opción 3
                DatosMultiplicacion.add("/image/multiplicacion9.png");  // URL
                DatosMultiplicacion.add("7050");  // Acertado
              break;
              case 10:
                DatosMultiplicacion.add("3348");  // Opción 1
                DatosMultiplicacion.add("3349");  // Opción 2
                DatosMultiplicacion.add("2276");  // Opción 3
                DatosMultiplicacion.add("/image/multiplicacion10.png");  // URL
                DatosMultiplicacion.add("3348");  // Acertado
              break;
            default:
              // code block
          }     
        return DatosMultiplicacion;  
    }    
}
