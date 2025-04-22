//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimuladorFarmacia m1 = new SimuladorFarmacia();

        System.out.print("medicamento: ");
        m1.nombre = input.nextLine();
        System.out.print("cantidad: ");
        m1.piezas = input.nextInt();
        System.out.print("Precio Unitario: $ ");
        m1.precio = input.nextDouble();

        //calcular el total sin descuento
        m1.totalsindescuento = m1.precio * m1.piezas;
        // descuento supera el total de los $500
        m1.aplicardescuento = m1.totaldescuento>500;
        // asignación del descuento
        m1.descuento = m1.aplicardescuento ? m1.totalsindescuento * 0.15: 0;
        m1.totalsindescuento = m1.totalsindescuento - m1.descuento;
        m1.mostrarInformacion();
    }

}