
public class Celular {
    //Atributos
    //Metodos
    private String marca;
    private String color;
    private String modelo;
    private int ram;
    private int capacidad;
    private int tamanio;
    private double saldo;
    private boolean encendido;

    public Celular(String marca, String color, String modelo, int ram, int capacidad, int tamanio, double saldo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.ram = ram;
        this.capacidad = capacidad;
        this.tamanio = tamanio;
        this.saldo = saldo;
        this.encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
      
    public void llamar()
    {
        if(this.encendido)
        {
            if(this.saldo>=10)
            {
                System.out.println("Llamando");
                this.saldo-=10;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else
        {
            System.out.println("Celular apagado");
        }
    }
    
    public void tomarFoto()
    {
        if(this.encendido)
        {
            if(this.capacidad>=3)
            {
                System.out.println("Foto Guardada");
                this.capacidad -= 3;
            }else{
                System.out.println("Espacio insuficiente");
            }
        }else
        {
            System.out.println("Celular apagado");
        }
    }
    
    public void tomarVideo()
    {
        if(this.encendido)
        {
            if(this.capacidad>=8)
            {
                System.out.println("Grabando Video");
                this.capacidad -= 8;
            }else{
                System.out.println("Espacio insuficiente");
            }
        }else
        {
            System.out.println("Celular apagado");
        }
    }

    public void enviarMsg()
    {
        if(this.encendido)
        {
            if(this.saldo>=5)
            {
                System.out.println("Enviando Mensaje");
                this.saldo -= 5;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else
        {
            System.out.println("Celular apagado");
        }
    }
    
    public void encender()
    {
        this.encendido = true;
        System.out.println("Encendiendo");
    }
    
    public void apagar()
    {
        this.encendido = false;
        System.out.println("Apagando");
    }
    
    public void mostrarInformacion()
    {
        System.out.println("Marca: " + this.marca +
                "\nColor: " + this.color +
                "\nModelo: " + this.modelo +
                "\nRam: " + this.ram +
                "\nCapacidad: " + this.capacidad +
                "\nTamanio: " + this.tamanio +
                "\nSaldo: " + this.saldo +
                "\nEncendido: " + this.encendido);
    }
    

}
