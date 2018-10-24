/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

/**
 *
 * @author mirokshi
 */
public class Domino {

    /**
     * @param args the command line arguments
     */
    public enum Fichas {

        DOBLEBLANCO(0, 0), BLANCOPITO(0, 1), BLANCODOS(0, 2), BLANCOTRES(0, 3), BLANCOCUATRO(0, 4),
        BLANCOCINCO(0, 5), BLANCOSEIS(0, 6), DOBLEPITO(1, 1), PITODOS(1, 2), PITOTRES(1, 3),
        PITOCUATRO(1, 4), PITOCINCO(1, 5), PITOSEIS(1, 6), DOBLEDOS(2, 2), DOSTRES(2, 3),
        DOSCUATRO(2, 4), DOSCINCO(2, 5), DOSSEIS(2, 6), DOBLETRES(3, 3), TRESCUATRO(3, 4),
        TRESCINCO(3, 5), TRESSEIS(3, 6), DOBLECUATRO(4, 4), CUATROCINCO(4, 5), CUATROSEIS(4, 6),
        DOBLECINCO(5, 5), CINCOSEIS(5, 6), DOBLESEIS(6, 6);

        private final int part1;
        private final int part2;

        Fichas(int part1, int part2) {
            this.part1 = part1;
            this.part2 = part2;

        }

        private int part1() {
            return part1;
        }

        private int part2() {
            return part2;
        }

        public static void main(String[] args) {

            for (Fichas f : Fichas.values()) {
                System.out.println("\n");
                System.out.println(f + " -> " + f.part1() + ":" + f.part2());

            }

        }

    }
}
