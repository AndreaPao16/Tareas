1. Definición de hilera de caracteres

    En Java las hileras, conocidas también como cadenas o strings, son secuencias ordenadas de caracteres que se tratan como objetos y su objetivo fundamental es representar texto. Estas son inmutables, es decir, una vez creadas no se puede modificar su contenido. Si se lleva a cabo la "modificación" de una hilera, en realidad se crea un nuevo objeto String.

2. Diferencia entre carácter e hilera 

    Una hilera por su parte corresponde a una lista, o bien, conjunto de caracteres. Mientras que cada caracter es una unidad básica que representa una letra, dígito, o símbolo.

    - Ejemplos: 

        Hilera -> "Informatica"
        Caracteres -> 'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'i', 'c', 'a'

        Hilera -> "Hola"
        Caracteres -> 'H', 'o', 'l', 'a'

    - En Java:

        String hilera = "Hola mundo";
        char caracter = 'a';

3. Operaciones con hileras

    Como fue mencionado en el punto 1, los objetos de tipo String son inmutables y si bien esto puede parecer una limitación, Java proporciona una amplia gama de métodos para manipular hileras sin modificar la original. A continuación, exploraremos algunos de los más importantes.

    1. length()

    Dicho método retorna la longitud exacta de la hilera, en otras palabras, el número de caracteres que contiene. 

    Ejemplo:

        String hilera = "Java";

        System.out.println("Longitud: " + hilera.length());  // Salida: Longitud: 4

    
    2. charAt(int index)

    Devuelve el carácter en una posición específica a lo interno de la hilera. El índice comienza en 0, por lo que el primer carácter se encontrará en tal posición.

    Ejemplo:

        String hilera = "Java";
       
        System.out.println("Caracter en la posición 0: " +  hilera.charAt(0));  // Salida: J


    4. equals(Object object) y equalsIgnoreCase(String anotherString)
    
    El método equals() compara el contenido de dos hileras para verificar si son exactamente iguales. Por otro lado, la versión equalsIgnoreCase() ignora las mayúsculas y minúsculas durante la comparación.

    Ejemplo:

        String hilera1 = "Java";
        String hilera2 = "java";

        boolean sonIguales = hilera1.equals(hilera2);
        boolean sonIgualesIgnorando = hilera1.equalsIgnoreCase(hilera2);

        System.out.println(sonIguales);  // Salida: false
        System.out.println(sonIgualesIgnorando);  // Salida: true


    5. toLowerCase() y toUpperCase()

    Estos métodos se encargan de convertir una hilera de caracteres a mayúsculas o minúsculas en su totalidad.

    Ejemplos:

        String hilera = "Java";
 
        System.out.println(hilera.toLowerCase());  // Salida: java
        System.out.println(hilera.toUpperCase());  // Salida: JAVA


    6. contains(CharSequence s)

    Retorna true si la hilera contiene la secuencia de caracteres especificada, y false en caso contrario.

    Ejemplo

        String hilera = "Hola mundo";
       
        System.out.println(hilera.contains("mundo"));  // Salida: true


    7. indexOf(String cadena)

    indexOf(String cadena) retorna el índice dentro de la hilera donde comienza la primera aparición de la subcadena especificada. Si la subcadena no se encuentra, devuelve -1.

    Ejemplo.

        String hilera = "Java";
        
        System.out.println(hilera.indexOf("v"));  // Salida: 2


4. Lista de referencias 

    Hamer, S. (s.f.). Hileras. [Archivo PDF]. https://sivanahamer.github.io/principios-informatica/presentaciones/12-Hileras.pdf

    Álvarez Caulas, C. (2024). Java String y metodos fundamentales. arquitectura java. https://www.arquitecturajava.com/java-string-y-metodos-fundamentales/

    Aguilera Novoa, S. (s.f.). Cadenas. https://uetitc.github.io/DataStructure-2024-2/Lessons/03-Strings.html

