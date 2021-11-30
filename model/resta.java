
package model;

import java.util.ArrayList;
import java.util.List;


public class resta {
    public static List<String> ObtenerDatosResta (int Valor)
    {
        List<String> DatosResta = new ArrayList<>();
        
        switch(Valor) {
            case 1:
                DatosResta.add("50");  // Opción 1
                DatosResta.add("20");  // Opción 2
                DatosResta.add("100");  // Opción 3
                DatosResta.add("/image/resta1.png");  // URL
                DatosResta.add("100");  // Acertado
             break;
            case 2:
                DatosResta.add("490");  // Opción 1
                DatosResta.add("71");  // Opción 2
                DatosResta.add("73");  // Opción 3
                DatosResta.add("/image/resta2.png");  // URL
                DatosResta.add("73");  // Acertado
              break;
              case 3:
                DatosResta.add("90");  // Opción 1
                DatosResta.add("87");  // Opción 2
                DatosResta.add("140");  // Opción 3
                  DatosResta.add("/image/resta3.png");  // URL
                DatosResta.add("140");  // Acertado
              break;
              case 4:
                DatosResta.add("40");  // Opción 1
                DatosResta.add("56");  // Opción 2
                DatosResta.add("44");  // Opción 3
                 DatosResta.add("/image/resta4.png");  // URL
                DatosResta.add("44");  // Acertado
              break;
              case 5:
                DatosResta.add("84");  // Opción 1
                DatosResta.add("71");  // Opción 2
                DatosResta.add("68");  // Opción 3
                DatosResta.add("/image/resta5.png");  // URL
                DatosResta.add("71");  // Acertado
              break;
             case 6:
                DatosResta.add("50");  // Opción 1
                DatosResta.add("45");  // Opción 2
                DatosResta.add("49");  // Opción 3
                DatosResta.add("/image/resta6.png");  // URL
                DatosResta.add("50");  // Acertado
              break;
              case 7:
                DatosResta.add("105");  // Opción 1
                DatosResta.add("121");  // Opción 2
                DatosResta.add("134");  // Opción 3
                DatosResta.add("/image/resta7.png");  // URL
                DatosResta.add("121");  // Acertado
              break;
              case 8:
                DatosResta.add("90");  // Opción 1
                DatosResta.add("142");  // Opción 2
                DatosResta.add("60");  // Opción 3
                DatosResta.add("/image/resta8.png");  // URL
                DatosResta.add("142");  // Acertado
              break;
              case 9:
                DatosResta.add("119");  // Opción 1
                DatosResta.add("110");  // Opción 2
                DatosResta.add("100");  // Opción 3
                DatosResta.add("/image/resta9.png");  // URL
                DatosResta.add("110");  // Acertado
              break;
              case 10:
                DatosResta.add("108");  // Opción 1
                DatosResta.add("130");  // Opción 2
                DatosResta.add("100");  // Opción 3
                DatosResta.add("/image/resta10.png");  // URL
                DatosResta.add("100");  // Acertado
              break;
            default:
              // code block
          }     
        return DatosResta;  
    }    
}
