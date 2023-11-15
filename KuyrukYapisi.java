package kuyrukvideo1;

public class KuyrukYapisi {

    int dizi[];
    int size;
    int bas;
    int son;

    public KuyrukYapisi(int size) {
        this.size = size;
        dizi = new int[size];  // Kuyruk Yapımızdır.
        bas = 0;
        son = -1;
    }

    void ekle(int data) {
        if (isFull()) {
            System.out.println("Kuyruk yapısı doludur.Ekleme yapılamaz.");
        } else {
            son++;
            dizi[son] = data;
            System.out.println("Eklendi : " + dizi[son]);
        }
    }

    void cikar() {
        if (isEmpty()) {
            System.out.println("Kuyruk boş. Silinecek eleman yok.");
        } else {
            int sayi = dizi[bas];
            for (int i = 1; i <= son; i++) {
                dizi[i - 1] = dizi[i];
            }
            son--;
            System.out.println("Çıkarıldı : " + sayi);
        }
    }

    boolean isFull() {
        return (son == size - 1);
    }

    boolean isEmpty() {
        return (son == -1);  // Yani en başta verdiğimiz -1 default değerinde ise..
    }

    void elemanSayisi() {
        System.out.println("Kuyruktaki eleman sayısı : " + (son + 1));
    }

    void sondanYazdir() {
        int i = son;
        System.out.println("Sondan yazdırılıyor");
        while (i >= 0) {
            System.out.print(dizi[i]+" -> ");
            i--;
        }
        System.out.println("");

    }

    void bastanYazdir() {
        int i = bas;
        System.out.println("Baştan yazdırıldı");
        while (i <= son) {
            System.out.print(dizi[i]+" -> ");
            i++;
        }

    }
}
