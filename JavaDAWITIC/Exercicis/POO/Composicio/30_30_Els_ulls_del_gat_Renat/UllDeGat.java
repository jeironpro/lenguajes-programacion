public class UllDeGat {
    private boolean ullObert;

    public UllDeGat() {
        this.ullObert = false;
    }

    public UllDeGat(boolean obert) {
        this.ullObert = obert;
    }

    public void obret() {
        this.ullObert = true;
    }

    public void tancat() {
        this.ullObert = false;
    }

    public boolean esObert() {
        return ullObert;
    }
}
