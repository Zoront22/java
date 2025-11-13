import javax.swing.JOptionPane;

public class JuegoAhorcado {
    public static void main(String[] args) {
        // var
        String[] palabrasPosibles = { "manzana", "banana", "naranja", "pera", "uva" };
        int maxErrores = 6;

        JOptionPane.showMessageDialog(null, "¡Bienvenido al juego del Ahorcado!");

        char jugarDeNuevo = 'S';
        while (Character.toUpperCase(jugarDeNuevo) == 'S') {
            String palabraSeleccionada = palabrasPosibles[(int) (Math.random() * palabrasPosibles.length)];
            char[] palabraUsuario = new char[palabraSeleccionada.length()];
            for (int i = 0; i < palabraUsuario.length; i++) {
                palabraUsuario[i] = '_';
            }

            char[] letrasJugadas = new char[26];
            int indiceLetrasJugadas = 0;
            int errores = 0;
            boolean gana = false;

            while (!gana && errores < maxErrores) {
                StringBuilder estado = new StringBuilder();
                for (char c : palabraUsuario) {
                    estado.append(c).append(' ');
                }
                estado.append("\nErrores: ").append(errores).append(" / ").append(maxErrores);

                if (indiceLetrasJugadas > 0) {
                    estado.append("\nLetras jugadas: ");
                    for (int i = 0; i < indiceLetrasJugadas; i++) {
                        estado.append(letrasJugadas[i]).append(' ');
                    }
                }

                String entrada = JOptionPane.showInputDialog(null, estado.toString() + "\n\nIngrese una letra:");
                if (entrada == null) { // usuario canceló
                    jugarDeNuevo = 'N';
                    break;
                }
                entrada = entrada.trim().toLowerCase();
                if (entrada.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese al menos un carácter.");
                    continue;
                }

                char letraIngresada = entrada.charAt(0);
                if (!Character.isLetter(letraIngresada)) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese una letra válida.");
                    continue;
                }

                boolean repetida = false;
                for (int i = 0; i < indiceLetrasJugadas; i++) {
                    if (letrasJugadas[i] == letraIngresada) {
                        repetida = true;
                        break;
                    }
                }
                if (repetida) {
                    JOptionPane.showMessageDialog(null, "Ya jugaste la letra '" + letraIngresada + "'. Intenta otra.");
                    continue;
                }

                // registrar letra
                if (indiceLetrasJugadas < letrasJugadas.length) {
                    letrasJugadas[indiceLetrasJugadas++] = letraIngresada;
                }

                boolean acierto = false;
                for (int i = 0; i < palabraSeleccionada.length(); i++) {
                    if (palabraSeleccionada.charAt(i) == letraIngresada) {
                        palabraUsuario[i] = letraIngresada;
                        acierto = true;
                    }
                }

                if (!acierto) {
                    errores++;
                    JOptionPane.showMessageDialog(null, "La letra '" + letraIngresada + "' no está en la palabra.");
                }

                // comprobar victoria
                gana = true;
                for (char c : palabraUsuario) {
                    if (c == '_') {
                        gana = false;
                        break;
                    }
                }
            }

            if (gana) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste la palabra: " + palabraSeleccionada);
            } else if (Character.toUpperCase(jugarDeNuevo) == 'N') {
                // usuario canceló la entrada
                JOptionPane.showMessageDialog(null, "Juego finalizado. La palabra era: " + palabraSeleccionada);
            } else {
                JOptionPane.showMessageDialog(null, "Has perdido. La palabra era: " + palabraSeleccionada);
            }

            String respuesta = JOptionPane.showInputDialog("¿Desea jugar de nuevo? (S/N)");
            if (respuesta == null || respuesta.trim().isEmpty()) {
                jugarDeNuevo = 'N';
            } else {
                jugarDeNuevo = Character.toUpperCase(respuesta.trim().charAt(0));
            }
        }

        System.out.println("Gracias por jugar. ¡Hasta luego!");
    }
}