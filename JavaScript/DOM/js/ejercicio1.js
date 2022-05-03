const $boton = document.getElementById('jsstyle'); 
const $parr = document.getElementById('text'); 
$boton.addEventListener('click', (e) => { 
    $parr.style.fontFamily ='courier new'; 
    $parr.style.fontSize ='150px'; 
    $parr.style.color ='red'; 
}) 