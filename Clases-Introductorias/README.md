# 💻 Clase introductoria a Java y los fundamentos de programacion.

## 📚🍵 Que es Java.
**Java** es un lenguaje tipado y orientado a objetos.
Su código se compila a un formato intermedio (bytecode)
que la JVM (Java Virtual Machine) puede interpretar en cualquier sistema operativo sin necesidad de recompilarlo.

## 📓 Fundamentos de programacion.
Antes de empezar, tenemos que ver que son los fundamentos de programación y sus conceptos:<br>
<br>
Los **fundamentos de programacion** son principios fundamentales para el pensamiento lógico que nos permiten resolver problemas 👾📊
y escribir código o pseudocodigo (descripción simplificada y legible de un algoritmo) independientemente del lenguaje de programación.

### 🔍 Conceptos clave.
- **Algoritmos**: Es una secuencia de pasos logicos para ejecutar o resolver una tarea.
- **Programa** : Algoritmo expresado en un lenguaje que una computadora puede ejecutar.
- **Pensamiento Computacional (PC)**: Es el pensamiento lógico y la metodoligía para la resolucion de problemas con la ayuda de conceptos informaticos
  (Habilidades para descomponer problemas, reconocer patrones y crear algoritmos).
- **Variables**: Es una caracteristica cuyo valor o cantidad puede cambiar, las variables se representan en un espacio de memoria (bytes).
- **Estructuras de control**: Son comandos **condicionales** `if/else` o **bucles** `for/while` que dirigen el flujo de ejecucion de un programa.
  Siendo las **condicionales** las que permiten la toma de decisiones segun se cumpla o no una condicion y los **bucles** los cuales permiten repetir una tarea o seguir una sentencia.
- **Pseudocódigo y Diagramas de Flujo**: Formas de representar algoritmos antes de escribir código real, representado con lenguaje natural o de manera gráfica.
- **Lenguajes de programación**: Herramientas para traducir algoritmos a codigo binario para darle instrucciones directas a un ordenador.
- **Input y Output (Entrada y Salida)**: **Input** es la entrada de datos que ingresa un usuario, mientras el **Input** es la salida de datos o la muestra de resultados tras la ejecucion de un programa.
> Los fundamentos de la programación implican aprender habilidades que van más allá de solo escribir código; involucra cómo piensas, te acercas y resuelves problemas.

## 📊📚 Tipos de datos y variables en Java
Java es un lenguaje tipado estáticamente, lo que significa:
- Cada variable tiene un tipo de dato definido.
- El compilador verifica que los tipos se usen correctamente antes de ejecutar el programa.
- No puedes usar un tipo de dato de forma incompatible sin convertirlo.
> por ejemplo si declaras una variable de tipo entero (int), solo puedes almacenar números enteros.

Las variables sirven para guardar y recuperar datos, representar valores existentes y asignar unos nuevos. <br>
En Java, para declarar una variable debes especificar su tipo y su nombre:
```java
int numeroEntero = 10;
double numeroDecimales = 3.14;
boolean booleano = true;
char caracter = 'A';
String texto = "Esto es una cadena de texto";
```
- `int`: Almacena números enteros.
- `double`: Almacena números con decimales.
- `boolean`: Almacena `verdadero / true` o `falso / false`.
- `char`: Almacena un caracter.
- `String`: Almacena una cadena de texto.
### Variables en memoria.
En informática, una variable es un fragmento de memoria que almacena un valor modificable. Las variables en memoria son ubicaciones reservadas en la memoria RAM, que ocupan cierta cantidad de `bits`.
| Tipo      | Tamaño (aprox.)         |
| --------- | ----------------------- |
| `byte`    | 8 bits                  |
| `short`   | 16 bits                 |
| `int`     | 32 bits                 |
| `long`    | 64 bits                 |
| `float`   | 32 bits                 |
| `double`  | 64 bits                 |
| `char`    | 16 bits (Unicode)       |
| `boolean` | 1 bit (conceptualmente) |

## 💻 Operadores.
Los **operadores** son símbolos especiales que realizan operaciones sobre uno o mas **operandos**. <br>
Los **operandos** pueden ser variables, valores o expresiones. Los **operadores** permitenrealizar opercaiones aritméticas, relacionales, lógicas, etc.

### Operandos.
Un valor o variable sobre el cual actúa un operador.
```java
int resultado = 20 - 10;
// Los números 20 y 10 son los operandos para el operador de suma(+).

// Tambien los operandos pueden ser variables:
int numeroX = 8;
int numeroY = 6;

resultado = numeroX + numeroY;
```
Cada tipo de operador tiene una función específica y se utiliza en diferentes contextos para lograr ciertos resultados.
### Operadores aritméticos.
Realizan operaciones matemáticas básicas, como suma, resta, multiplicación, división y módulo.
| Operador | Significado    |
| -------- | -------------- |
| `+`      | Suma           |
| `-`      | Resta          |
| `*`      | Multiplicación |
| `/`      | División       |
| `%`      | Módulo (resto) |
### Operadores relacionales.
Comparan valores y devuelven true o false.
| Operador | Significado   |
| -------- | ------------- |
| `==`     | Igual que     |
| `!=`     | Diferente de  |
| `>`      | Mayor que     |
| `<`      | Menor que     |
| `>=`     | Mayor o igual |
| `<=`     | Menor o igual |
### Operadores lógicos.
Los operadores lógicos se usan principalmente en condiciones (`if`, bucles etc.)
| Operador | Significado |
| -------- | ----------- |
| `&&`     | AND lógico  |
| `II`     | OR  lógico  |
| `!`      | Negación    |
