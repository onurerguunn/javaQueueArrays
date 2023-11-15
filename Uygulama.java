package kuyrukvideo1;

public class Uygulama {

    public static void main(String[] args) {

        KuyrukYapisi ky = new KuyrukYapisi(5);
        ky.ekle(2);
        ky.ekle(55);
        ky.ekle(23);
        ky.ekle(32);
        ky.ekle(1);
        ky.elemanSayisi();
        ky.cikar();
        ky.sondanYazdir();
        ky.bastanYazdir();

    }

}
