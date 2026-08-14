public class GatRenat extends Gat {
    public boolean esViu() {
        if (getVides() > 0) { return true; }
        return false;
    }

    public boolean esDret() {
        if (getPosicio().equals("dret")) { return true; }
        return false;
    }

    public boolean esAssegut() {
        if (getPosicio().equals("assegut")) { return true; }
        return false;
    }

    public boolean esEstirat() {
        if (getPosicio().equals("estirat")) { return true; }
        return false;
    }

    public String aixecat() {
        if (esDret()) { return "passo de fer res"; }
        setPosicio("dret");
        return "ja m'aixeco";
    }

    public String seu() {
        if (esAssegut()) { return "passo de fer res"; }
        setPosicio("assegut");
        return "ja m'assec";
    }

    public String estirat() {
        if (esEstirat()) { return "passo de fer res"; }
        setPosicio("estirat");
        return "ja m'estiro";
    }
}