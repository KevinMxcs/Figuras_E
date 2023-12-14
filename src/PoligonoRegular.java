public class PoligonoRegular {
    private int lados;
    private double longitudLado;
    private double anguloRad;
    
    
    // Setter para lados
    public void setLados(int lados) {
    this.lados = lados;
    }
    
    // Getter para lados
    public double getLados() {
    return lados;
    }
    
    // Setter para longitudLado
    public void setLongitudLado(double longitudLado) {
    this.longitudLado = longitudLado;
    }
    
    // Getter para longitudLado
    public double getLongitudLado() {
    return longitudLado;
    }
    
    // Setter para anguloRad
    public void setAnguloRad(double anguloRad){
    this.anguloRad = anguloRad;
    }
    // Getter para anguloRad
    public double getAnguloRad() {
    return ( Math.toRadians(180.0 / lados));
    }
    
    public PoligonoRegular(int lados, double longitudLado) {
    if (lados < 3) {
    throw new IllegalArgumentException("Un polígono regular debe tener al menos 3 lados");
    }else{
    this.lados = lados;
    this.longitudLado = longitudLado;
    this.anguloRad = getAnguloRad();
    }
    
    }
    
    
    public double obtenerPerimetro() {
    return lados * longitudLado;
    }
    
    
    public double obtenerAnguloInterior() {
    return (180 * (lados - 2)) / lados;
    }
    
    public double obtenerAnguloExterior() {
    return 360.0 / lados;
    }
    public double obtenerAnguloCentral() {
    return 360.0 / lados;
    }
    
    
    public double obtenerRadio(){
    return longitudLado/(2 * (Math.sin(anguloRad)));
    
    }
    
    public double obtenerApotema(){
    return ( lados / (2 * Math.tan(anguloRad)));
    
    }
    
    public double obtenerSemiperimetro(){
    return ((lados * longitudLado)/2);
    }
    
    public double obtenerVertice(){
    return lados;
    }
    
    }

