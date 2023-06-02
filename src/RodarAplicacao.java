public class RodarAplicacao {
    // classe de exemplo para rodar a aplicação do carro

    public static void main(String[] args) {

        Carro carro1 = new Carro(); // criação do objeto "carro1" e construtor "new Carro"

        //sets
        carro1.setCor("dourado");
        carro1.setModelo("octane");
        carro1.setCapacidadeTanque(60);

        //gets
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(4.90));

        //sobrecarga
        Carro carro2 = new Carro("branco","Renault",70);// construtor com parametros definidos

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(2.29));


    }
}
