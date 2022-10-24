class Carro {

    public static void main(String[] args) {
        
    
        
        Carro carro1 = new Carro();


        carro1.setCor("Azul");
        carro1.setModelo("BMW M4");
        carro1.setCapacidadeTanque(60);


        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(valorCombustivel = 6.39 ));


        Carro carro2 = new Carro(cor = "Preto ", modelo = "Audi R8 ", capacidadeTanque = "68 ");


        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.totalValorTanque(valorCombustivel = 6.50));

    }

}


