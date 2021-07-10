package ProyectCalculators;

import javax.swing.JOptionPane;

public class ProyectCalculators {

    public static void main(String[] args) {
        var Flag = true;
        while (Flag == true) {
            String calcuArea = JOptionPane.showInputDialog("""
                                                           MENU - Calculador de operaciones
                                                           -----------------------------------------------
                                                           1. Calculate Area - Rectangle
                                                           2. Calculate Med of sums
                                                           3. Calculate Area - Triangle
                                                           4. Calculate Length & Area of Circun.
                                                           5. Calculate Speed
                                                           6. Calculate Volume of sphere
                                                           7. Given Expresion
                                                           8. Calculate Area cylinder
                                                           9. Find Real Root
                                                           10. Volume Ellipsoid
                                                           11. Call Cost
                                                           12. Convert Km/h to M/s
                                                           13. Discount / Final Price
                                                           14. Convert Centigrade to Fahrenheit
                                                           0. Exit
                                                           """);
            // Area de un rectangulo
            if ("1".equals(calcuArea)) {
                float inputSuma1 = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of Base: "));
                float inputSuma2 = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of Height: "));

                JOptionPane.showMessageDialog(null, "The result of the operation was: " + (inputSuma1 * inputSuma2));
            } 
            // Salir del programa
            else if ("0".equals(calcuArea) || calcuArea == null) {
                Flag = false;
                // Media de varios numeros
            } else if ("2".equals(calcuArea)) {
                var flagMed = true;
                var counMed = 0;
                double sumMed = 0;

                while (flagMed == true) {
                    String opcion = (JOptionPane.showInputDialog("Insert a value, if you want to exit write \"Exit\" \nOr if you want to see the result write\n \"Result\""));
                    if ("Exit".equals(opcion)) {
                        flagMed = false;
                    } else if ("Result".equals(opcion)) {
                        JOptionPane.showMessageDialog(null, "El resultado de la media fue: " + (sumMed / counMed));
                        flagMed = false;
                    } else {
                        double valSum = Float.parseFloat(opcion);
                        sumMed += valSum;
                        counMed = counMed + 1;
                    }

                }

            }
            // Area de un triangulo 
            else if ("3".equals(calcuArea)){
                float trianArea1 = Float.parseFloat(JOptionPane.showInputDialog("Insert the first value"));
                float trianArea2 = Float.parseFloat(JOptionPane.showInputDialog("Insert the second value"));
                
                JOptionPane.showMessageDialog(null, "The result of the Base and Height was: " + ((trianArea1 * trianArea2))/2);                        
            }
            else if ("4".equals(calcuArea)){
                var varPi = 3.1416;
                
                 float valorRadio = Float.parseFloat(JOptionPane.showInputDialog("Write the value of Radius: "));
                 
                 JOptionPane.showMessageDialog(null, "The result of the Lenght was: " + (2*varPi*valorRadio));
                 JOptionPane.showMessageDialog(null, "The result of the circumference was: " + (varPi*Math.pow(valorRadio,2)));
            }
            else if ("5".equals(calcuArea)){
                
                float valorDistancia = Float.parseFloat(JOptionPane.showInputDialog("Write the value of Distance (In meters)"));
                float valorTiempo = Float.parseFloat(JOptionPane.showInputDialog("Write the value of time (In seconds)"));
                
                JOptionPane.showMessageDialog(null, "The result of speed was: " + (valorDistancia / valorTiempo));
                
            }
            else if ("6".equals(calcuArea)){
                var varPi = 3.1416;
                float valorRadio = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of Radius"));
                
                JOptionPane.showMessageDialog(null, "The value obtained from the volume of a sphere is: " + (4/3)*varPi*Math.pow(valorRadio,3));
            }
            else if ("7".equals(calcuArea)){
                
                float varA = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"a\""));
                float varB = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"b\""));
                float varC = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"c\""));
                
                JOptionPane.showMessageDialog(null, "The result of the expresion\n(a+7*c)/(b+2-a)+2*b\nwith the values given was: " + ((varA+7*varC)/(varB+2-varA)+(2*varB)));
                
                
            }
            else if ("8".equals(calcuArea)){
                var varPi = 3.1416;
                
                Float valorRadio = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of Radius"));
                Float valorAltura = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of Height"));
                
                JOptionPane.showMessageDialog(null, "The value obtained from the Area of ​​the cylinder is: " + (2*(varPi*Math.pow(valorRadio,2))+((2*varPi*valorRadio)*valorAltura)));
            }
            else if ("9".equals(calcuArea)){
               Float valorA = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"a\" "));
               Float valorB = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"b\" "));
               Float valorC = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"c\" "));
               
               var x1 = -(valorB)+(Math.sqrt(Math.pow(valorB, 2)- 4*valorA*valorC));
               var x2 = -(valorB)-(Math.sqrt(Math.pow(valorB, 2)- 4*valorA*valorC));
               
               JOptionPane.showMessageDialog(null, "The result of the roots is: " + x1 + " y " + x2);

            }
            else if ("10".equals(calcuArea)){
               var varPi = 3.1416;
               Float valorA = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"a\" "));
               Float valorB = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"b\" "));
               Float valorC = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of \"c\" "));
               
               JOptionPane.showMessageDialog(null, "The volume of the ellipsoid with the given values ​​is: " + ((4/3)*varPi*valorA*valorB*valorC));
            }
            
            else if ("11".equals(calcuArea)){
                
                var montoLlamada = 355;
                var valorIva = 0.2;
                float llamadaMin = Float.parseFloat(JOptionPane.showInputDialog("Insert the minutes of the call"));
                
                var costoLlamada = (llamadaMin * montoLlamada);
                var costoFinal = (costoLlamada)+(costoLlamada*valorIva);
                
                JOptionPane.showMessageDialog(null, "The cost of the call is: " + costoFinal );
            }
            
            else if ("12".equals(calcuArea))
            {
                var preguntaConv = JOptionPane.showConfirmDialog(null, "Does it have the final value in Km/h?\n Yes: If you have, example \"20Km/h\"\nNo: If you have, example \"20km , 3h\"");
                
                if (preguntaConv == JOptionPane.YES_OPTION){
                    
                    float valorVelocidad = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of Km/H"));
                
                    float valorFinal = (valorVelocidad * 1000/1 * 1/3600);
                
                    JOptionPane.showMessageDialog(null, "The result in m/s was: " + valorFinal);
                }
                else if(preguntaConv == JOptionPane.NO_OPTION){
                    float valorKm = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of Km: "));
                    float valorH = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of Hours"));
                    
                    var finalKm = (valorKm * 1000);
                    var finalH = (valorH * 3600);
                    var valorMs = (finalKm / finalH);
                    
                    JOptionPane.showMessageDialog(null, "The result in m/s was: " + valorMs);
                }
            }
            else if("13".equals(calcuArea)){
                float valorProd = Float.parseFloat(JOptionPane.showInputDialog("Insert the value of the products"));
                var descProd = (valorProd * 0.1); 
                JOptionPane.showMessageDialog(null, "The discount was: " + descProd + "\n" +"The final value of the product was: " + (valorProd - descProd));
            }
            else if("14".equals(calcuArea)){
              float valorCen = Float.parseFloat(JOptionPane.showInputDialog("Insert Centigrades to convert: "));
              
              var converFa = ((valorCen*(9/5))+32);
                JOptionPane.showMessageDialog(null, "The result in Fahrenheit was: " + converFa);
            }
            else {
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        }
    }
}
