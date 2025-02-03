import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        // runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();

        boolean result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);

        result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);

        System.out.println("---------------------");

        empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Andres", "Senior"));

        System.out.println(empleadoContoller.getEmpleadoById(2));

        empleadoContoller.displayEmpleados();
        System.out.println("---------------------");
        empleadoContoller.displayEmpleadosSoloNombres();
        System.out.println("---------------------");
        empleadoContoller.displayLlaves();
        System.out.println("---------------------");
        empleadoContoller.displayEmpleadosValues();

    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        // -------------------------------------------------------------------------------
        // EJERCICIO #1
        System.out.println("Ejercicio 1:\n");
        String str1 = "listen", str2 = "silent";
        System.out.println("Input: str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");
        System.out.println("Output: " + Ejercicios.areAnagramsEje1(str1, str2));

        System.out.println("--------------------");

        str1 = "hello";
        str2 = "bello";
        System.out.println("Input: str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");
        System.out.println("Output: " + Ejercicios.areAnagramsEje1(str1, str2));

        System.out.println("--------------------");

        str1 = "triangle";
        str2 = "integral";
        System.out.println("Input: str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");
        System.out.println("Output: " + Ejercicios.areAnagramsEje1(str1, str2));
        System.out.println("----------------------------");
        // -------------------------------------------------------------------------------
        // EJERCICIO #2

        System.out.println("Ejercicio 2:\n");
        int[] nums = { 9, 2, 3, 6 };
        int objetivo = 5;
        System.out.print("Input: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + (i < nums.length - 1 ? "," : ""));
        }
        System.out.println(", objetivo = " + objetivo);

        int[] resultado = Ejercicios.sumatoriaDeDos(nums, objetivo);
        System.out.print("Output: ");
        if (resultado != null) {
            System.out.println(resultado[0] + "," + resultado[1]);
        } else {
            System.out.println("null");
        }

        System.out.println("--------------------");

        objetivo = 10;
        System.out.print("Input: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + (i < nums.length - 1 ? "," : ""));
        }
        System.out.println(", objetivo = " + objetivo);

        resultado = Ejercicios.sumatoriaDeDos(nums, objetivo);
        System.out.print("Output: ");
        if (resultado != null) {
            System.out.println(resultado[0] + "," + resultado[1]);
        } else {
            System.out.println("null");
        }
    }
}
