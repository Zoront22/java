# ♾️❌❗ Bucles-Atrapar errores.
El ciclo `do-while` es una estructura de control que ejecuta un bloque de codigo y luego comprueba la condicion, para decidir si se repite. <br>

## do-while (Hacer mientras).
Este ciclo es recomendable de usar al momento de la entrada de datos de un usuario, verificando que los datos ingresados por el usuario
sean válidos. **Por ejemplo**: Si el usuario necesita ingresar un tipo de valor específico (digamos, un entero entre 1 y 10), 
usarías un bucle para que el usuario vuelva a ingresar el número si da un valor incorrecto. Si haces esto con un bucle `while`, 
necesitas asignarle a la variable algún valor inicial que cumpla la condición del while (es decir, que sea un valor incorrecto) 
o duplicar el código de entrada del usuario dentro y fuera del bucle. Con un `do-while`, solo necesitas asegurarte de que la variable exista antes del bucle while 
y no necesitas encontrar un valor "incorrecto" inicial.

```java
do {
  // Entrada del usuario, pidiendole un valor del 1 al 10
  System.out.println("Ingrese un numero del 1 al 10: ");
  numero = scanner.nextInt();
} while (numero < 1 || numero > 10)
// Mientras el numero sea menor a 1 ó el numero sea mayor a 10
// pediremos los datos nuevamente
```

Imagina un programa que pide al usuario ingresar una contraseña:
```java
do {
  pedir contraseña al usuario;
} while (contraseña_incorrecta);
```

- Primero, el `do` ejecuta pedir contraseña al usuario.
- Luego, el `while` evalúa si la contraseña es incorrecta.
- Si es incorrecta, el ciclo se repite. Si es correcta, el ciclo termina.

## try-catch (intentar-atrapar).
`try-catcj` es la estructura fundamental para manejar excepciones 
"intentar" (try) un bloque de código que podría fallar y "atrapar" (catch) cualquier error (excepción) que ocurra, 
evitando que el programa se detenga abruptamente y permitiendo una gestión controlada del error.

```java
try {
  // bloque try

  System.out.print("Ingrese un valor entero:");
  num = teclado.nextInt();
  int cuadrado = num * num;
  System.out.print("El cuadrado de " + num + " es " + cuadrado);

  // cachamos el parametro que produce la excepcion
} catch (Exception e) {
  // output en caso de excepcion
  System.out.println("Debe ingresar obligatoriamente un número entero.");
}
```
> Para atrapar las excepciones debemos encerrar en un bloque try las instrucciones que generan excepciones.
> 
> catch se indica entre paréntesis el nombre de un parámetro cualquiera (e) y el nombre de la excepción a capturar.

Asi si el usuario introduce un numero entero, el output sera `El cuadrado de " + num + " es " + cuadrado` <br>
Si el usuario ingres un valor no permitido, el output será `Debe ingresar obligatoriamente un número entero.`
