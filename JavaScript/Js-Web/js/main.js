// SELCTORES


// Solo puedes seleccionar mediante ID
// Regresa solamente el primer elemento con el ID
const parrafo = document.getElementById("parrafo");
console.log(parrafo);

// Puedes seleccionar mediante tags, clases o id´s
//Regresa solamente el primer elemento que concide
const titulo = document.querySelector("h1");
console.log(titulo);

// Seleccionar elemento por atributo
const tituloAtributo = document.querySelector("[]");
console.log(tituloAtributo);

// Nos genera una lista con todos los elementos que cumplen
// No es un arreglo por lo que no podemos utilizar todos los metodos
const parrafos = document.querySelectorAll("p");
console.log(parrafos);
console.log(parrafos[1]);
console.log(parrafos.length);


// Podemos seleccionar elementos dentro de otra etiqueta
// indicamos la etiqueta-padre espcaio-etiqueta hija
const titulos = document.querySelectorAll('div h1');
console.log(titulos);