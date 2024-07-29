public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaRapida());
        gps.calcularRuta("Dirección A", "Dirección B");

        gps.setRutaStrategy(new RutaCorta());
        gps.calcularRuta("Dirección A", "Dirección B");

        
        gps.setRutaStrategy(new RutaEconomica());
        gps.calcularRuta("Dirección A", "Dirección B");
    }
}