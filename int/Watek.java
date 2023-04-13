package Zad4;

public class Watek implements Runnable {
    private int poczatek;
    private int koniec;
    private int[] tab;
    private int a;
    private int b;
    long czas;

    public Watek(int poczatek, int koniec, int[] tab) {
        this.poczatek = poczatek;
        this.koniec = koniec;
        this.tab = tab;
        this.czas = 0L;
    }

    public void run() {
        long czasSystemowy = System.currentTimeMillis();
        this.a = 0;

        for(this.b = 500000001; this.poczatek < this.koniec; ++this.poczatek) {
            if (this.tab[this.poczatek] > this.a) {
                this.a = this.tab[this.poczatek];
            }

            if (this.tab[this.poczatek] < this.b) {
                this.b = this.tab[this.poczatek];
            }
        }

        this.czas = System.currentTimeMillis() - czasSystemowy;
    }

    public int getMax() {
        return this.a;
    }

    public int getMin() {
        return this.b;
    }

    public long getCzas() {
        return this.czas;
    }
}
