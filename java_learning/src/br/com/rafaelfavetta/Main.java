public class Main {
    public static void main(String[] args) throws Exception {
        
        byte diaSemana = 0;

        // switch (diaSemana) {
        //     case 1, 7 -> System.out.println("Fim de semana");
        //     case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
        //     default -> throw new IllegalArgumentException("Dia inválido: " + diaSemana);
        // }

        // while (diaSemana<15) {
        //     System.out.println("Dia da semana: " + ++diaSemana);
        // }

        // do {
        //     System.out.println("Dia da semana: " + ++diaSemana);
        // } while (diaSemana < 20);

        for(diaSemana = 7; diaSemana >= 1; diaSemana--) {
            System.out.println("Dia da semana: " + diaSemana);
        }
    }
}
