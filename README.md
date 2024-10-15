# Padrón de Habitantes

## Autor
Paloma Centenera

## Descripción
Este proyecto es una aplicación de consola para gestionar el padrón de habitantes de una oficina. Permite añadir nuevos habitantes, mostrar la lista de habitantes y guardar la información en un archivo.

## Instrucciones de Instalación
1. **Requisitos previos**:
   - Java Development Kit (JDK) 8 o superior.
   - Un entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse, o NetBeans.

2. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/padron-habitantes.git
   cd padron-habitantes
3. **Compilar el proyecto**:
   javac -d bin src/dominio/*.java src/presentacion/*.java src/aplicacion/*.java

4. **Ejecutar la aplicación**:
   java -cp bin aplicacion.Principal

## Ejemplos de Uso
1. **Añadir un habitante**:
   ?> añadir Juan Perez Garcia
   Habitante añadido correctamente

2. **Mostrar el padrón**:
   ?> mostrar
   Perez Garcia, Juan
   Total de habitantes: 1

3. **Ayuda**:
  ?> ayuda
  opciones: 
 - mostrar 
 - ayuda 
 - añadir <nombre> <apellido1> <apellido2> 
 - salir

##Licencia
   Apache 2.0

##Diagrama UML
!Diagrama UML

