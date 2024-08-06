# Trabajo Final - SOLID

## Clase 9 - Introduccion a Java

---

1.  Single Responsability Principle (SRP)

El principio de responsabilidad única defiende que una clase debería tener una sola razón para cambiar.

```java
public class ReportGenerator {

    public void generatePDFReport() {
        // Logica para generar un reporte PDF
    }

    public void generateCSVReport() {
        // Logica para generar un reporte CSV
    }

    public void sendEmail() {
        // Logica para enviar un email
    }

}
```

1.1 Por que este ejemplo viola el SRP?

Este ejemplo viola el SRP por que la clase ReportGenerator tiene tres responsabilidades diferentes y por ende tres razones de cambio.

1.2 Como se podria solucionar?

Para arreglar el ejemplo se podría modularizar la clase ReportGenerator para que esta solo tenga una razón de cambio.

**Solución 1**

```java
// Clase PDFReportGenerator: Responsabilidad única generar un reporte en pdf
public class PDFReportGenerator {

    public void generatePDFReport() {
        // ... lógica
    }

}

// Clase CSVReportGenerator: Responsabilidad única generar un reporte en CSV
public class CSVReportGenerator {

    public void generateCSVReport() {
        // ... lógica
    }

}

// Clase EmailSender: Responsabilidad única enviar correos electrónicos
public class EmailSender {

    public void sendEmail() {
        // ... lógica
    }

}
```

**Solución 2**

```java
// Clase Report: Responsabilidad única administrar los datos del reporte
public class Report {

    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}

// Clase ReportGenerator: Responsabilidad única generar un reporte
public class ReportGenerator {

    public void generateReport(Report report) {
        // ... lógica
    }

}

// Clase ReportGeneratorPDF: Responsabilidad única generar un reporte en pdf
public class ReportGeneratorPDF {

    public void generatePDFReport(Report report) {
        // ... lógica
    }

}

// Clase ReportGeneratorCSV: Responsabilidad única generar un reporte en csv
public class ReportGeneratorCSV {

    public void generateCSVReport(Report report) {
        // ... lógica
    }

}

// Clase EmailSender: Responsabilidad única enviar correos electrónicos
public class EmailSender {

    public void sendEmail() {
        // ... lógica
    }

}
```

---

2. Open-Closed Principle (OCP)

El principio abierto-cerrado sugiere que las entidades de software deben estar abiertas a la extensión, pero cerras a la modificación.

```java
public class PaymentProcessor {

    public void processPayment(Payment payment) {
        if (payment instanceof CreditCardPayment) {
            // Proceso de pago con tarjeta de crédito
        } else if (payment instanceof PayPalPayment) {
            // Proceso de pago con PayPal
        }
        // ... más tipos de pago
    }

}
```

2.1 Por que este ejemplo viola el OCP?

Este ejemplo viola el principio de OCP porque si se quiere agregar un nuevo medio de pago, debe modificarse el código existente, arriesgando la introducción de bugs en un código previamente funcional.

El ejemplo está abierto a modificaciones en el código existente, agregando más métodos de pagos en forma de else if y por lo tanto modificando la clase.

Deberíamos poder agregar más métodos de pago sin tocar el código existente.

2.2 Como se podría solucionar?

Rediseñar el código para permitir una fácil extensión del código sin modificar el existente.

Podemos solucionar este problema haciendo nuestro código más flexible y adaptable a los cambios. Podemos usar la abstracción creando una interfaz Payment e implementando diferentes clases para cada forma como se indica a continuación:

**Solución**

```java
// Interfaz para pagos
public interface Payment {

    void process();

}

// Implementación para pago con tarjeta de crédito
public class CreditCardPayment implements Payment {

    @Override
    public void process() {
        // Proceso de pago con tarjeta de crédito
    }

}

// Implementación para pago con PayPal
public class PayPalPayment implements Payment {

    @Override
    public void process() {
        // Proceso de pago con PayPal
    }

}

// Implementación para pago con transferencia bancaria
public class TransferBankPayment implements Payment {

    @Override
    public void process() {
        // Proceso de pago con transferencia
    }

}

// Implementación para pagos con Bitcoin
public class BitcoinPayment implements Payment {

    @Override
    public void process() {
        // Proceso de pago con bitcoin
    }

}

// Clase que procesa los pagos
public class PaymentProcessor {

    public void processPayment(Payment payment) {
        payment.process();
    }

}
```

---

3. Liskov Substitution Principle (LSP)

El principio de sustitución de Liskov enfatiza que objetos de una subclase deberían ser sustituibles por objetos de su superclase sin afectar su correcto funcionamiento.

```java
public class Rectangle {

    protected int width;
    protected int heigth;

    public void setWidth(int witdh) {
        this.witdh = witdh;
    }

    public void setHeigth(int height) {
        this.heigth = height;
    }

    public int calculateArea() {
        return width * heigth;
    }

}

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.heigth = width;
    }

    @Override
    public void setHeigth(int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

}
```

