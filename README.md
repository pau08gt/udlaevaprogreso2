# Taller Evaluación: Cola con Prioridad en Ciberseguridad

## Contexto

Una empresa desea fortalecer la seguridad de acceso a sus sistemas internos. Actualmente se registran intentos de acceso de usuarios, pero no todos representan el mismo nivel de riesgo.

El equipo de seguridad necesita un sistema que gestione estos registros mediante una **cola con prioridad**, para atender primero los accesos más riesgosos.

## Objetivo

Desarrollar una solución en Java que utilice `PriorityQueue` para registrar, priorizar y atender intentos de acceso sospechosos.

## Reglas de prioridad

La atención debe realizarse en este orden:

1. `CRITICO`
2. `ALTO`
3. `MEDIO`
4. `BAJO`

Si dos accesos tienen la misma prioridad, debe atenderse primero el que tenga más intentos fallidos.

## Clase `IntentoAcceso`

Debe tener:

```java
private String usuario;
private String contrasena;
private int intentosFallidos;
private String riesgo;
private boolean bloqueado;
```

Debe incluir constructor, getters, setters y `toString()`.

## Clase `GestorAccesosPrioridad`

Debe usar internamente:

```java
PriorityQueue<IntentoAcceso>
```

## Métodos obligatorios

### 1. `esContrasenaSegura(String contrasena)`

Una contraseña segura debe cumplir:

- Al menos 8 caracteres.
- Al menos una mayúscula.
- Al menos una minúscula.
- Al menos un número.
- Al menos un carácter especial.

### 2. `calcularRiesgo(IntentoAcceso intento)`

Reglas:

- Si el intento es `null`, retorna `BAJO`.
- Si el usuario está bloqueado, retorna `CRITICO`.
- Si tiene 5 o más intentos fallidos, retorna `CRITICO`.
- Si tiene 3 o 4 intentos fallidos, retorna `ALTO`.
- Si tiene 1 o 2 intentos fallidos y contraseña débil, retorna `MEDIO`.
- Si tiene 1 o 2 intentos fallidos y contraseña segura, retorna `BAJO`.
- Si tiene 0 intentos fallidos y contraseña débil, retorna `MEDIO`.
- Si tiene 0 intentos fallidos y contraseña segura, retorna `BAJO`.

### 3. `registrarIntento(IntentoAcceso intento)`

Reglas:

- No acepta intentos `null`.
- No acepta usuarios nulos o vacíos.
- No acepta contraseñas nulas o vacías.
- No acepta usuarios duplicados.
- Antes de registrar, calcula y asigna el riesgo.
- Si el riesgo es `CRITICO`, marca el intento como bloqueado.
- Retorna `true` si registra correctamente.
- Retorna `false` si no registra.

### 4. `existeUsuario(String usuario)`

Verifica si ya existe un usuario registrado.

### 5. `consultarSiguienteRiesgo()`

Consulta el intento de mayor riesgo sin eliminarlo.

### 6. `atenderSiguienteRiesgo()`

Elimina y retorna el intento de mayor riesgo.

### 7. `contarIntentosPendientes()`

Retorna la cantidad de intentos pendientes.

### 8. `listarIntentosOrdenados()`

Retorna todos los intentos ordenados por prioridad sin modificar la cola original.

## Interfaz gráfica Swing

Debe crear:

```java
ec.edu.taller.InterfazAccesosPrioridad
```

Debe incluir obligatoriamente:

- `JLabel`
- `JTextField`
- `JComboBox`
- `JTextArea`
- `JList`
- `JButton`

## Ejecución

```bash
mvn test
```

```bash
mvn exec:java
```
