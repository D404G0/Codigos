class vehiculo{
    String marca, modelo;
    int año;

    public vehiculo(){
        this.marca = "Tesla";
        this.modelo = "Cybertruck";
        this.año = 2024;
    }

    public vehiculo(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrar(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
