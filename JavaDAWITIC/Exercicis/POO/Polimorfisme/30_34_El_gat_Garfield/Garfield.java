class Garfield extends Gat {
    public Garfield() {
        super("Garfield", 9, "estirat");
    }

    @Override
    public String aixecat() {
        if (esDret()) { return "passo de fer res"; }

        if (esAssegut()) {
            setPosicio("dret");
            return "ja m'aixeco";
        }
        return "Bai Maitea, bai";
    }

    @Override
    public String seu() {
        if (esAssegut()) { return "passo de fer res"; }
        setPosicio("assegut");
        return "ja m'assec";
    }

    @Override
    public String estirat() {
        if (esEstirat()) { return "passo de fer res"; }

        if (esAssegut()) {
            setPosicio("estirat");
            return "ja m'estiro";
        }
        return "Bai Maitea, bai";
    }
}
