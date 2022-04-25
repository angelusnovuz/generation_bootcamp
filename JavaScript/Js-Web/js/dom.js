// ALGUNAS COSAS QUE PODEMOS HACER CON EL DOM
// window -pertenece al bom y es lo que hay en pantalla
console.log(window.document);
console.log(document);
console.log(document.head); //regresa el head
console.log (document.body); // regresa el body
console.log(document.documentElement); // regresa todo el html
console.log(document.doctype); // 
console.log(document.characterSet); // codificacion del archivo "UTF-8"
console.log(document.links); // links que estan ligados al hmtl
console.log(document.images); // selecciona todas las img dentro del html
console.log(document.styleSheets); // muestra los documentos css
console.log(document.scripts); // muestra los documentos script

// seleccionar algun texto y lo imprime en consola
console.log(document.getSelection().toString);

// nos sirve para retrasa o establecer el tiempo en que se va a correr cierto codigo
setTimeout(()=> {
    console.log(document.getSelection().toString());
}, 3000); 

document.write('Hola mundo desde document write'); // Agrega el texto al final del documento NO ES BUENA PRACTICA








