public class Usuario {
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        final SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual : " + smartTv.canal);
        
        smartTv.mudarCanal(13);

        System.out.println("Canal atual : " + smartTv.canal);

        System.out.println("Volume atual : " + smartTv.volume);

        System.out.println("Tv ligada ?" + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);

    }
}