3.1 Por que este ejemplo viola el LSP?

La implementación de Square rompe la expectativa de que los métodos setWidth y setHeight funcionen de manera independiente y lógica, como lo hacen en Rectangle.

En la clase Square, al establecer el ancho, también se establece la altura, y viceversa. Esto significa que un cuadrado no puede tener diferentes valores de ancho y alto, lo que es una violación de la expectativa de que un Rectangle pueda tener valores diferentes para ancho y alto.

Los métodos setWidth y setHeight en Square no siguen el comportamiento esperado que tienen en Rectangle, lo cual puede llevar a resultados inesperados cuando se usa Square en lugar de Rectangle.

3.2 Como se podría solucionar?

Una forma de solucionar el código seria creando una interfaz de Forma donde tenga un método para calcular su área.

Esto sería útil si hay que añadir más formas que solo rectángulo y cuadrado.

```java
// Interfaz para las formas
public interface Shape {

    double calculateArea();

}

// Clase Rectangle
public class Rectangle implements Shape {

    private double width;
    private double heigth;

    public void setWidth(double witdh) {
        this.witdh = witdh;
    }

    public void setHeigth(double height) {
        this.heigth = height;
    }

    @Override
    public double calculateArea() {
        return width * heigth;
    }

}

// Clase Square
public class Square implements Shape {

    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

}
```

---

4. Interface segregation principle (ISP)

El principio de segregación de interfaz recomienda crear interfaces más pequeñas y enfocadas en lugar de grandes.

```java
public interface Document {

    void create();
    void edit();
    void save();
    void print();

}

public class TextDocument implements Document {
    // ... implementa todos los métodos
}

public class PDFDocument implements Document {
    // ... implementa todos los métodos excepto edit()
}
```

4.1 Cual es el problema en este caso?

La interfaz Document tiene demasiadas funciones, es una interfaz general, cuando sería una buena práctica hacer de interfaces con funciones particulares.

Genera un desperdicio ya que la clase PDFDocument no usa uno de sus métodos, ya que los pdfs no son editables.

4.2 Como se podria solucionar?

Dividir la interfaz Document en múltiples interfaces, una solución rápida, para este caso sería simplemente dividir la interfaz en dos, una que ejecute la creación, el guardado y la impresión de un documento y otra que ejecute la edición de un documento.

Pero la solución más completa seria dividir la interfaz en 4 partes. Por si en un futuro no se necesita de aplicar las tres funciones de la interfaz que se dividió.

```java
public interface CreateDocument {
    void create();
}

public interface EditDocument {
    void edit();
}

public interface SaveDocument {
    void save();
}

public interface PrintDocument {
    void print();
}

public class TextDocument implements CreateDocument, EditDocument, SaveDocument, PrintDocument {

    // Implementa todas sus fuciones
    @Override
    public void create() {
        // ... lógica
    }

    @Override
    public void edit() {
        // ... lógica
    }

    @Override
    public void save() {
        // ... lógica
    }

    @Override
    public void print() {
        // ... lógica
    }

}

public class PDFDocument implements CreateDocument, SaveDocument, PrintDocument {

    // Implementa todos menos edit
    @Override
    public void create() {
        // ... lógica
    }

    @Override
    public void save() {
        // ... lógica
    }

    @Override
    public void print() {
        // ... lógica
    }

}
```

---

5. Dependency inversion principle (DIP)

El principio de inversión de dependencia promueve abstracción y que los módulos de alto nivel no dependan de los módulos de bajo nivel.

```java
public class FileLogger {

    public void log(String message) {
        // Log message to a file
    }

}

public class LogManager {

    private FileLogger fileLogger;

    public LogManager() {
        this.fileLogger = new FileLogger();
    }

    public void logMessage(String message) {
        fileLogger.log(message)
    }

}
```

5.1 Por que este ejemplo viola el DIP?

Porque LogManager depende directamente de FileLogger.

Esto hace que LogManager esté acoplado a una implementación específica de registro en archivo, en lugar de depender de una abstracción.

Además de eso, falta abstracción no hay una interfaz o clase abstracta que defina el contrato para el logging.

LogManager debería depender de una abstracción que defina el comportamiento general del logging, no de la implementación concreta FileLogger.

5.2 Como se podria solucionar?

Una forma de solucionarlo sería introducir una abstracción, una interfaz, que defina el contrato para el logging y hacer que el LogManager dependa de esta abstracción.

```java
public interface Logger {

    void log(String message);

}

public class FileLogger implements Logger {

    @Override
    public void log(String nessage) {
        // ... lógica
    }

}

public class LogManager {

    private Logger logger;

    public LogManager(Logger logger) {
        this.logger = logger;
    }

    public void logMessage(String message) {
        logger.log(message);
    }

}
```

---
