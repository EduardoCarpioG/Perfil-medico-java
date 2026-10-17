public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura;
    private double peso;

    public PerfilMedico(String primerNombre, String apellido, String sexo, 
                        int diaNacimiento, int mesNacimiento, int anioNacimiento, 
                        double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerSexo(String sexo) {
        this.sexo = sexo;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerSexo() {
        return sexo;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public double obtenerAltura() {
        return altura;
    }

    public double obtenerPeso() {
        return peso;
    }

    public int calcularEdad() {
        int anioActual = 2026;
        return anioActual - anioNacimiento;
    }

    public int calcularFrecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
    }

    public String obtenerRangoFrecuenciaCardiacaEsperada() {
        int max = calcularFrecuenciaCardiacaMaxima();
        double minRango = max * 0.50;
        double maxRango = max * 0.85;
        return (int)minRango + " - " + (int)maxRango + " bpm";
    }

    public double calcularBMI() {
        double alturaEnMetros = altura / 100.0;
        return peso / (alturaEnMetros * alturaEnMetros);
    }
}
