import javax.swing.JOptionPane;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo:");

        String textoDia = JOptionPane.showInputDialog("Ingrese el día de nacimiento:");
        int dia = Integer.parseInt(textoDia);

        String textoMes = JOptionPane.showInputDialog("Ingrese el mes de nacimiento:");
        int mes = Integer.parseInt(textoMes);

        String textoAnio = JOptionPane.showInputDialog("Ingrese el año de nacimiento:");
        int anio = Integer.parseInt(textoAnio);

        String textoAltura = JOptionPane.showInputDialog("Ingrese la altura en cm:");
        double altura = Double.parseDouble(textoAltura);

        String textoPeso = JOptionPane.showInputDialog("Ingrese el peso en kg:");
        double peso = Double.parseDouble(textoPeso);

        PerfilMedico paciente = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        String mensaje = "INFORMACION DEL PACIENTE\n";
        mensaje = mensaje + "Nombre: " + paciente.obtenerPrimerNombre() + " " + paciente.obtenerApellido() + "\n";
        mensaje = mensaje + "Sexo: " + paciente.obtenerSexo() + "\n";
        mensaje = mensaje + "Fecha de nacimiento: " + paciente.obtenerDiaNacimiento() + "/" + paciente.obtenerMesNacimiento() + "/" + paciente.obtenerAnioNacimiento() + "\n";
        mensaje = mensaje + "Edad: " + paciente.calcularEdad() + " años\n";
        mensaje = mensaje + "Altura: " + paciente.obtenerAltura() + " cm\n";
        mensaje = mensaje + "Peso: " + paciente.obtenerPeso() + " kg\n\n";

        mensaje = mensaje + "RESULTADOS MEDICOS\n";
        mensaje = mensaje + "Frecuencia cardiaca maxima: " + paciente.calcularFrecuenciaCardiacaMaxima() + " bpm\n";
        mensaje = mensaje + "Rango de frecuencia cardiaca esperada: " + paciente.obtenerRangoFrecuenciaCardiacaEsperada() + "\n";
        mensaje = mensaje + "BMI (Indice de masa corporal): " + paciente.calcularBMI() + "\n\n";

        mensaje = mensaje + "VALORES DE REFERENCIA BMI:\n";
        mensaje = mensaje + "Bajo peso: menos de 18.5\n";
        mensaje = mensaje + "Normal: entre 18.5 y 24.9\n";
        mensaje = mensaje + "Sobrepeso: entre 25 y 29.9\n";
        mensaje = mensaje + "Obeso: 30 o mas";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
