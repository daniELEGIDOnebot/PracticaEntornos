/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornosrepositorios;

import java.util.*;

/**
 *
 * @author admin
 */
public class PracticaEntornosRepositorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temperaturas[] = new double[7];
        
        String diaSemana[] = {"lunes", "martes", "miercoles", "jueves", "sabado", "domingo"};
        double suma = 0, max = 0, min = 0;
        int dia, posMin = 0, posMax = 0;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        
            System.out.println("Anota la temperatura de la semana");
            for (int i = 0; i < temperaturas.length; i++) {
                System.out.println(diaSemana[i] + ":");
                temperaturas[i] = sc.nextDouble();
                suma = suma + temperaturas[i];
                if (i == 0) {
                    min = temperaturas[0];
                    posMin = 0;
                    max = temperaturas[0];
                    posMax = 0;
                } else if (temperaturas[i] >= max) {
                    max = temperaturas[i];
                    posMax = i;
                } else if (temperaturas[i] <= min) {
                    min = temperaturas[i];
                    posMin = i;
                }
            }
            System.out.println("La temperatura media ha sido: " + suma / 7);
            System.out.println("La temperatura máxima fue el día: " + posMax);
            System.out.println("La temperatura mínima fue el día: " + posMin);
        } while (respuesta == 's' || respuesta == 'S');
    }
}
