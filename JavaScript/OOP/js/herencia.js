class Pokemon{

    // Campos
    #nombre = "";
    #edad = 0;
    #evolucion = "";
    #tipo = "";

    // Constructor
    constructor(nombre, edad, evolucion, tipo){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion = evolucion;
        this.#tipo = tipo
    }

    // Metodos
    atacar(){
        return console.log(`${this.#nombre}, esta atacando`);
    }

    evolucionar(){
        // operador de cortocircuito
        // false => toma el valor de la izquierda
        // true => toma el valor de la derecha
        let mensaje = "";

        if (this.#evolucion === "") {
            let mensaje = 'No puedo evolucionar';
            console.log(mensaje);
        }else{
            mensaje = `${this.#nombre} ha evolucionado a ${this.#evolucion}`
            this.#nombre = this.#evolucion
        }
        return console.log(mensaje);
    }
}


// const charmander = new Pokemon("Charmander", 2, "Charmeleon", "Fuego");
// const bulbasaur = new Pokemon("Bulbasaur", 2, "Ivisaur", "Planta");

// console.log(charmander.evolucionar());


// CLASE HIJA
class TipoFuego extends Pokemon {

    //ATRIBUTOS
    #tipo = "";

    // CONSTRUCTOR
    constructor(nombre, edad, evolucion){
        super(nombre, edad, evolucion);// constructor de la clase padre
        this.#tipo = "Fuego";
    }
}


const charmander = new TipoFuego('Charmander', 2, "Charmeleon",)
console.log(charmander);