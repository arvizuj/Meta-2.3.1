# Meta-2.3.1
Prueba de concepto realizada en Java para verificar la comunicación entre las clases necesarias identificadas en la propuesta de arquitectura de software. En dicha propuesta también se hace mención de una plataforma, sin embargo, es fundamental tener claro principalmente el funcionamiento entre las clases más básicas del software.

Diagrama de clases:

![Clases2](https://github.com/arvizuj/Meta-2.3.1/assets/104541858/bd7ab89d-7126-468c-a57a-34aa8e7902ba)

Diagrama de dependencias:

![unionClases2](https://github.com/arvizuj/Meta-2.3.1/assets/104541858/8edc8f97-7a94-49a7-9ef5-aba4a22ed5d4)

El código presenta 7 clases, donde dos de ellas son para llevar el control de la interacción de las demás. La clase Control es donde se lleva a cabo la creación y asignación de puestos, mientras que la clase GestorDePuestos es la clase Main, donde se crea un objeto de tipo Control para poder inicializar con las interacciones. 

La creación de los demás objetos depende de cuántos puestos y vendedores se desee crear. Tras crear estos primeros objetos, es posible crear los objetos de clase Producto, Inventario y Visitante para posteriormente hacerlos interactuar entre sí a través de los métodos que posee cada clase.
