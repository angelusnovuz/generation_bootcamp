
// todas las llamdas deben estar al inci del HTML
const parrafo = document.querySelector('p');
const titulo = document.querySelector('h1');
const card = document.querySelector(".card")

// Node Namee
console.log(parrafo);
console.log(titulo);

// text content - modificar texto de un elemento o etiqueta
console.log(parrafo.textContent);
parrafo.textContent += "Hola MUndo";


titulo.textContent = 'Modidicando elementos con JavaScript'
console.log(parrafo.innerHTML);

//inner text - no es recomenbel usarlo


// innerHTML - reemplaza solo lo que hay dentro del elemento seleccionado
parrafo.innerHTML = '<a href="#">ESte es un enlace</a>';


// outerHTML - reemplaza todo el elemento, incluso el que estamos seleccionando
parrafo.innerHTML = '<a href="#">ESte es un enlace</a>';

console.log(document);
// CREAR ELEMNTOS DE HTML

function crearElemento(){
    const img = document.createElement('img');
    img.src = "https://www.purina-latam.com/sites/g/files/auxxlc391/files/styles/social_share_large/public/Que_debes_saber_antes_de_adoptar_un_gatito.jpg?itok=guFplHEU ";
    // apendChild :
    card.appendChild(img);
}

crearElemento();