package App;
public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor com validação
    public Time(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // SETTERS com validação
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            this.segundo = 0;
        }
    }

    // GETTERS
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Método para visualizar hora no formato 24h
        // Método para visualizar hora no formato 24h
    public String visualizarHoraUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Método para visualizar hora no formato 12h com AM/PM
    public String visualizarHoraAmPm() {
        int horaAmPm = (hora == 0 || hora == 12) ? 12 : hora % 12;
        String periodo = (hora < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", horaAmPm, minuto, segundo, periodo);
    }

    // ✅ Método imprimir personalizado
    public String imprimir() {
        return "Hora atual:\n" +
               "- Universal: " + visualizarHoraUniversal() + "\n" +
               "- AM/PM: " + visualizarHoraAmPm();
    }
}