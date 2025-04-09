public class TiposVariaveis {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.canal);
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println(smartTv.ligada);
        smartTv.mudarCanal(25);
        System.out.println(smartTv.canal);




    }
}
