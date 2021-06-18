
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        //Objeto
        //Se creo una instancia de la clase Celular.
        Celular c1 = new Celular("Samsung","Blanco","gt-510",4000,16000,6,500);

        String menu = "1.-Llamar"
                + "\n2.-EnviarMsg"
                +"\n3.-Encender"
                +"\n4.-Apagar"
                +"\n5.-Tomar foto"
                +"\n6.-Tomar Video"
                +"\n7.-Informacion"
                +"\n8.-Salir";
        Scanner sc = new Scanner(System.in);
        boolean s = true;
        while(s)
        {
            System.out.println(menu);
            int v = sc.nextInt();
            
            switch(v)
            {
                case 1:
                    c1.llamar();
                    break;
                case 2:
                    c1.enviarMsg();
                    break;
                case 3:
                    c1.encender();
                    break;
                case 4:
                    c1.apagar();
                    break;
                case 5:
                    c1.tomarFoto();
                    break;
                case 6:
                    c1.tomarVideo();
                    break;
                case 7:
                    c1.mostrarInformacion();
                    break;
                case 8:
                    s = false;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
                
                
        }
        

    }
    
}
