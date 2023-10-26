/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casomain;

/**
 *
 * @author garci
 */
public enum Meses {
    Enero(1),
    Febrero(2),
    Marzo(3),
    Abril(4),
    Mayo(5),
    Junio(6),
    Julio(7),
    Agosto(8),
    Septiembre(9),
    Octubre(10),
    Noviembre(11),
    Diciembre(12);

    private int numero;

    Meses(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public static Meses obtenerMesPorNumero(int numero) {
        for (Meses mes : values()) {
            if (mes.getNumero() == numero) {
                return mes;
            }
        }
        return null; // Manejo de error si el número no coincide con ningún mes
    }
}
