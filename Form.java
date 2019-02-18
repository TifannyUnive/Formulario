package form;
import javax.swing.JOptionPane; 

public class Form {

    public static void main(String[] args) {
       int opc, op;
       double area,volumen,daUno,daDos,Datres,perimetro,radio;
       do{
       JOptionPane.showMessageDialog(null, "Hola :D  \n");
       JOptionPane.showMessageDialog(null,"Bienvenido al formalario de figuras de geometria\n que deseas hacer?");
       
       opc=Integer.parseInt (JOptionPane.showInputDialog 
                ("home\n" +
                "Elige una opcion\n" +
                "1)Area \n" +
                "2) Volumen \n"));
       if(opc==1)
 {
     op= Integer.parseInt (JOptionPane.showInputDialog 
                ("1)Circulo \n" +
                "2) Triangulo \n" +
                "3) Rectangulo \n" +
                "\n 4)Salir\n:" +
                "Elige una opcion"));
     switch (op)
           {
                   case 1:
                       daUno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa el radio:"));
                       area = 2*3.1416*daUno;
                       JOptionPane.showInputDialog(null,"El es: " +area);
                    break;
                   case 2:
                       daUno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la base:"));
                       daDos=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la altura:"));
                       area=daUno*daDos/2;
                       JOptionPane.showInputDialog(null,"El  resultado es: " +area);
                        break;
                   case 3:
                       daUno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la base:"));
                       daDos=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la altura:"));
                       area=daUno*daDos;
                       JOptionPane.showInputDialog(null,"El es resultado : " +area);
                       break;
                   case 4:   
                       System.exit(0);
                        JOptionPane.showInputDialog(null,"the end " );
                       break;  }
                    
           
 
 }
 else
     if(opc==2)
 {
     op=Integer.parseInt (JOptionPane.showInputDialog 
                ("Volumenes\n" +
                        
                "1)Piramide\n" +
                "2)Cilindro\n" +
                "3) Salir \n" +
                 "Elige una opciÃ³n\n"));
      switch (op)
           {
                   case 1:
                       daUno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa el base:"));
                        daDos=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la altura:"));
                       volumen = 1/2*daUno*daDos;
                       JOptionPane.showInputDialog(null,"El es: " +volumen);
                    break;
                   case 2:
                       daUno=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa el radio:"));
                        daDos=Double.parseDouble(JOptionPane.showInputDialog
                              ("Ingresa la altura:"));
                            volumen=3.1416*daUno*daDos;
                       case 3:   
                       System.exit(0);
                        JOptionPane.showInputDialog(null,"Ya estas fuera " );
                       break;  }
                    
         }
       }
 
 while(opc!=3);
               

 System.exit(0);
 
 

       
        
    }
    
}
