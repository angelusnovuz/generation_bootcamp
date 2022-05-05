class Persona {
    // CAMPOS
    #id = 0; // Privados
    static #contador = 0; // Campo estatico
    nombre = "";
    edad = "";
    correo = "";

    // CONSTRUCTUR
    constructor(nombre, edad, correo){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.#id = ++Persona.#contador;
    }

    // GETTERS & SETTER
    // se usan como si fueran propiedades de la clase
    get getNombre(){
        return this.nombre;
    }
    set setNombre (nombre){
        this.nombre = nombre;
    }

    get getEdad(){
        return this.edad;
    }
    set setEdad(edad){
        this.edad = edad;
    }

    get getCorreo(){
        return this.correo;
    }
    set setCorreo(correo){
        this.correo = correo;
    }

    // METODOS
    cambiarNombre(){
        this.nombre = nombre;
    }
    
    saludar(){
        let mensaje = `Hola mi nombre es ${this.nombre}`;
        return mensaje;
    }

    // metodo estatico - van a estar disponibles para los objetos pero no son parte de ellos
    static mostrarContador(){
        return Persona.#contador
    }

    }


const persona1 = new Persona ("Angel", 25, "asdas@gmail.com");
const persona2 = new Persona ("Juan", 25, "adqwqw@gmail.com");
const persona3 = new Persona ("Martin", 45, "adadad@gmail.com" )

persona1.setNombre = "Luis";
persona1.setEdad = 25
persona1.setCorreo = "asdasfgggg@gmail.com"
console.log(persona1.getNombre , persona1.getEdad, persona1.getCorreo, persona1.saludar());


console.log(persona1);
console.log(persona2);
console.log(persona3);

