# Examen UD4: Optimización y documentación. Mayo 2022
1.  Realiza un clone del repositorio. Las instrucciones están en este README, así como los códigos java (debidamente empaquetados) para trabajar desde Eclipse.  
   
2.  La entrega la harás en este mismo repositorio. Trabajarás con git con los comandos desde **gitBash** y con el flujo de trabajo **GitFlow**. Comienza creando la rama "develop" a partir de la maestra. Trabajarás en ella los cambios del código.


## Issue
3. A continuación aparecen distintos commits. En cualquiera de ellos ha de cerrarse un issue desde el mensaje. 
4. Para ello abre en este repositorio un nuevo issue con el mensaje/descripción adecuado. Debes indicar la **línea del código** a la que afecta. Etiqueta el issue con la **etiqueta** adecuada. Usa las menciones para que me llegue una notificación (**@lmagarin**). Lo cerrarás directamente desde el mensaje del commit.

Issue realizado

## Refactorización
5. Crea la **rama "refactoring"** a partir de la rama "develop". Trabajarás en ella la refactorización

En mi caso la voy a llamar refactoring2
   
6. El nombre del paquete no cumple las buenas prácticas. Nombra el paquete como "com.tus_iniciales.eed.examen.OptimizacionYDocumentacion"

7.  Realiza un commit con el mensaje "refactor: nombre del paquete " 


8.  En la clase EdadErroneaException haz las refactorizaciones que necesites para que el parámetro string se denomine message
   
9.  Realiza un commit con el mensaje "refactor: mensaje de la excepción " 
   
10. En la clase Perro haz las refactorizaciones que necesites para que "GUAUUUUUUUUUU" sea un campo estático de la clase. Deja el nombre propuesto

11. Realiza un commit con el mensaje "refactor: GUAUUUUUUUUUU " 

12. Extrae una superclase "Mascota" a partir de la clase "Perro". Incluye todo lo relacionado con el nombre de la mascota.
13. Añade el diálogo de la refactorización con todo debidamente marcado



14. Realiza un commit con el mensaje "refactor: Mascota "
15. Fusiona la rama "refactoring" en la rama "develop" 

## Documentación
16. Crea la **rama "documentation"** a partir de la rama "develop". Trabajarás en ella la documentación.

17. Escribe los comentarios Javadoc. Recuerda que debes documentar debidamente todos:

- Los paquetes 
- Las clases (incluidas las excepciones)
- Los constructores
- Los atributos
- Los métodos
 
18. Realiza un commit con el mensaje "docs: comentarios javadoc " 
19. En Eclipse, genera la documentación Javadoc en la carpeta **docs**

20. Realiza un commit con el mensaje "docs: documentación javadoc " 

21. Fusiona la rama "documentation" en la rama "develop". 

22. Fusiona la rama "develop" en la rama maestra. 

## GitHub Pages

23. Sube el repositorio a GitHub (Añade aquí la url) y activa el hosting (GitHub Pages)(Añade aquí la url). Selecciona la carpeta docs como inicio

## BitBucket

24. Crea en tu servidor Bitbucket una copia del repositorio actual. Añade aquí la url para que al menos yo pueda verla (mlmagarin@iesgrancapitan.org). El mismo repositorio ha de estar en ambos servidores 
