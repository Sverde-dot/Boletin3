package boletin3;

public class Boletin3 {
        //Marcamos los datos fijos del propio vehiculo
    public static void main(String[] args) {
        Datos consume = new Datos();
        consume.setLitros(50f);
        consume.setPrecioGasolina(1.57f);
        float litro = consume.getLitros(), gas = consume.getPrecioGasolina();
        
        System.out.println("Litros= " + litro + " Preciogas= " + gas);
        
        Datos consumo = new Datos(50f, 8f, 50f, 1.4f);
        //Operamos el consumo medio del vehiculo
        float consumoMed = consumo.consumoMedio();
        System.out.println("El consumo medio del vehiculo es " + consumoMed + "l/km");
        //Operamos el consumo de los litros
        consumo.setLitros(20f);
        float litros = consumo.getLitros();
        System.out.println("Los listros consumidos son=" + litros);
        //Operamos la velocidad media
        float velocidadMedia = consumo.velocidadMedia();
        System.out.println("Este es el velocidad media " + velocidadMedia + "km/h");

    }
;
}