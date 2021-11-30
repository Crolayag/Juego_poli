
package model;

import java.util.ArrayList;
import java.util.List;


public class division {
    public static List<String> ObtenerDatosdivision (int Valor)
    {
        List<String> Datosdivision = new ArrayList<>();
        
        switch(Valor) {
            case 1:
                Datosdivision.add("24");  // Opción 1
                Datosdivision.add("35");  // Opción 2
                Datosdivision.add("30");  // Opción 3
                Datosdivision.add("/image/division1.png");  // URL
                Datosdivision.add("35");  // Acertado
             break;
            case 2:
                Datosdivision.add("32");  // Opción 1
                Datosdivision.add("41");  // Opción 2
                Datosdivision.add("44");  // Opción 3
                Datosdivision.add("/image/division2.png");  // URL
                Datosdivision.add("32");  // Acertado
              break;
              case 3:
                Datosdivision.add("52");  // Opción 1
                Datosdivision.add("59");  // Opción 2
                Datosdivision.add("53");  // Opción 3
                  Datosdivision.add("/image/division3.png");  // URL
                Datosdivision.add("3132");  // Acertado
              break;
              case 4:
                Datosdivision.add("60");  // Opción 1
                Datosdivision.add("78");  // Opción 2
                Datosdivision.add("73");  // Opción 3
                 Datosdivision.add("/image/division4.png");  // URL
                Datosdivision.add("78");  // Acertado
              break;
              case 5:
                Datosdivision.add("115");  // Opción 1
                Datosdivision.add("125");  // Opción 2
                Datosdivision.add("100");  // Opción 3
                Datosdivision.add("/image/division5.png");  // URL
                Datosdivision.add("100");  // Acertado
              break;
             case 6:
                Datosdivision.add("57");  // Opción 1
                Datosdivision.add("55");  // Opción 2
                Datosdivision.add("50");  // Opción 3
                Datosdivision.add("/image/division6.png");  // URL
                Datosdivision.add("57");  // Acertado
              break;
              case 7:
                Datosdivision.add("51");  // Opción 1
                Datosdivision.add("40");  // Opción 2
                Datosdivision.add("68");  // Opción 3
                Datosdivision.add("/image/division7.png");  // URL
                Datosdivision.add("68");  // Acertado
              break;
              case 8:
                Datosdivision.add("91");  // Opción 1
                Datosdivision.add("90");  // Opción 2
                Datosdivision.add("92");  // Opción 3
                Datosdivision.add("/image/division8.png");  // URL
                Datosdivision.add("92");  // Acertado
              break;
              case 9:
                Datosdivision.add("53");  // Opción 1
                Datosdivision.add("59");  // Opción 2
                Datosdivision.add("60");  // Opción 3
                Datosdivision.add("/image/division9.png");  // URL
                Datosdivision.add("53");  // Acertado
              break;
              case 10:
                Datosdivision.add("40");  // Opción 1
                Datosdivision.add("59");  // Opción 2
                Datosdivision.add("51");  // Opción 3
                Datosdivision.add("/image/division10.png");  // URL
                Datosdivision.add("59");  // Acertado
              break;
            default:
              // code block
          }     
        return Datosdivision;  
    }    
 }
