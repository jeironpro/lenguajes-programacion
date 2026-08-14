class GatRenat extends Gat implements Ensinistrable, AnimalDeCompanyia{
    private String posicio = "estirat";

    public GatRenat() {
        super("Renat");
    }

    public GatRenat(String posicio) {
        super("Renat");
        this.posicio = posicio;
    }

    public String getPosicio() { return this.posicio; }

    @Override
    public boolean esDret() {
        return this.posicio.equals("dret");
    }

    @Override
    public boolean esAssegut() {
        return this.posicio.equals("assegut");
    }

    @Override
    public boolean esEstirat() {
        return this.posicio.equals("estirat");
    }

    @Override
    public String aixecat() {
        if (!esDret()) { 
            this.posicio = "dret";
            return "ja m'aixeco"; 
        }
        return "passo de fer res";
    }

    @Override
    public String seu() {
        if (!esAssegut()) { 
            this.posicio = "assegut";
            return "ja m'assec"; 
        }
        return "passo de fer res";
    }

    @Override
    public String estirat() {
        if (!esEstirat()) { 
            this.posicio = "estirat";
            return "ja m'estiro"; 
        }
        return "passo de fer res";
    }  

    @Override
    public String deixatEstimar() {
        return "em deixo estimar";
    }
}