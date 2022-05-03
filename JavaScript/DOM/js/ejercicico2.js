// Ejercicio 2
const $forma = document.getElementById('form1');

$forma.addEventListener('submit', (e) =>{
    e.preventDefault()
    console.log($forma.fname.value)
    console.log($forma.lname.value)
})



//Ejercicio 3

const $boton = document.getElementById('links');

$boton.addEventListener('click', (e) =>{
    const $enlace = document.querySelectorAll('a');
    const numero = $enlace.length;
    alert(`Número de links ${numero}`);
    alert(`Primer enlace ${$enlace[0].href}`);
    alert(`Último enlace ${$enlace[numero-1].href}`);
})

