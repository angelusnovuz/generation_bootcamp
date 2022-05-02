// LA FORMA MAS CORRECTA
const padre = document.querySelector(".padre");

const parr = document.createElement('p');
parr.textContent = "Lorem ipsum";
parr.textContent = "Lorem ipsum";
parr.textContent = "Lorem ipsum";

padre.appendChild(parr);


// LA FORMA MAS RAPIDA
const cuadro = document.querySelector('.cuadro');
cuadro.innerHTML = "";

cuadro.innerHTML = '
                    <a href="#">Este es un enlace</a>
                    <ol>
                        <li>Elemento 1</li>
                        <li>ELemento 2</li>
                        <li>ELemento 3</li>
                    </ol>
                    '


const estaciones = ['Primavera', 'Verano', 'Otoño', 'Invierno'];

const lista = document.createElement('ul');

estaciones.forEach( elemento => {
    const li = document.createElement('li');
    li.textContent = elemento;
    lista.appendChild(li);
})

cuadro.appendChild(lista)



const continentes = ['Primavera', 'Verano', 'Otoño', 'Invierno'];
const ol = document.createElement('o');

continentes.forEach ( continente => { ol.innerHTML = `<li></li>`});

cuadro.appendChild('ol')




