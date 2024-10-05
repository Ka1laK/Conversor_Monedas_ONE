import com.google.gson.JsonSyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        Conversion consulta = new Conversion();
        Calculos calculos = new Calculos(consulta);
        GeneradorDeHistorial generador = new GeneradorDeHistorial();

        List<String> respuestas = new ArrayList<>();

        String menu = """
                \n***************************************************
                *** Sea bienvenido al Conversor de Monedas  - ONE Next Education***
                
                1) Peso Mexicano ==>> Dólar Estadounidense
                2) Peso Mexicano ==>> Euro
                3) Peso Colombiano ==>> Dólar Estadounidense
                4) Peso Colombiano ==>> Euro
                5) Peso Argentino ==>> Dólar Estadounidense
                6) Peso Argentino ==>> Euro
                7) Real Brasileño ==>> Dólar Estadounidense
                8) Real Brasileño ==>> Euro
                9) Sol Peruano ==>> Dólar Estadounidense
                10) Sol Peruano ==>> Euro
                11) Peso Chileno ==>> Dólar Estadounidense
                12) Peso Chileno ==>> Euro
                
                13) Otra opción de conversión
                
                14) Salir
                ***************************************************
                """;

        while (opcion != 14) {
            try {
                System.out.println(menu);
                System.out.print("Ingrese una opción: ");
                opcion = Integer.parseInt(entrada.next());

                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);

                switch (opcion) {
                    case 1:
                        calculos.almacenarValores("MXN", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 2:
                        calculos.almacenarValores("MXN", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 3:
                        calculos.almacenarValores("COP", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 4:
                        calculos.almacenarValores("COP", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 5:
                        calculos.almacenarValores("ARS", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 6:
                        calculos.almacenarValores("ARS", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 7:
                        calculos.almacenarValores("BRL", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 8:
                        calculos.almacenarValores("BRL", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 9:
                        calculos.almacenarValores("PEN", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 10:
                        calculos.almacenarValores("PEN", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 11:
                        calculos.almacenarValores("CLP", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 12:
                        calculos.almacenarValores("CLP", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        espera();
                        break;
                    case 13:
                        calculos.almacenarValoresPersonalizados();
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 14:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                }
            } catch (JsonSyntaxException | NullPointerException e) {
                System.out.println("Error. Código de moneda Invalida - Intentelo nuevamente.");
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Número invalido - Intentelo nuevamente.");
            }
        }
        generador.guardarJson(respuestas);

        System.out.println("----------> La conversion fue exitosa <----------");



    }



    public static void espera(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Presione Enter para continuar...");
        entrada.nextLine();
    }










}
