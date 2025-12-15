public class Main {
    public static void main(String[] args) throws Exception {
        
        byte diaSemana = 0;

        switch (diaSemana) {
            case 1, 7 -> System.out.println("Fim de semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> throw new IllegalArgumentException("Dia inválido: " + diaSemana);
        }
    }
}
