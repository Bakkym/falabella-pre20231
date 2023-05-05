# language: es
Característica: Busqueda de articulos desde el menu


  # Hay un error porque el contenedor de la ventana de suscripciones que sale al entrar a la página está dentro de un shadow-root
  @Manual
  Escenario: Buscar portatiles desde el menu
    Dado que Camilo busca portatiles en el menu
    Cuando Camilo selecciona la opcion portatiles
    Entonces Camilo debe encontrar al menos 1 elemento en la seccion

