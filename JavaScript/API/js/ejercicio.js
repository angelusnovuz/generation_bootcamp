const url = "https://api.thecatapi.com/v1/images/search";
const imagen = document.getElementById('imagenGatito');
const btn = document.getElementById('btn');


// FUNCION ASYNC

btn.addEventListener('click', obtenerGatito())
async function obtenerGatito(){
    // Esperar a que se haga la petición
    const inforGatitos = await fetch(url);
    // Esperamos ya que el metodo JSON es asincrono
    const gatito = await inforGatitos.json();
    // Asignamos el link de la imagen al atributo src
    imagen.src = gatito[0].url;
}

obtenerGatito();
